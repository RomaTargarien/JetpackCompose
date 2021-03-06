package com.example.modifiers

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.modifiers.ui.theme.ModifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Column(modifier = Modifier
               .background(Color.Green)
               .fillMaxHeight(0.5f)
               .fillMaxWidth()
               .border(5.dp, Color.Magenta)
               .padding(5.dp)
               .border(5.dp, Color.Blue)
               .padding(5.dp)
               .border(10.dp, Color.Red)
               .padding(10.dp)
               //.requiredWidth(600.dp)
           ) {
               Text("Hello",modifier = Modifier.clickable {
                   Toast.makeText(this@MainActivity,"Hello",Toast.LENGTH_LONG).show()
               })
               Spacer(modifier = Modifier.height(50.dp))
               Text("World")
           }
        }
    }
}