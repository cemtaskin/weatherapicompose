package tr.edu.trakya.openweatherapi

import android.util.Log
import androidx.compose.material3.Text
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import tr.edu.trakya.openweatherapi.api.Constants
import tr.edu.trakya.openweatherapi.api.RetrofitInstance

class WeatherViewModel : ViewModel() {

    private val weatherApi = RetrofitInstance.weatherApi

    fun getData (city : String) {
        Log.d("GetData",city)
        viewModelScope.launch {
            var result = weatherApi.getWeather(city,Constants.apiKey)
            Log.d("GetData",result.toString())
        }

    }
}