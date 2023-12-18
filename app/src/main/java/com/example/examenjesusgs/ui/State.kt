package com.example.examenjesusgs.ui

data class State(
    val alumno: String="Jesus Gonzalez Silva",
    val loterias: ArrayList<LoteriaTipo> =DataSource.loterias,
    var gano: Boolean=false,
    var nJugadas: Int = 0,
    var gastado: Int=0,
    var ganado: Int = 0

)