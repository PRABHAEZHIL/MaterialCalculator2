package com.kvep.materialcalculator2

import android.os.Bundle
import android.provider.SyncStateContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kvep.materialcalculator2.presentation.CalculatorScreen
import com.kvep.materialcalculator2.ui.theme.MaterialCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       Constants.BASE_URL
        setContent {
            MaterialCalculatorTheme {
                // A surface container using the 'background' color from the theme
                CalculatorScreen()
            }
        }
    }
}


