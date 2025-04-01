package com.agarcia.pdmcourse.class6y7_270325_TipCalculator

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.agarcia.pdmcourse.R
import java.text.NumberFormat

@Composable
fun TipCalculator (modifier: Modifier = Modifier) {
  var amountInput by rememberSaveable { mutableStateOf("") }
  var tipInput by rememberSaveable { mutableStateOf("15") }

  val amount = amountInput.toDoubleOrNull() ?: 0.0
  val tipPercent = tipInput.toDoubleOrNull() ?: 0.0

  val tip = calculateTip(amount, tipPercent)

  Column(
    modifier = Modifier
      .padding(horizontal = 40.dp)
      .verticalScroll(rememberScrollState()),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Text(
      text = stringResource(R.string.calculate_tip),
      modifier = Modifier
        .padding(bottom = 16.dp, top = 40.dp)
        .align(alignment = Alignment.Start)
    )

    NumberEditText(
      value = amountInput,
      onValueChange = { amountInput = it },
      label = R.string.bill_amount,
      keyboardOptions = KeyboardOptions.Default.copy(
        keyboardType = KeyboardType.Number,
        imeAction = ImeAction.Next
      ),
    )

    Spacer(modifier = Modifier.height(16.dp))

    NumberEditText(
      label = R.string.how_was_the_service,
      value = tipInput,
      onValueChange = { tipInput = it },
      modifier = Modifier.padding(bottom = 32.dp),
    )

    Text(
      text = stringResource(R.string.tip_amount, tip),
      style = MaterialTheme.typography.displaySmall
    )
  }
}

private fun calculateTip(amount: Double, tipPercent: Double = 15.0): String {
  val tip = tipPercent / 100 * amount
  return NumberFormat.getCurrencyInstance().format(tip)
}

@Composable
fun NumberEditText(
  @StringRes label: Int,
  value: String,
  onValueChange: (String) -> Unit,
  modifier: Modifier = Modifier,
  keyboardOptions: KeyboardOptions = KeyboardOptions.Default.copy(
    keyboardType = KeyboardType.Number,
    imeAction = ImeAction.Done
  ),
) {
  TextField(
    value = value,
    onValueChange = onValueChange,
    singleLine = true,
    label = { Text(stringResource(label)) },
    keyboardOptions = keyboardOptions,
    modifier = modifier.fillMaxWidth()
  )
}

@Preview(showBackground = true)
@Composable
fun TipCalculatorPreview() {
  TipCalculator()
}