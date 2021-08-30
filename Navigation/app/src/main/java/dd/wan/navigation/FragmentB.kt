package dd.wan.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_a.view.*
import kotlinx.android.synthetic.main.fragment_b.view.*
import java.lang.Exception


class FragmentB : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_b, container, false)
        val controller = findNavController()


//        var bundle = arguments
//        view.data.text = bundle?.getString("key")

        try {
            val args: FragmentBArgs by navArgs()
            var user: User = args.user
            view.data.text = user.name + " " + user.age
        } catch (e: Exception) {

        }


        view.goGlobalb.setOnClickListener {
            val action = NavGraphDirections.actionGlobalHello()
            controller.navigate(action)
        }

        view.back.setOnClickListener {
            controller.navigateUp()
        }
        return view
    }


}