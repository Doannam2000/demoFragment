package dd.wan.fragment2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShareViewModel : ViewModel() {
    private var dataa = MutableLiveData("Nhập")
    val dataviewModel: LiveData<String> = dataa
    fun saveData(string : String)
    {
        dataa.value = string
    }
}