package com.miempresa.lab09.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.miempresa.lab09.viewmodels.CounterViewModel


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Counter(viewModel: CounterViewModel) {
    Scaffold (
        floatingActionButton = { FloatingFunction(viewModel)},
    )
    {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(
                text = viewModel.counter.value.toString(),
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}

@Composable
fun FloatingFunction(viewModel: CounterViewModel) {
    FloatingActionButton(
        onClick = { viewModel.add()}
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "",
            tint = Color.Blue
        )

    }
}