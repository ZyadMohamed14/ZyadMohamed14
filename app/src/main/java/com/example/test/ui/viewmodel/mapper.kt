package com.example.test.ui.viewmodel

import com.example.test.R
import com.example.test.domain.models.PhoneDomainModel

fun PhoneDomainModel.toUiModel()=PhoneDomainModel(phonetype= this.phonetype)


fun mapToBrand(brandType: Char): Int {
    return when (brandType) {

        BrandTypeModel.IPHONE.char -> R.string.iphone
        BrandTypeModel.SAMSUNG.char -> R.string.samsung
        else -> R.string.iphone
    }
}

