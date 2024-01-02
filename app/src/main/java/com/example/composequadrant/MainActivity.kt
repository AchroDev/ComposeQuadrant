package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    ComposeQuadrant(
        tcomposable = stringResource(R.string.text_composable),
        tcomdesc = stringResource(R.string.text_composable_description),
        icomposable = stringResource(R.string.image_composable),
        icomdesc = stringResource(R.string.image_composable_description),
        rcomposable = stringResource(R.string.row_composable),
        rcomdesc = stringResource(R.string.raw_composable_description),
        ccomsosable = stringResource(R.string.column_composable),
        ccomdesc = stringResource(R.string.column_composable_description)
    )
}

@Composable
private fun ComposeQuadrant(
    tcomposable: String,
    tcomdesc: String,
    icomposable: String,
    icomdesc: String,
    rcomposable: String,
    rcomdesc: String,
    ccomsosable: String,
    ccomdesc: String,
    modifier: Modifier = Modifier,

) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .padding(16.dp),

        ){
            Text(
                text = tcomposable,
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .padding(bottom = 16.dp),
            )
            Text(
                text = tcomdesc,
                textAlign = TextAlign.Justify
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantApp()
    }
}