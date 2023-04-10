package com.anupras.composetablayout.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Created by Anamika Painuly on 04/04/23.
 */

private enum class TabPage {
    Home,
    About
}

@Composable
fun TabLayout() {
    var tabPage by remember {
        mutableStateOf(TabPage.Home)
    }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    )
    {
        Column() {
            TabHome(
                selectedTabIndex = tabPage.ordinal,
                onSelectedTab = { tabPage = it }
            )
            Column(modifier = Modifier.padding(top = 8.dp)) {
                when (tabPage) {
                    TabPage.Home -> HomeScreen()
                    TabPage.About -> AboutScreen()
                }

            }
        }
    }
}

@Composable
private fun TabHome(selectedTabIndex: Int, onSelectedTab: (TabPage) -> Unit) {
    TabRow(selectedTabIndex = selectedTabIndex,
        backgroundColor = MaterialTheme.colors.onPrimary,
        contentColor = MaterialTheme.colors.primary,
        indicator = {
            TabRowDefaults.Indicator(
                modifier = Modifier
                    .tabIndicatorOffset(it[selectedTabIndex]),
                color = MaterialTheme.colors.secondary,
                height = TabRowDefaults.IndicatorHeight * 1.5F
            )
        }) {
        TabPage.values().forEachIndexed { index, tabPage ->
            Tab(selected = index == selectedTabIndex,
                onClick = { onSelectedTab(tabPage) },
                text = {
                    Text(text = tabPage.name, fontSize = 14.sp)
                })

        }
    }
}
