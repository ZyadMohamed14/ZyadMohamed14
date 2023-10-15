package com.example.test.data.remote

import com.example.test.data.model.PhoneResponse

class PhoneRemoteDataSource(private  val  api:PhoneDataAPi) {

 fun getPhoneData():PhoneResponse{
    return api.getPhoneData()
}
}