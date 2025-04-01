package com.agarcia.pdmcourse

import android.os.Bundle
import android.util.Log
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
import com.agarcia.pdmcourse.class6y7_270325_TipCalculator.TipCalculator
import com.agarcia.pdmcourse.ui.theme.PDMCourseTheme

// Se asigna en tiempo de compilación, no en tiempo de ejecución.
private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    Log.d(TAG, "onCreate Called")
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

  override fun onStart() {
    super.onStart()
    Log.d(TAG, "onStart Called")
  }

  override fun onResume() {
    super.onResume()
    Log.d(TAG, "onResume Called")
  }

  override fun onRestart() {
    super.onRestart()
    Log.d(TAG, "onRestart Called")
  }

  override fun onPause() {
    super.onPause()
    Log.d(TAG, "onPause Called")
  }

  override fun onStop() {
    super.onStop()
    Log.d(TAG, "onStop Called")
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.d(TAG, "onDestroy Called")
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