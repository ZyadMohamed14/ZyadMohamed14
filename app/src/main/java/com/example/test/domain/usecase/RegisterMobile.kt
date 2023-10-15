package com.example.test.domain.usecase

import com.example.test.domain.repo.PhoneRepo

class RegisterMobile(private val phoneRepo:PhoneRepo) {
suspend fun gePhonetData()=phoneRepo.getPhoneData()
}