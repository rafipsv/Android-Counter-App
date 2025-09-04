package com.example.kotlincounterapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlincounterapp.ui.theme.KotlinCounterAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinCounterAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = MaterialTheme.colorScheme.background,
                ) {
                    Counter()
                }
            }
        }
    }
}

@Composable
fun Counter() {
    val currentValue = remember { mutableIntStateOf(0) }
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Current Counter: ${currentValue.intValue}"
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Button(onClick = {
                currentValue.intValue++
            }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(onClick = {
                if(currentValue.intValue>0){
                    currentValue.intValue--
                }
                else{
                    Toast.makeText(context, "Counter cannot be negative", Toast.LENGTH_SHORT).show()
                }

            }) {
                Icon(Icons.Default.Delete, contentDescription = "Delete")
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinCounterAppTheme {
        Counter()
    }
}