package dd.wan.fragment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Fragment1.dataTransmission, Fragment2.dataTransmission2 {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.frag1, Fragment1(), "fragment1").commit()

        supportFragmentManager.beginTransaction().add(R.id.frag2, Fragment2(), "fragment2").commit()



        val model: ShareViewModel = ViewModelProvider(this).get(ShareViewModel::class.java)
        model.dataviewModel.observe(this, Observer { item ->
            editText.setText(item)
        })


        btnSend.setOnClickListener {

            sendData("Truyền dữ liệu từ activity :" + editText.text.toString().trim())
//            sendData2("Truyền dữ liệu từ activity " + editText.text.toString().trim())

            model.saveData(editText.text.toString().trim())
        }



    }

    override fun sendData(data: String) {

        // Truyền từ activity sang fragment 2

        val bundle = Bundle()
        bundle.putString("data", data)
        val fragment2 = Fragment2()
        fragment2.setArguments(bundle)
        supportFragmentManager.beginTransaction().replace(R.id.frag2, fragment2, "fragment2")
            .commit()

//        // Nhận dữ liệu từ fragment
//        textView.text = data
    }

    override fun sendData2(data: String) {
        var fragment1: Fragment1 =
            supportFragmentManager.findFragmentByTag("fragment1") as Fragment1
        fragment1.changeText(data)
    }
}