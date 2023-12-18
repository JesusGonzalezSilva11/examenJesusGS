package com.example.examenjesusgs.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Screen (view: ViewModel = ViewModel()) {
    val state by view.uiState.collectAsState()

    Column {
        Text(
            text = "Bienvenido a apuestas "+state.alumno,
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxWidth()
                .padding(start = 20.dp, top = 50.dp)
        )
        val index=0
        Card {



            Column {
                Text(
                    text = "Nombre: Euromillon",
                    modifier = Modifier
                        .background(Color.Yellow)
                        .padding(20.dp)
                )
                Text(
                    text = "Premio: 120",
                    modifier = Modifier
                        .background(Color.Cyan)
                        .padding(20.dp)
                )
                Button(onClick = { /*TODO*/ }) {
                    Text(
                        text = "Apostar",
                        modifier = Modifier

                    )
                }
            }
        }
        /*Row {
            TextField(value = , onValueChange = )
            TextField(value = , onValueChange = )
        }*/
        val loteria="Euromillon"
        val dinero=50
        Button(onClick = { view.jugada(loteria,dinero) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)) {
            Text(text = "Jugar loteria escrita")
        }
        Column(modifier=Modifier
            .background(Color.Gray)
            .padding(50.dp)
            .fillMaxWidth()) {
            Text(text = "No has jugado ninguna loteria")
            Text(text = "Has jugado "+state.nJugadas+" veces en loteria")
            Text(text = "Has gastado "+state.gastado+" euros en loteria")
            Text(text = "Has ganado "+state.ganado+" euros en loteria")
        }
        Button(onClick = {
            /*composable(route = Vacio) {
                Vacio(Modifier.fillMaxWidth())
            } */},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp)) {
            Text(text = "Cambiar de Pantalla")
        }

    }

}

