package br.unitins.ecare.data

import java.util.Date

data class Exam(
    val descricao: String,
    val data: Date,
    val exameRealizado: Boolean
)