package com.clasenmateus.ecotrack.data

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by Mateus H. Clasen on 20/04/2025.
 */
@Composable
fun DistanceInput(
    distance: Float,
    onDistanceChanged: (Float) -> Unit
) {
    val distance by remember {mutableStateOf("")}
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement  = Arrangement.Center
    ) {
        Text(text = "Insira a distância (em kilômetros):")

        TextField(
            value = distance,
            onValueChange = { it },
            label = { Text("Distância") },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Ex: 100") }
        )
    }
}

@Preview
@Composable
fun DistanceInputPreview() {
    DistanceInput()
}
