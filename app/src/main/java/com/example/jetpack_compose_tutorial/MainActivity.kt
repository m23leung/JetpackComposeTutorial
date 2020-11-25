package com.example.jetpack_compose_tutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import androidx.compose.foundation.Box
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.TextField
import androidx.compose.ui.draw.drawShadow
import com.example.jetpack_compose_tutorial.ui.JetpackComposeTutorialTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    LoginForm()
                }
            }
        }
    }
    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        JetpackComposeTutorialTheme {
            //Greeting("from Mark")
            //BoxLayout()
            LoginFormPreview()
        }
    }

    @Composable
    fun BoxLayout() {
        Stack(alignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Box(backgroundColor = Color.Blue, modifier = Modifier.size(200.dp), gravity = Alignment.TopEnd ) {
                Box(
                        backgroundColor = Color.Cyan,
                        modifier = Modifier.size(25.dp)
                )
            }
            Box(backgroundColor = Color.Red, modifier = Modifier.size(100.dp), gravity = Alignment.BottomStart) {
                Box(
                        backgroundColor = Color.Magenta,
                        modifier = Modifier.size(25.dp)
                )
            }
        }
    }

    @Composable
    fun LoginForm() {
        Box(gravity = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                val modifier = Modifier.padding(vertical = 4.dp)


                TextField(value = "", onValueChange = {}, modifier = modifier)
                TextField(value = "", onValueChange = {}, modifier = modifier.then(Modifier.drawShadow(elevation = 3.dp)) )
                Button(onClick = {}, modifier = modifier) {
                    Text("Login")
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun LoginFormPreview() {
        LoginForm()
    }
}


