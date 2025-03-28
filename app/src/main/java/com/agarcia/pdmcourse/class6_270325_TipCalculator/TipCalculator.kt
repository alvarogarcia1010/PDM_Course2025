package com.agarcia.pdmcourse.class6_270325_TipCalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.agarcia.pdmcourse.R
import java.text.NumberFormat

@Composable
fun TipCalculator (modifier: Modifier = Modifier) {
  Column(
    modifier = Modifier
      .padding(horizontal = 40.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Text(
      text = stringResource(R.string.calculate_tip),
      modifier = Modifier
        .padding(bottom = 16.dp, top = 40.dp)
        .align(alignment = Alignment.Start)
    )
    NumberEditText()

    Text(
      text = stringResource(R.string.tip_amount, "0.00"),
      style = MaterialTheme.typography.displaySmall
    )
  }
}

private fun calculateTip(amount: Double, tipPercent: Double = 15.0): String {
  val tip = tipPercent / 100 * amount
  return NumberFormat.getCurrencyInstance().format(tip)
}

@Composable
fun NumberEditText () {
  var amount by remember { mutableStateOf("") }
  TextField(
    value = amount,
    onValueChange = { amount = it },
    label = { Text(text = "Amount") },
    modifier = Modifier.fillMaxWidth(),
    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
  )
}

@Preview(showBackground = true)
@Composable
fun TipCalculatorPreview() {
  TipCalculator()
}