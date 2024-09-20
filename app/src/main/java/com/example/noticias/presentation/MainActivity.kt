package com.example.noticias.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.noticias.presentation.screen_login.LoginScreen
import com.example.noticias.presentation.theme.NoticiasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoticiasTheme {
                LoginScreen()
            }
        }
    }
}



