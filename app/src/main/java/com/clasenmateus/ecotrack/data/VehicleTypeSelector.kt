package com.clasenmateus.ecotrack.data

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by Mateus H. Clasen on 20/04/2025.
 */
@Composable
fun VehicleTypeSelector(
    selectedType: String,
    onTypeSelected: (String) -> Unit,
    vehicleTypes: List<String>
) {
    // Declara um estado mutable para controlar a expansão do menu dropdown
    var expanded by remember { mutableStateOf(false) }

    // Lista de tipos de veículo disponíveis
    val vehicleTypes = listOf("Carro", "Moto", "Caminhão", "Ônibus")

    // Cria um Box que será o container do seletor
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                expanded = !expanded
            } // Torna o Box clicável para expandir/recolher o menu
            .padding(16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        // Cria uma linha com o tipo de veículo selecionado e um ícone de seta
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(selectedType.ifEmpty { "Selecione o tipo de veículo" })
            Icon(
                imageVector = if (expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                contentDescription = null
            )
        }

        // Cria o menu dropdown
        DropdownMenu(
            modifier = Modifier.fillMaxWidth(),
            expanded = expanded, // Controla a visibilidade do menu com base no estado expanded
            onDismissRequest = { expanded = false } // Fecha o menu quando o usuário clica fora dele
        ) {
            // Exibe cada opção de tipo de veículo no menu
            vehicleTypes.forEach { type ->
                DropdownMenuItem(
                    onClick = {
                        onTypeSelected(type) // Chama a função onTypeSelected com o tipo selecionado
                        expanded = false // Fecha o menu após a seleção
                    },
                    text = { Text(type) }
                )

            }
        }
    }
}

@Composable
@Preview
fun VehicleTypeSelectorPreviewLarge() {
    val selectedType by remember { mutableStateOf("") }
    val onTypeSelected: (String) -> Unit = { }

    VehicleTypeSelector(
        selectedType = selectedType,
        onTypeSelected = onTypeSelected,
        vehicleTypes = listOf(
            "Carro", "Moto", "Caminhão", "Ônibus",
            "Trator", "Barco", "Avião", "Bicicleta",
            "Patinete", "Scooter", "Jetski", "Iate"
        )
    )
}