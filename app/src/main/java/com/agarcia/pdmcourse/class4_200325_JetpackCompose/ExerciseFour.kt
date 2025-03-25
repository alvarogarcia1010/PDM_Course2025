package com.agarcia.pdmcourse.class4_200325_JetpackCompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ComposeQuadrantApp(modifier: Modifier = Modifier) {
  Column(modifier.fillMaxSize()) {
    Row(Modifier.weight(1f)) {
      Quadrant(
        title = "Quadrant 1",
        description = "Displays text and follows the recommended Material Design guidelines.",
        modifier = Modifier.weight(1f).background(Color(0xFFEADDFF)),
      )
      Quadrant(
        title = "Quadrant 2",
        description = "Creates a composable that lays out and draws a given Painter class object.",
        modifier = Modifier.weight(1f).background(Color(0xFFD0BCFF)),
      )
    }
    Row(Modifier.weight(1f)) {
      Quadrant(
        title = "Quadrant 3",
        description = "A layout composable that places its children in a horizontal sequence.",
        modifier = Modifier.weight(1f).background(Color(0xFFB7A2FF)),
      )
      Quadrant(
        title = "Quadrant 4",
        description = "A layout composable that places its children in a horizontal sequence.",
        modifier = Modifier.weight(1f).background(Color(0xFF9A8BFF)),
      )
    }
  }
}

@Composable
fun Quadrant(
  title: String,
  description: String,
  modifier: Modifier = Modifier
) {
  Column(
    modifier = modifier.fillMaxSize().padding(16.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text(text= title, modifier = Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold)
    Text(text= description, textAlign = TextAlign.Justify)
  }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
  ComposeQuadrantApp()
}