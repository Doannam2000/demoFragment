package dd.wan.fragmentkotlin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("aaa","onCreate FragmentBB")
    }

    override fun onStart() {
        super.onStart()
        Log.d("aaa","onStart FragmentBB")
    }

    override fun onResume() {
        super.onResume()
        Log.d("aaa","onResume FragmentBB")
    }

    override fun onPause() {
        super.onPause()
        Log.d("aaa","onPause FragmentBB")
    }

    override fun onStop() {
        super.onStop()
        Log.d("aaa","onStop FragmentBB")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("aaa","onDestroy FragmentBB")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("aaa","onDestroyView FragmentBB")
    }
    override fun onDetach() {
        super.onDetach()
        Log.d("aaa","onDetach FragmentB")
    }

}