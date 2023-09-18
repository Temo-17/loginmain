package com.example.loginmain.ui.login.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginmain.R


@Composable
fun LoginScreen(){
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)){
        Login(Modifier.align(Alignment.Center))
    }
}

@Composable
fun Login(modifier: Modifier) {
    Column(modifier = modifier){
        HeaderImage(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(16.dp))
        EmailField()
        Spacer(modifier = Modifier.padding(16.dp))
        PasswordField()
        Spacer(modifier = Modifier.padding(8.dp))
        ForgotPassword(Modifier.align(Alignment.End))
        Spacer(modifier = Modifier.padding(16.dp))
        LoginButton()
    }
}

@Composable
fun LoginButton() {
    Button(onClick = { }, modifier= Modifier
        .fillMaxWidth()
        .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color(0xFFFF4303),
            disabledContentColor = Color(0xFFF78058),

            )



        ) {
        Text(text = "Iniciar Sesión")
    }
}

@Composable
fun ForgotPassword(modifier: Modifier) {
    Text(
        text = "olvidaste la contraseña",
        modifier = modifier.clickable { },
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFFDEEEE)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordField() {
    TextField(value = "", onValueChange = {},
        modifier= Modifier.fillMaxWidth(),
        placeholder = { Text(text= "Contraseña") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor= Color(0xFFFFFF),
            contentColorFor(backgroundColor = Color(0xFF87C787)),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )

    )
}

@Preview(showBackground = true, showSystemUi = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailField() {
    TextField(value = "", onValueChange = {},
        modifier= Modifier.fillMaxWidth(),
        placeholder = { Text(text= "Email") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor= Color(0xFFFFFF),
            contentColorFor(backgroundColor = Color(0xFF87C787)),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
            )

    )

}

@Composable
fun HeaderImage(modifier: Modifier) {
    Image(painter = painterResource(id = R.drawable.ii), contentDescription = "Header")
}
