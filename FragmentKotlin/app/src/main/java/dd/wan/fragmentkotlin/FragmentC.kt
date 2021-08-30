package dd.wan.fragmentkotlin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentC : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("aaa","onCreate FragmentC")
    }

    override fun onStart() {
        super.onStart()
        Log.d("aaa","onStart FragmentC")
    }

    override fun onResume() {
        super.onResume()
        Log.d("aaa","onResume FragmentC")
    }

    override fun onPause() {
        super.onPause()
        Log.d("aaa","onPause FragmentC")
    }

    override fun onStop() {
        super.onStop()
        Log.d("aaa","onStop FragmentC")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("aaa","onDestroy FragmentC")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("aaa","onDestroyView FragmentC")
    }
    override fun onDetach() {
        super.onDetach()
        Log.d("aaa","onDetach FragmentC")
    }

}