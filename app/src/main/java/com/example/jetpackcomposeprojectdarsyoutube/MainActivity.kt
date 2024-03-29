package com.example.jetpackcomposeprojectdarsyoutube

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeprojectdarsyoutube.ui.theme.JetpackComposeProjectDarsYouTubeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                ListItem(name = "Vali Akhmedov", prof = "UX/UI")
                ListItem(name = "Adbu Rahimov", prof = "PHP DEVELOPER")
                ListItem(name = "Dilshod Miraminov", prof = "JAVA DEVELOPER")
                ListItem(name = "Mansur Ashrapov", prof = "C++ DEVELOPER")
                ListItem(name = "Jahongir Qurbonov", prof = "PYTHON DEVELOPER")
                ListItem(name = "Mubinjon Zoidov", prof = "KOTLIN DEVELOPER")
                ListItem(name = "Vali Akhmedov", prof = "UX/UI")
                ListItem(name = "Adbu Rahimov", prof = "PHP DEVELOPER")
            }

        }
    }
}

@Composable
private fun ListItem(name: String, prof: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        //elevation = 5.dp
    ) {
        Box() {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image_1),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(Modifier.padding(start = 16.dp)) {
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }
    }
}
