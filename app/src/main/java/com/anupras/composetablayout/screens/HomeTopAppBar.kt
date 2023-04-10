package com.anupras.composetablayout.screens

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

/**
 * Created by Anamika Painuly on 10/04/23.
 */

@Composable
fun HomeTopAppBar(
    modifier: Modifier = Modifier,
) {
    // 1
    TopAppBar(
        title = {
            Text(
                text = "Compose Tab Layout"
            )
        },
        // 2
        actions = {
            // 3
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search",
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "Favorite",
                )
            }
            // 4
            IconButton(onClick = {/*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "More",
                )
            }
        },
        modifier = modifier
    )
}