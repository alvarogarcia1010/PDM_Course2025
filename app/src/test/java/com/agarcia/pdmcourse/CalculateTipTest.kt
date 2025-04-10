package com.agarcia.pdmcourse

import com.agarcia.pdmcourse.class6y7_270325_TipCalculator.calculateTip
import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class CalculateTipTest {

  @Test
  fun calculate20Percentage () {
    // Paso 1:
    val amount = 10.0
    val tipPercentage = 20.0

    val expectedTip = NumberFormat.getCurrencyInstance().format(2)

    // Paso 2
    val actualTip = calculateTip(amount, tipPercentage)

    // Paso 3
    assertEquals(expectedTip, actualTip)
  }

  fun validateStringInput() {

  }
}