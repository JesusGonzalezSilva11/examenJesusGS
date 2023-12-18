package com.example.examenjesusgs.ui

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(State())
    val uiState: StateFlow<State> = _uiState.asStateFlow()

    fun jugada(loteria: String,dinero: Int){
        //val premio=uiState.value.loterias[loteria]
        uiState.value.nJugadas=uiState.value.nJugadas+1
        uiState.value.gastado=uiState.value.gastado+dinero
        val premiado= (1..4).random()
        val jugador=(1..4).random()
        if (premiado.equals(jugador)){
            uiState.value.ganado+dinero
            uiState.value.gano=true
        }else{
            uiState.value.gano=false
        }
    }
}