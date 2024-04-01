package com.example.jetpackcomposeprojectdarsyoutube

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeprojectdarsyoutube.ui.theme.Gray100
import com.example.jetpackcomposeprojectdarsyoutube.ui.theme.MyRow
import com.example.jetpackcomposeprojectdarsyoutube.ui.theme.ItemRowModel
import com.example.jetpackcomposeprojectdarsyoutube.ui.theme.JetpackComposeProjectDarsYouTubeTheme
import com.example.jetpackcomposeprojectdarsyoutube.ui.theme.MyRow
import java.net.CookieHandler

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Gray100)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(
                            R.drawable._1, "Sadridin Ayni",
                            "(1878—1954) — адиб, олим ва асосгузори адабиёти " +
                                    "муосири тоҷик. Аввалин Президенти Академияи илмҳои " +
                                    "Ҷумҳурии Тоҷикистон. Соли 1997 бо унвони олии " +
                                    "Қаҳрамони Тоҷикистон қадр шудааст."
                        ),
                        ItemRowModel(
                            R.drawable._3, "Bobojon Gafurov",
                            "(1909—1977) — донишманд, академики Академияи" +
                                    " Илмҳои ИҶШС, арбоби ҳизбӣ ва давлатӣ, " +
                                    "муаллифи китоби «Тоҷикон». Соли 1997 бо " +
                                    "унвони олии Қаҳрамони Тоҷикистон қадр шудааст."
                        ),
                        ItemRowModel(
                            R.drawable._4, "Emomali Rahmon",
                            "— сиёсатмадор, Президенти Ҷумҳурии Тоҷикистон. Соли " +
                                    "1999 барои мустаҳкам намудани давлатдории " +
                                    "соҳибистиқлол ва пойдории сулҳ дар Ҷумҳурии Тоҷикистон" +
                                    " бо унвони олии Қаҳрамони Тоҷикистон қадр шудааст."
                        ),
                        ItemRowModel(
                            R.drawable._2, "Mirzo Tursunzoda",
                            " (1911—1977) — шоир, раиси Иттифоқи нависандагони" +
                                    " Тоҷикистон, Қаҳрамони Меҳнати Сотсиалистӣ." +
                                    " Соли 2001 бо унвони олии Қаҳрамони Тоҷикистон қадр шудааст."
                        ),
                        ItemRowModel(
                            R.drawable._6, "Nusratullo Makhsum",
                            " (1881—1938) — ходими давлатӣ ва ҳизбӣ. Соли 2006" +
                                    " бо унвони олии Қаҳрамони Тоҷикистон қадр шудааст."
                        ),
                        ItemRowModel(
                            R.drawable._5, "Shirinsho Shohtemur",
                            "(1899—1937) — ходими давлатӣ ва ҳизбӣ. Соли 2006, " +
                                    "бо унвони олии Қаҳрамони Тоҷикистон қадр шудааст."
                        ),

                        )
                ) { _, item ->
                    MyRow(item = item)
                }
            }
        }
    }
}
