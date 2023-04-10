package com.ics.components.topbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ics.components.R
import com.ics.components.ui.theme.IFoodComposeTheme

@Composable
fun TopBar(description: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center,
    ) {

        Text(text = description,
            fontFamily = FontFamily(
                Font(R.font.ifood_bold, FontWeight.Bold)
            ),
            style = TextStyle(
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        ))
        Image(
            painter = painterResource(R.drawable.ic_arrow_down_24),
            contentDescription = description
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IFoodComposeTheme {
        TopBar(stringResource(R.string.choose_address))
    }
}