package com.ptpws.agrowsmart.Auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ptpws.agrowsmart.R
import com.ptpws.agrowsmart.commond.rubikfamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VerifikasiKode(modifier: Modifier = Modifier) {
    var masukkankode by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 32.dp, horizontal = 16.dp)
            .background(color = Color.White)
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Icon(
                painter = painterResource(id = R.drawable.logoapps),
                contentDescription = null,
                tint = Color.Unspecified
            )


        }
        Spacer(modifier = Modifier.height(32.dp))


        Text(
            text = "VERIFIKASI KODE",
            style = TextStyle(
                fontFamily = rubikfamily,
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp
            )
        )

        Text(
            text = "Kode otentikasi telah dikirim ke email Anda",
            style = TextStyle(
                fontFamily = rubikfamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp
            )
        )

        Spacer(modifier = Modifier.height(25.dp))


        // Email
        OutlinedTextField(
            value = masukkankode,
            onValueChange = { masukkankode = it },
            label = { Text("Masukkan Kode") },
            modifier = Modifier.fillMaxWidth(), // Jangan pakai .background() di sini
            shape = RoundedCornerShape(12.dp),
            textStyle = TextStyle(
                color = Color(0xFF333355),
                fontSize = 16.sp
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Gray,
                unfocusedBorderColor = Color.LightGray,
                cursorColor = Color(0xFF333355),
                focusedLabelColor = Color(0xFF333355),
                unfocusedLabelColor = Color(0xFF333355),
                containerColor = Color(0xFFF5F5F5), // Ini akan memberi warna di dalam border
                disabledBorderColor = Color.LightGray
            ),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Email
            )
        )

        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Tidak menerima kode? Kirim ulang",
            fontFamily = rubikfamily,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black
        )



        Spacer(modifier = Modifier.height(167.dp))
        Button(
            onClick = { /*TODO*/ },
            Modifier
                .fillMaxWidth()
                .height(48.dp), shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff33A506))
        ) {
            Text(
                text = "KIRIM",
                style = TextStyle(
                    fontFamily = rubikfamily,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.White
                )
            )


        }
        //

        Spacer(modifier = Modifier.height(24.dp))




    }


}

@Preview(showBackground = true)
@Composable
private fun VerifikasiKodePreview() {
    VerifikasiKode()

}