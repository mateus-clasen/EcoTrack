package com.clasenmateus.ecotrack.ui.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clasenmateus.ecotrack.ui.theme.Green2
import com.clasenmateus.ecotrack.ui.theme.Typography

/**
 * Created by Mateus H. Clasen on 19/04/2025.
 */
@Composable
fun PlantButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
){
    Button(
        modifier = modifier.heightIn(min = 56.dp),
        shape = RoundedCornerShape(8.dp),
        contentPadding = ButtonDefaults.ContentPadding,
        colors = ButtonDefaults.buttonColors(containerColor = Green2),
        onClick = onClick
    ) {
        val text = "Plante sua árvore agora"
        Text(text.uppercase(), style = Typography.labelLarge)
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,

            ){

        }
    }

}

@Preview
@Composable
private fun PlantButtonPreview(){
    PlantButton(
        modifier = Modifier.fillMaxWidth()
    ){}
}