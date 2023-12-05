package com.aspcoding.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CategoryScreen() {
    
}

@Composable
fun CategoryItem(category: String) {


    Card(modifier = Modifier
        .padding(10.dp)
        .size(160.dp)
        .clip(RoundedCornerShape(8.dp)),
        border = CardDefaults.outlinedCardBorder(enabled = true),
        elevation = CardDefaults.elevatedCardElevation(4.dp)) {

        Box (modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter){

            Text(text = category,
                fontSize = 18.sp,
                color = Color.Black,
                modifier = Modifier.padding(0.dp,20.dp),
                style = MaterialTheme.typography.bodyMedium)


        }



    }


}