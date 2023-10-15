package com.example.test.data.remote

import com.example.test.data.model.PhoneResponse
import retrofit2.http.GET

interface PhoneDataAPi {
    companion object{
        private const val Data_Path="PhoneType"
    }
    @GET(Data_Path)
     fun getPhoneData():PhoneResponse
}