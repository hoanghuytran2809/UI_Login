package com.example.mobile_exercise_w5_ui_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobile_exercise_w5_ui_login.ui.theme.Mobile_Exercise_W5_UI_LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Mobile_Exercise_W5_UI_LoginTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_05),
            contentDescription = "Login image",
            modifier = Modifier
                .size(300.dp)
                .background(color = Color.Unspecified),
        )
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Welcome back! Log in to your App account",
            fontSize = 17.sp,
            color = Color(0xFF333333)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = "", onValueChange = {},
            label = {
                Text(text = "")
            },
            modifier = Modifier.width(width = 280.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "")
        })

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.width(280.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3)),
        ) {
            Text(text = "Login in to app")

        }
        var name by remember  {
            mutableStateOf(0)
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.width(280.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            ) {
            Text(text = "Reset password")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Mobile_Exercise_W5_UI_LoginTheme {
        Greeting()
    }
}