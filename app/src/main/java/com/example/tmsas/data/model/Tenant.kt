package com.example.tmsas.data.model

import java.io.Serializable

data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) : Serializable {
    fun summary(): String {
        return "$name • $phone • KES $rent"
    }
}
