package tr.edu.trakya.openweatherapi

import android.util.Log
import androidx.compose.material3.Text
import androidx.lifecycle.ViewModel

class WeatherViewModel : ViewModel() {

    fun getData (city : String) {
        Log.d("GetData",city)
    }
}