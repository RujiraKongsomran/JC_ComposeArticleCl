package com.rujirakongsomran.jc_composearticlecl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rujirakongsomran.jc_composearticlecl.ui.theme.JC_ComposeArticleClTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_ComposeArticleClTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    CreateComposeArticle()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showSystemUi = true)
@Composable
fun CreateComposeArticle() {
    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null
        )
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier.padding(all = 16.dp)
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            fontSize = 16.sp,
            modifier = Modifier.padding(all = 16.dp),
            textAlign = TextAlign.Justify

        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JC_ComposeArticleClTheme {
        Greeting("Android")
    }
}