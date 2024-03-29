package com.example.jetpackcomposeprojectdarsyoutube

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeprojectdarsyoutube.ui.theme.JetpackComposeProjectDarsYouTubeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth().fillMaxHeight(0.5f)
            ) {
                Column(
                    modifier = Modifier
                        .background(Color.Red).fillMaxWidth(0.5f).fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                { //Ин контейнер мебошад ва барои мавқъи виджетро муайян кардан истифода мешавад
                    Text(text = "Hello")
                    Text(text = "Girona")
                    Text(text = "Madrid")
                }
                Column(
                    modifier = Modifier
                        .background(Color.Green).fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                { //Ин контейнер мебошад ва барои мавқъи виджетро муайян кардан истифода мешавад
                    Text(text = "Hello")
                    Text(text = "Girona")
                    Text(text = "Madrid")
                }
            }
        }
    }
}
//@Preview (showBackground = true) //Ин функксия барои нишон додани виджет истифода мешавад
//@Composable //Барои ҷеғ задани функсия истифода карда мешавад
//fun NewText(){
//    Text(text = "Hello World!")
//}