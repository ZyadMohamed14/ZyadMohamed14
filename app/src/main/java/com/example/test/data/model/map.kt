package com.example.test.data.model

import com.example.test.domain.models.PhoneDomainModel

fun PhoneResponse.toDomain()=PhoneDomainModel(phonetype= this.phonetype)
