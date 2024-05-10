package com.example.book_app.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.book_app.R
import com.example.book_app.ui.theme.ButtonGoole
import com.example.book_app.ui.theme.TextInBox
import com.example.book_app.ui.theme.TextSignIn
import com.example.book_app.ui.theme.Typography


@Composable
fun SignInView(){
    val title: String = stringResource(id = R.string.title_name)
    val textLogIn: String = stringResource(id = R.string.login_text)
    val LoginLabel: String = "Enter your email"
    val PasswordLabel: String = "Enter your password"
    val SignIn: String = "Sign In"
    val SignUp: String = "Sign Up"
    val OrConWith: String  = "or continue with"
    val Google: String = "Google"
    val PrivacyPolicy: String = "By clicking continue, you agree to our Terms of Service and Privacy " +
            "Policy"

    var email = remember { mutableStateOf("") }
    var password = remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier
            .padding(top = 92.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text= title, style = Typography.titleLarge, color = TextSignIn)
        Spacer(modifier = Modifier.height(10.dp))
        Image(painter = painterResource(id = R.drawable.books), title)
        Spacer(modifier = Modifier.height(40.dp))
        Text(text= textLogIn, style = Typography.bodyLarge)
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = email.value, onValueChange = {email.value = it}, label = { Text(
            text = LoginLabel
        )},
            leadingIcon = {Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon")},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = OutlinedTextFieldDefaults.colors(TextInBox)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = password.value, onValueChange = {password.value = it}, label= {Text(PasswordLabel)},
            visualTransformation = PasswordVisualTransformation(), keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            leadingIcon = {Icon(imageVector = Icons.Default.Lock, contentDescription = "passwordIcon")},
            colors = OutlinedTextFieldDefaults.colors(TextInBox)
        )
        Spacer(modifier = Modifier.height(25.dp))
        Row {
            Button(onClick = { /*TODO*/ }, shape = ButtonDefaults.shape, colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {
                Text(text = SignIn)
            }
            Spacer(modifier = Modifier.width(25.dp))
            Button(onClick = { /*TODO*/ }, shape = ButtonDefaults.shape, colors = ButtonDefaults.buttonColors(
                Color.Black
            )) {
                Text(text = SignUp)
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = OrConWith, color = TextInBox, fontSize = 14.sp)
        Button(onClick = { /*TODO*/ }, modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, end = 40.dp), shape = ButtonDefaults.shape, colors = ButtonDefaults.buttonColors(
            ButtonGoole
        )) {
            Row {
                Image(painter = painterResource(id = R.drawable.google), contentDescription = "googleIcon",
                    alignment = Alignment.CenterStart, contentScale = ContentScale.Fit)
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = Google, color = Color.Black)
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = PrivacyPolicy, color = TextInBox, fontSize = 12.sp, textAlign = TextAlign.Center, modifier = Modifier
            .padding(start = 35.dp, end = 35.dp))
    }
}