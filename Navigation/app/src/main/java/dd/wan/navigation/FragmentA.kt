package dd.wan.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_a.view.*

class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment_a, container, false)

        val controller = findNavController()


        view.goB.setOnClickListener {
            
//            var bundle = Bundle()
//
////            bundle.putSerializable("key",user)
//            bundle.putString("key",view.editText1.text.toString().trim())


            var user: User = User(view.editText1.text.toString().trim()+ " ",21)
            val action = FragmentADirections.actionFragmentAToFragmentB(user)
            controller.navigate(action)
        }

        view.goC.setOnClickListener {
            controller.navigate(R.id.fragmentC)
        }
        view.goGlobal.setOnClickListener {
            val action = NavGraphDirections.actionGlobalHello()
            controller.navigate(action)
        }
        return view
    }
}