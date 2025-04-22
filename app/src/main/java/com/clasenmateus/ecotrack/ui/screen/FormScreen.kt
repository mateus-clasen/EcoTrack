package com.clasenmateus.ecotrack.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.clasenmateus.ecotrack.data.DistanceInput
import com.clasenmateus.ecotrack.data.FuelTypeSelector
import com.clasenmateus.ecotrack.data.VehicleTypeSelector
import com.clasenmateus.ecotrack.ui.button.ResultButton

/**
* Created by Mateus H. Clasen on 19/04/2025.
 */
@Composable
fun FormScreen (){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("EcoTrack", style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(16.dp))

//        VehicleTypeSelector(vehicleType) { type ->
//            // Update vehicleType state
//        }
//        Spacer(modifier = Modifier.height(8.dp))
//
//        FuelTypeSelector(fuelType) { type ->
//            // Update fuelType state
//        }
        Spacer(modifier = Modifier.height(8.dp))

        //DistanceInput()
        Spacer(modifier = Modifier.height(16.dp))

        ResultButton {
            // Handle result button click
        }

}
}