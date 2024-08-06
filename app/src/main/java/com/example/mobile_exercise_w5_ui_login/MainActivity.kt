package com.example.mobile_exercise_w5_ui_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
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
        modifier = Modifier.fillMaxSize(),
        // Sắp xếp theo chiều dọc
        verticalArrangement = Arrangement.Center,
        // Căn chỉnh chiều ngang
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

        var Email by remember {
            mutableStateOf("")
        }

        var password by remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = Email,
            onValueChange = {
                Email = it
            },
            textStyle = TextStyle(color = Color.Black),
            label = {
                Text(text = "Emaill address", fontSize = 13.sp)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp),

            )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text(text = "Password", fontSize = 13.sp)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp),
        )

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { /*TODO*/ },
            // Shape dung de bo tron cac goc
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3)),
        ) {
            Text(
                text = "Login in to app",
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 5.dp)
            )

        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(
            onClick = { },
            // Shape dung de bo tron cac goc
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE8E9EE)),
        ) {
            Text(
                text = "Forget password ?",
                color = Color.Black,
                modifier = Modifier.padding(vertical = 5.dp)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))
        Row(
            // ********* Hỏi anh Thanh ***** Dòng số 152
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp)

        ) {
            // Divider dùng để thêm gạch ngang
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "or login with",
                modifier = Modifier.padding(horizontal = 8.dp),
                color = Color.Gray,
            )
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier
                .wrapContentWidth()
                .padding(vertical = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(50.dp),

            ) {
            Image(
                painter = painterResource(id = R.drawable.twitter_icon),
                contentDescription = "logo twiter",
                modifier = Modifier.clickable { },
            )
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "logo google",
                modifier = Modifier.clickable { },
            )
            Image(
                painter = painterResource(id = R.drawable.facebook_icon),
                contentDescription = "logo facebook",
                modifier = Modifier.clickable { },
            )
        }
        Row(
            modifier = Modifier.wrapContentWidth(),
            horizontalArrangement = Arrangement.spacedBy(60.dp),
            
            ) {
            Text(text = "Tiwter")
            Text(text = "Google")
            Text(text = "Facebook")
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