package com.agarcia.pdmcourse

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import com.agarcia.pdmcourse.class6y7_270325_TipCalculator.TipCalculator
import com.agarcia.pdmcourse.ui.theme.PDMCourseTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {

  @get:Rule
  val composeRule = createComposeRule()

  @Test
  fun caculate20Percentage() {
    // Paso 1
    val expectedTip = NumberFormat.getCurrencyInstance().format(2)

    composeRule.setContent {
      PDMCourseTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
          TipCalculator(
            modifier = Modifier.padding(innerPadding)
          )
        }
      }
    }

    // Paso 2
    composeRule.onNodeWithText("Bill Amount").performTextClearance()
    composeRule.onNodeWithText("Bill Amount").performTextInput("10")
    composeRule.onNodeWithText("Tip Percentage").performTextClearance()
    composeRule.onNodeWithText("Tip Percentage").performTextInput("20")

    // Paso 3
    composeRule.onNodeWithText("Tip Amount: $expectedTip").assertExists("La regue")
  }
}