package com.ics.components.horizontal_slide

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.ListItem
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
fun HorizontalSlide() {
    val itemList = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
    LazyRow {
        items(itemList.size, itemContent = { itemList ->
            Text(
                text = itemList.toString(),
                modifier = Modifier.padding(16.dp),
            )
        })
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IFoodComposeTheme {
        HorizontalSlide()
    }
}