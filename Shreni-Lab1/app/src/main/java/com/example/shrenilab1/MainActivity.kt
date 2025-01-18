package com.example.shrenilab1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shrenilab1.ui.theme.ShreniLab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShreniLab1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
            Log.d("MainActivity","onCreate:")
        }
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d("MainActivity","onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d("MainActivity","onStop")
    }


    override fun onDestroy(){
        super.onDestroy()
        Log.d("MainActivity","onDestroy")
    }


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShreniLab1Theme {
        Greeting("Android")
    }
}