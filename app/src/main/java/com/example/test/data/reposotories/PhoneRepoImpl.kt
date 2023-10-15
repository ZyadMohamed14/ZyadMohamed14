package com.example.test.data.reposotories

import com.example.test.data.model.toDomain
import com.example.test.data.remote.PhoneRemoteDataSource
import com.example.test.domain.models.PhoneDomainModel
import com.example.test.domain.repo.PhoneRepo

class PhoneRepoImpl (private val phoneremotedatasource: PhoneRemoteDataSource):PhoneRepo{
    override suspend fun getPhoneData(): PhoneDomainModel {
       return phoneremotedatasource.getPhoneData().toDomain()
    }

}