package com.firstapp.quotesapp.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import com.firstapp.quotesapp.DataManager
import com.firstapp.quotesapp.models.Quote

@Composable
public fun QuoteDetails(quote: Quote) {

    BackHandler {
        DataManager.switchPages(null)
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)



    ) {
        Card (
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier.background(Color.White).padding(10.dp),
            border = BorderStroke(2.dp, Color.Green)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.background(MaterialTheme.colorScheme.primary)
                    .padding(start = 16.dp, top = 24.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.Done,
                    contentDescription = "Quote",
                    modifier = Modifier
                        .size(80.dp),
                        colorFilter= ColorFilter.tint(Color.White)
//                        .rotate(180F)
                )

                Text(
                    text = quote.text,
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.White
                )
                Spacer(Modifier.height(16.dp))
                Box(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.onPrimary)
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                )
                Text(
                    text = quote.author,
                    modifier =Modifier.padding(10.dp),
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.White
                )
            }
        }
    }
}