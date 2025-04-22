package com.clasenmateus.ecotrack.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clasenmateus.ecotrack.data.DistanceInput
import com.clasenmateus.ecotrack.data.FuelTypeSelector
import com.clasenmateus.ecotrack.data.VehicleTypeSelector
import com.clasenmateus.ecotrack.ui.button.ResultButton
import com.clasenmateus.ecotrack.ui.theme.Background
import com.clasenmateus.ecotrack.ui.theme.Green1
import com.clasenmateus.ecotrack.ui.theme.Green2
import com.clasenmateus.ecotrack.ui.theme.Green3

/**
* Created by Mateus H. Clasen on 19/04/2025.
 */
@Composable
fun FormScreen (
modifier: Modifier = Modifier
){
    val (selectedVehicleType, setSelectedVehicleType) = remember { mutableStateOf("Carro") }
    val vehicleTypes = listOf("Carro", "Moto", "Caminhão", "Ônibus")

    val onVehicleTypeSelected: (String) -> Unit = { type ->
        setSelectedVehicleType(type)

    }
    val (fuelType, setFuelType) = remember { mutableStateOf("Gasolina") }
    val fuelTypes = listOf("Gasolina", "Álcool", "Diesel")
    var distance by remember { mutableStateOf(0f) }

    Column(
        modifier = Modifier.fillMaxSize().background(Background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Colocar o ícone aqui
        //Lembrar de adicionar no projeto a fonte Poppins

        Text("EcoTrack", style = MaterialTheme.typography.headlineLarge, color = Green3, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))

        Text("Calcule a emissão de carbono de seu veículo", style = MaterialTheme.typography.bodyMedium, color = Green1)
        Spacer(modifier = Modifier.height(16.dp))

        VehicleTypeSelector(
            selectedType = selectedVehicleType,
            onTypeSelected = onVehicleTypeSelected,
            vehicleTypes = vehicleTypes
        )
        Spacer(modifier = Modifier.height(8.dp))

        FuelTypeSelector(
            selectedType = fuelType,
            onTypeSelected = setFuelType,
            fuelTypes = fuelTypes
        )
        Spacer(modifier = Modifier.height(8.dp))

        DistanceInput(
            distance = distance,
        onDistanceChanged = { newDistance ->
            distance = newDistance
            // Aqui você pode realizar outras ações, como atualizar o estado da tela
        }
        )
        Spacer(modifier = Modifier.height(16.dp))

        ResultButton {
            // Handle result button click
        }

}
}

@Preview
@Composable
fun FormScreenPreview() {
    FormScreen()
}