package com.ptpws.agrowsmart.ScreenKelembapan

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ptpws.agrowsmart.R
import com.ptpws.agrowsmart.commond.interfamily
import com.ptpws.agrowsmart.commond.rubikfamily

@Composable
fun ScreenKelembapan(modifier: Modifier) {
    var isChecked1 by remember { mutableStateOf(false) }
    var isChecked2 by remember { mutableStateOf(false) }
    var isChecked3 by remember { mutableStateOf(false) }
    var isEnabled by remember { mutableStateOf(true) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffFFFFFF)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 29.dp, start = 27.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_back),
                    contentDescription = null, tint = Color.Black
                )

                Spacer(modifier = Modifier.width(120.dp))

                Text(
                    text = "Halaman",
                    textAlign = TextAlign.Center,
                    style = TextStyle(fontSize = 20.sp),
                    fontFamily = rubikfamily, fontWeight = FontWeight.Medium, color = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(40.dp))
            Card(
                modifier = Modifier
                    .width(358.dp)
                    .height(112.dp),
                shape = RoundedCornerShape(12.dp),
                colors = cardColors(containerColor = Color(0xffF7F7F7))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp, end = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.air),
                            contentDescription = null, tint = Color.Unspecified
                        )

                        Spacer(modifier = Modifier.width(8.dp))
                        Switch(
                            checked = isChecked1,
                            onCheckedChange = { isChecked1 = it },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = Color.White,
                                uncheckedThumbColor = Color.White,
                                disabledCheckedThumbColor = Color.White,
                                disabledUncheckedThumbColor = Color.White,
                                checkedTrackColor = Color(0xFF33A506),
                                uncheckedTrackColor = Color.LightGray,
                                disabledCheckedTrackColor = Color(0xFF33A506).copy(alpha = 0.3f),
                                disabledUncheckedTrackColor = Color.LightGray.copy(alpha = 0.3f)
                            )
                        )


                    }

                    Text(
                        text = "Nama custom",
                        fontSize = 16.sp,
                        fontFamily = rubikfamily,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    )

                    Text(
                        text = "Tipe Device",
                        fontSize = 12.sp,
                        fontFamily = rubikfamily,
                        fontWeight = FontWeight.Medium,
                        color = Color.Gray
                    )


                }

            }
            Spacer(modifier = Modifier.height(27.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp), horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    modifier = Modifier.height(131.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.lembab),
                        contentDescription = null,
                        tint = Color(0xff865B00)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "41 %",
                        style = TextStyle(fontFamily = rubikfamily), color = Color.Black,
                        fontWeight = FontWeight.SemiBold, fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))


                    Text(
                        text = "Lembab\n" + "Tanah",
                        style = TextStyle(fontFamily = rubikfamily), textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Medium, fontSize = 16.sp, color = Color(0XFF292929)
                    )

                }

                Column(
                    modifier = Modifier.height(131.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.udara),
                        contentDescription = null,
                        tint = Color(0xff4285F4)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "41 %",
                        style = TextStyle(fontFamily = rubikfamily), color = Color.Black,
                        fontWeight = FontWeight.SemiBold, fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))


                    Text(
                        text = "Lembab\n" + "Udara",
                        style = TextStyle(fontFamily = rubikfamily), textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Medium, fontSize = 16.sp, color = Color(0XFF292929)
                    )

                }

                Column(
                    modifier = Modifier.height(131.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.suhu),
                        contentDescription = null,
                        tint = Color(0xffD70000)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "41 %",
                        style = TextStyle(fontFamily = rubikfamily), color = Color.Black,
                        fontWeight = FontWeight.SemiBold, fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(10.dp))


                    Text(
                        text = "Suhu\n" + "Ruangan",
                        style = TextStyle(fontFamily = rubikfamily), textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Medium, fontSize = 16.sp, color = Color(0XFF292929)
                    )

                }


            }
            Spacer(modifier = Modifier.height(55.dp))


            Card(
                modifier = Modifier
                    .width(358.dp)
                    .height(173.dp),
                colors = cardColors(containerColor = Color(0xffFFFFFF)),
                shape = RoundedCornerShape(20.dp), border = BorderStroke(1.dp, Color.LightGray)
            ) {
                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            "Selanjutnya",
                            fontSize = 16.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.height(23.dp))

                        Row(verticalAlignment = Alignment.Bottom) {
                            Text(
                                "6",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black, fontFamily = interfamily
                            )
                            Text(
                                " jam ",
                                fontSize = 12.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold, fontFamily = interfamily
                            )
                            Text(
                                "30",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black, fontFamily = interfamily
                            )
                            Text(
                                " min",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black, fontFamily = interfamily
                            )
                        }
                        Spacer(modifier = Modifier.height(28.dp))
                        Button(
                            onClick = { /* aksi */ },
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.textButtonColors(
                                containerColor = Color(0xff4C88EC)
                            )
                        ) {
                            Text(
                                "SIRAM SEKARANG",
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    fontFamily = rubikfamily
                                )
                            )
                        }
                    }

                    Column(horizontalAlignment = Alignment.Start) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                painter = painterResource(id = R.drawable.icon_air),
                                contentDescription = null,
                                tint = Color.Unspecified, // supaya pakai warna asli dari ikon
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text("200ml", fontWeight = FontWeight.Medium, fontSize = 24.sp)
                                Text(
                                    "Jumlah air",
                                    fontSize = 12.sp,
                                    color = Color.Black,
                                    fontFamily = interfamily, fontWeight = FontWeight.Normal
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(21.dp))

                        Text(
                            "Detail",
                            fontWeight = FontWeight.Bold,
                            fontFamily = rubikfamily,
                            fontSize = 16.sp, color = Color.Black
                        )
                        Text(
                            "17 Drip",
                            fontSize = 12.sp,
                            fontFamily = rubikfamily,
                            fontWeight = FontWeight.Normal, color = Color.Black
                        )
                        Text(
                            "20 Meter",
                            fontSize = 12.sp,
                            fontFamily = rubikfamily,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black
                        )
                    }
                }

            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 17.dp, end = 17.dp, top = 20.dp
                    ),
                shape = RoundedCornerShape(15.dp),
                border = BorderStroke(1.dp, Color.LightGray),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "6:00",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black, fontFamily = interfamily
                            )
                            Spacer(modifier = Modifier.width(67.dp))
                            Text(
                                text = "200ml",
                                fontStyle = FontStyle.Italic,
                                fontSize = 20.sp,
                                color = Color(0xff5E5E5E),
                                fontFamily = interfamily,
                                fontWeight = FontWeight.Medium
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "S S R K J S M",
                            fontSize = 12.sp,
                            color = Color(0xFF4285F4),
                            letterSpacing = 2.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = interfamily
                        )
                    }

                    // Switch tetap di ujung kanan
                    Switch(
                        checked = isChecked2,
                        onCheckedChange = { isChecked2 = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            checkedTrackColor = Color(0xFF448AFF),
                            uncheckedThumbColor = Color.White,
                            uncheckedTrackColor = Color.LightGray
                        )
                    )
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 17.dp, end = 17.dp, top = 16.dp
                    ),
                shape = RoundedCornerShape(15.dp),
                border = BorderStroke(1.dp, Color.LightGray),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "8:00",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black, fontFamily = interfamily
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "S S R K J S M",
                            fontSize = 12.sp,
                            color = Color(0xFF4285F4),
                            letterSpacing = 2.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = interfamily
                        )
                    }

                    // Switch tetap di ujung kanan
                    Switch(
                        checked = isChecked3,
                        onCheckedChange = { isChecked3 = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            checkedTrackColor = Color(0xFF448AFF),
                            uncheckedThumbColor = Color.White,
                            uncheckedTrackColor = Color.LightGray
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(13.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp)
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(1.dp, Color.LightGray),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(CircleShape)
                            .background(Color.Black)
                            .clickable { },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add",
                            tint = Color.White
                        )
                    }
                }
            }
        }


    }


}


@Preview(showBackground = true)
@Composable
private fun ScreenKelembapanPreview() {
    ScreenKelembapan(modifier = Modifier)

}