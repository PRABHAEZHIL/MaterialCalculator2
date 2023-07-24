package com.kvep.materialcalculator2.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    action: CalculatorUiAction,
    modifier: Modifier =Modifier,
    onClick:()->Unit
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(
                when (action.highlightLevel) {
                    HighLightLevel.Neutral -> MaterialTheme.colorScheme.surfaceVariant
                    HighLightLevel.SemiHighlighted -> MaterialTheme.colorScheme.inverseSurface
                    HighLightLevel.Highlighted -> MaterialTheme.colorScheme.tertiary
                    HighLightLevel.StronglyHighlighted -> MaterialTheme.colorScheme.primary
                }
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        if(action.text != null) {
            Text(
                text = action.text,
                fontSize = 36.sp,
                textAlign = TextAlign.Center,
                color = when(action.highlightLevel) {
                    is HighLightLevel.Neutral -> MaterialTheme.colorScheme.onSurfaceVariant
                    is HighLightLevel.SemiHighlighted -> MaterialTheme.colorScheme.inverseOnSurface
                    is HighLightLevel.Highlighted -> MaterialTheme.colorScheme.onTertiary
                    is HighLightLevel.StronglyHighlighted -> MaterialTheme.colorScheme.onPrimary
                }
            )
        } else {
            action.content()
        }
    }
}