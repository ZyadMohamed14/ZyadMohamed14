package com.example.test.domain.repo

import com.example.test.domain.models.PhoneDomainModel

interface PhoneRepo {
suspend fun getPhoneData():PhoneDomainModel
}