package dd.wan.fragment2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_1.*
import kotlinx.android.synthetic.main.fragment_1.view.*


class Fragment1 : Fragment() {

    interface dataTransmission{
        fun sendData(data:String)
    }

    lateinit var dataTrans:dataTransmission
    lateinit var sharedViewModel: ShareViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        dataTrans = context as dataTransmission

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_1, container, false)

        // Truyền dữ liệu bằng interface
        view.comfirm1.setOnClickListener {
            dataTrans.sendData("Truyền dữ liệu từ fragment 1: "+editText1.text.toString().trim())
        }


//          Nhận dữ liệu bằng view model
        sharedViewModel = ViewModelProvider(requireActivity()).get(ShareViewModel::class.java)
        sharedViewModel.dataviewModel.observe(viewLifecycleOwner,  { item -> editText1.setText(item) })


        return view
    }
    fun changeText(text:String)
    {
        textView1.text = text
    }
}