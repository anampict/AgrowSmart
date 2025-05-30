package com.ptpws.agrowsmart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ptpws.agrowsmart.Auth.DaftarScreen
import com.ptpws.agrowsmart.Auth.GantiSandi
import com.ptpws.agrowsmart.Auth.LoginScreen
import com.ptpws.agrowsmart.Profile.ProfileScreen
import com.ptpws.agrowsmart.ScreenKelembapan.ScreenKelembapan
import com.ptpws.agrowsmart.SplashScreen.SplashScreen
import com.ptpws.agrowsmart.ui.theme.AgrowSmartTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AgrowSmartTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ProfileScreen()

                }
            }
        }
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
    AgrowSmartTheme {
        Greeting("Android")
    }
}