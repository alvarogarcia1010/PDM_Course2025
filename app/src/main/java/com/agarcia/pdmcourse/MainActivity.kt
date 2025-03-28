package com.agarcia.pdmcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.agarcia.pdmcourse.class5_250325_LemonadeApp.LemonadeApp
import com.agarcia.pdmcourse.class6_270325_TipCalculator.TipCalculator
import com.agarcia.pdmcourse.ui.theme.PDMCourseTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      PDMCourseTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
          TipCalculator(
            modifier = Modifier.padding(innerPadding)
          )
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  PDMCourseTheme {
    Greeting("Android")
  }
}