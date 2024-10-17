package br.unitins.ecare.data

import java.util.Date

data class Consultation(
    val doctor: String,
    val speciality: String,
    val data: Date
)