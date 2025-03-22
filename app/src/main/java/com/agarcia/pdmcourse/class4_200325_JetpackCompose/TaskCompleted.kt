package com.agarcia.pdmcourse.class4_200325_JetpackCompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.agarcia.pdmcourse.R

@Composable
fun TaskCompleted(modifier: Modifier = Modifier) {
  Column(
    modifier = modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Image(
      painter = painterResource(id = R.drawable.ic_task_completed),
      contentDescription = "Task completed",
    )

    Text(
      text="Task completed!",
      fontWeight = FontWeight.Bold
    )

    Text(
      text="Nice work!"
    )
  }
}

@Preview(showBackground = true)
@Composable
fun TaskCompletedPreview() {
  TaskCompleted()
}