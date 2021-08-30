package dd.wan.fragment2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_1.*
import kotlinx.android.synthetic.main.fragment_1.view.*
import kotlinx.android.synthetic.main.fragment_2.*
import kotlinx.android.synthetic.main.fragment_2.view.*
import java.lang.Exception

class Fragment2 : Fragment() {
    interface dataTransmission2 {
        fun sendData2(data: String)
    }

    lateinit var dataTrans: dataTransmission2

    override fun onAttach(context: Context) {
        super.onAttach(context)
        dataTrans = context as dataTransmission2
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_2, container, false)

        var data = arguments?.getString("data")
        if (data != null) {
            view.textView2.text = data.toString()
        }

        val model:ShareViewModel = ViewModelProvider(requireActivity()).get(ShareViewModel::class.java)

        view.comfirm2.setOnClickListener {
            model.saveData(view.editText2.text.toString().trim())
//            dataTrans.sendData2(
//                "Truyền dữ liệu từ fragment 2: " + editText2.text.toString().trim()
//            )

        }

        return view
    }


}