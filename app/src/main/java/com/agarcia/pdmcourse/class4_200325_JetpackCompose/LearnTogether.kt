package com.agarcia.pdmcourse.class4_200325_JetpackCompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.agarcia.pdmcourse.R

@Composable
fun LearnTogether(modifier:Modifier = Modifier) {
  Column(modifier = modifier) {
    Image(
      painter = painterResource(id = R.drawable.bg_compose_background),
      contentDescription = "Compose background",
    )
    Text(
      text = stringResource(id= R.string.learn_together_title),
      modifier = Modifier.padding(16.dp),
      fontSize = 24.sp

    )
    Text(
      text = stringResource(id= R.string.learn_together_title),
      modifier = Modifier.padding(start = 16.dp, end=16.dp),
      textAlign = TextAlign.Justify
    )
    Text(
      text = stringResource(id= R.string.learn_together_body),
      modifier = Modifier.padding(16.dp),
      textAlign = TextAlign.Justify
    )
  }
}

@Preview(showBackground = true)
@Composable
fun LearnTogetherPreview() {
  LearnTogether()
}