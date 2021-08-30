package dd.wan.fragmentkotlin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentA : Fragment() {

    var dem:Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
        Log.d("aaa","onCreateView FragmentAAA bien dem = $dem")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("aaa","onCreate FragmentAAA")
    }

    override fun onStart() {
        super.onStart()
        Log.d("aaa","onStart FragmentAAA")
    }

    override fun onResume() {
        super.onResume()
        Log.d("aaa","onResume FragmentAAA")
    }

    override fun onPause() {
        super.onPause()
        Log.d("aaa","onPause FragmentAAA")
    }

    override fun onStop() {
        super.onStop()
        Log.d("aaa","onStop FragmentAAA")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("aaa","onDestroy FragmentAAA")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("aaa","onDestroyView FragmentAAA")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("aaa","onDetach FragmentAAA")
    }

}