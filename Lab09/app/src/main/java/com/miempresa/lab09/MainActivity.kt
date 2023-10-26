package com.miempresa.lab09

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.miempresa.lab09.ui.theme.Lab09Theme
import com.miempresa.lab09.viewmodels.CounterViewModel
import com.miempresa.lab09.views.Counter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vista: CounterViewModel by viewModels()
        setContent {
            Counter(viewModel = vista)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val testViewModel = CounterViewModel()
    Counter(viewModel = testViewModel)
}