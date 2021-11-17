package yapp.android1.basicscodelab_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import yapp.android1.basicscodelab_week1.ui.theme.BasicsCodelab_Week1Theme
import yapp.android1.basicscodelab_week1.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelab_Week1Theme {
                MyApp()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.primary) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(24.dp)
        )
    }
}

@Preview(showBackground = true, name = "Text PreView")
@Composable
fun DefaultPreview() {
    BasicsCodelab_Week1Theme {
        MyApp()
    }
}

@Composable
private fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        Greeting("Android")
    }
}