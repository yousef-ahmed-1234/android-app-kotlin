package com.example.profilecard

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileCardApp()
        }
    }
}

@Composable
fun ProfileCardApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            ProfileCard()
        }
    }
}

@Composable
fun ProfileCard() {
    val context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(24.dp)
            .wrapContentHeight()
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_pic),
            contentDescription = " picture",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colors.primary, CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "yousef ahmed",
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 4.dp, bottom = 2.dp)
        )

        Text(
            text = "student",
            fontSize = 16.sp,
            modifier = Modifier.padding(bottom = 16.dp),
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f)
        )

        Button(
            onClick = {
                Toast.makeText(context, " I will contact you", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .fillMaxWidth(0.6f)
        ) {
            Text(text = "Contact Me")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email icon",
                modifier = Modifier
                    .size(24.dp)
                    .padding(end = 8.dp)
            )
            Text(text = "youssufahmedyy@gmail.com", fontSize = 14.sp)

            Spacer(modifier = Modifier.width(16.dp))

            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Phone icon",
                modifier = Modifier
                    .size(24.dp)
                    .padding(end = 8.dp)
            )
            Text(text = "+201140595589", fontSize = 14.sp)
        }
    }
}
