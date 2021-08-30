package dd.wan.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentManager.POP_BACK_STACK_INCLUSIVE
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val fragment: FragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addA.setOnClickListener { onClick(addA) }
        addB.setOnClickListener { onClick(addB) }
        addC.setOnClickListener { onClick(addC) }
        replaceA.setOnClickListener { replace("A") }
        replaceB.setOnClickListener { replace("B") }
        replaceC.setOnClickListener { replace("C") }
        removeA.setOnClickListener { remove("A") }
        removeB.setOnClickListener { remove("B") }
        removeC.setOnClickListener { remove("C") }

        back.setOnClickListener {
            supportFragmentManager.popBackStack()
            Log.d("aaa", "------------------------------")
        }
        popA.setOnClickListener {
            supportFragmentManager.popBackStack("a", 0)
            Log.d("aaa", "------------------------------")
        }
    }

    fun onClick(v: View) {
        val fragmentTransaction: FragmentTransaction = fragment.beginTransaction()
        when (v) {
            addA -> {
                fragmentTransaction.add(R.id.fragment, FragmentA(), "fragmentA")
                fragmentTransaction.addToBackStack("a")
                Log.d("aaa", "------------------------------")
            }
            addB -> {
                fragmentTransaction
                    .add(R.id.fragment, FragmentB(), "fragmentB")
                fragmentTransaction.addToBackStack("a")
                Log.d("aaa", "------------------------------")

            }
            addC -> {
                fragmentTransaction.add(R.id.fragment, FragmentC(), "fragmentC")
                fragmentTransaction.addToBackStack("a")
                Log.d("aaa", "------------------------------")

            }
        }
        fragmentTransaction.commit()
    }

    fun replace(string: String) {
        val fragmentTransaction: FragmentTransaction = fragment.beginTransaction()
        when (string) {
            "A" -> {
                fragmentTransaction.replace(R.id.fragment, FragmentA(), "fragmentA")
                fragmentTransaction.addToBackStack("a")
                Log.d("aaa", "------------------------------")
            }
            "B" -> {
                fragmentTransaction.setCustomAnimations(R.anim.enter_left_to_right,R.anim.exit_left_to_right,R.anim.enter_right_to_left,R.anim.enter_right_to_left).replace(R.id.fragment, FragmentB(), "fragmentB")
//                fragmentTransaction.replace(R.id.fragment, FragmentB(), "fragmentB")
                fragmentTransaction.addToBackStack("b")
                Log.d("aaa", "------------------------------")
            }
            "C" -> {
                fragmentTransaction.replace(R.id.fragment, FragmentC(), "fragmentC")
                fragmentTransaction.addToBackStack("c")
                Log.d("aaa", "------------------------------")
            }
        }
        fragmentTransaction.commit()
    }

    fun remove(string: String) {
        val fragmentTransaction: FragmentTransaction = fragment.beginTransaction()
        when (string) {
            "A" -> {
                try {
                    var fragment: FragmentA =
                        supportFragmentManager.findFragmentByTag("fragmentA") as FragmentA
                    fragmentTransaction.remove(fragment)
                } catch (e: Exception) {

                }
                Log.d("aaa", "------------------------------")
            }
            "B" -> {
                try {
                    var fragment: FragmentB =
                        supportFragmentManager.findFragmentByTag("fragmentB") as FragmentB
                    fragmentTransaction.remove(fragment)
                } catch (e: Exception) {

                }
                Log.d("aaa", "------------------------------")
            }
            "C" -> {
                try {
                    var fragment: FragmentC =
                        supportFragmentManager.findFragmentByTag("fragmentC") as FragmentC
                    fragmentTransaction.remove(fragment)
                } catch (e: Exception) {

                }
                Log.d("aaa", "------------------------------")
            }
        }
        fragmentTransaction.commit()
    }

//    override fun onBackPressed() {
//        if (supportFragmentManager.backStackEntryCount > 0)
//            supportFragmentManager.popBackStack()
//        else
//            super.onBackPressed()
//    }
}