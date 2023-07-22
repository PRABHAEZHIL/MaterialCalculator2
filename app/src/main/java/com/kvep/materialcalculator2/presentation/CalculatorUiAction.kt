package com.kvep.materialcalculator2.presentation

import androidx.compose.runtime.Composable
import com.kvep.materialcalculator2.domain.CalculatorAction

data class CalculatorUiAction(
    val text:String?,
    val highlightLevel:HighLightLevel,
    val action: CalculatorAction,
    val content: @Composable ()->Unit={}
)
sealed interface HighLightLevel{
    object Neutral:HighLightLevel
    object SemiHighlighted:HighLightLevel
    object Highlighted:HighLightLevel
    object StronglyHighlighted:HighLightLevel
}