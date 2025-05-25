package com.ptpws.agrowsmart.SplashScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ptpws.agrowsmart.R
import com.ptpws.agrowsmart.commond.rubikfamily

@Composable
fun SplashScreen(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xffFFFFFF))) {
        // Background dan Logo Teks
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp),
            shape = RoundedCornerShape(bottomStart = 0.dp, bottomEnd = 0.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.cardbg),
                    contentDescription = "bgcard",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(320.dp)
                )

                // Logo teks "AgrowSmart by ptpws.id"
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier
                        .width(229.dp)
                        .height(53.dp)
                )
            }
        }

        // Logo hijau di bawah, overlap sedikit
        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter
        ) {
            Icon(
                painter = painterResource(id = R.drawable.iconaplikasi),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.offset(y = 280.dp)
            )
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "AgrowApp", style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 48.sp,
                    color = Color(0xff101010),
                    fontFamily = rubikfamily
                )
            )

            Text(
                text = "A new way to control your plant",
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp, color = Color(0xff101010), fontFamily = rubikfamily
            )


        }


        Button(
            onClick = { /*TODO*/ }, contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .padding(bottom = 40.dp)
                .width(77.dp)
                .height(48.dp),
            shape = RoundedCornerShape(7.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff33A506))
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "MULAI",
                    style = TextStyle(
                        platformStyle = PlatformTextStyle(includeFontPadding = false),
                        color = Color(0xffFFFFFF), fontFamily = rubikfamily, fontWeight = FontWeight.Medium
                    ),
                    maxLines = 1,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

            }


        }

    }


}

@Preview(showBackground = true)
@Composable
private fun SplashScreenPreview() {

    SplashScreen()


}