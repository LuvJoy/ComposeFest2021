package yapp.android1.basicscodelab_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    BasicsCodelab_Week1Theme {
        MyApp()
    }
}

@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1F)) {
                Text(text = "Hello")
                Text(text = name)
            }
            
            OutlinedButton(
                onClick = {  },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Text(text = "Show More")
            }
        }
    }
}

@Composable
private fun MyApp(names: List<String> = listOf("Jetpack", "Compose")) {
    Column(modifier = Modifier.padding(vertical = 4.dp)) {
        for(name in names) {
            Greeting(name)
        }
    }
}