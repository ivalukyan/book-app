package com.example.book_app

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class SignIn : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent{

        }
    }
}

@Composable
fun SignInView(){
    Column {
        val title: String = R.string.title_name.toString()
        Text(text= title, Modifier = Modifier.padding(start= 107.dp, top= 92.dp))
    }
}