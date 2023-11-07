package com.firstapp.quotesapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.firstapp.quotesapp.models.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick: (quote: Quote)->Unit) {
    LazyColumn(content = {
        items(data) {
            QueoteListItem(quote = it, onClick)
        }
    }

    )
}