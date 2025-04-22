package com.clasenmateus.ecotrack.data

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
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
    var distanceText by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Distância (em quilômetros):")

        Spacer(modifier = Modifier.width(16.dp))

        TextField(
            value = distanceText,
            onValueChange = { newValue ->
                if (newValue.isBlank() || newValue.all { it.isDigit() }) {
                    distanceText = newValue
                    onDistanceChanged(newValue.toFloatOrNull() ?: 0f)
                }
            },
            label = { Text("Distância") },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Ex: 100") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { /* Ação ao pressionar "Enter" */ }
            )
        )
    }
}

@Preview
@Composable
fun DistanceInputPreview() {

}
