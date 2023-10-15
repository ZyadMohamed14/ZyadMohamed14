package com.example.test.domain.models

import com.example.test.data.model.PhoneResponse

fun PhoneResponse.toPhoneDomainModel()=PhoneDomainModel(phonetype = this.phonetype)
