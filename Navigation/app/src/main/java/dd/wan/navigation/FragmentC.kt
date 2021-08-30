package dd.wan.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_a.view.*
import kotlinx.android.synthetic.main.fragment_c.view.*

class FragmentC : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_c, container, false)
        try {
            val args: FragmentCArgs by navArgs()
            view.textC.text = view.textC.text.toString() + args.hi.toString()
        }catch (e:Exception)
        {

        }
        view.goGlobalc.setOnClickListener {
            val action = NavGraphDirections.actionGlobalHello()
            findNavController().navigate(action)
        }
        return view
    }
}

