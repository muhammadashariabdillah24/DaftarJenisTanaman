package com.dicoding.daftarjenistanaman

import android.icu.number.ScientificNotation

data class Plant(
    var name: String = "",
    var nameScientific: String = "",
    var kingdom: String = "",
    var comeFrom: String = "",
    var detail: String = "",
    var photo: Int = 0
)