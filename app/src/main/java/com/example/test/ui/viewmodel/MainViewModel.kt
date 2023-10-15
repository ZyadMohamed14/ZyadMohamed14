package com.example.test.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.domain.usecase.RegisterMobile
import kotlinx.coroutines.launch

class MainViewModel(private val registerMobile: RegisterMobile):ViewModel() {
    private val PhoneData = MutableLiveData<String>()
    val phoneType: LiveData<String> = PhoneData
     
    suspend fun getPhoneData() {
        viewModelScope.launch {
            PhoneData.value= registerMobile.gePhonetData().toUiModel().toString()
        }
    }


    }


