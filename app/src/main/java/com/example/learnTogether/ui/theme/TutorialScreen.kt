package com.example.dummy.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dummy.R

@Preview("TutorialScreen")
@Composable
fun TutorialScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column() {
            HeaderImages()
            Title()
            BodyFirst()
            BodySecond()
        }

    }
}

/**
 * Header Images
 */
@Composable
fun HeaderImages() {
    Image(
        painter = painterResource(R.drawable.bg_compose_background),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth()
    )
}


/**
 * 取説タイトル
 */
@Composable
fun Title() {
    Text(
        text = stringResource(R.string.tutorial_title_text),
        modifier = Modifier.padding(16.dp),
        fontSize = 24.sp,
        textAlign = TextAlign.Start
    )
}

/**
 * 取説本文_1
 */
@Composable
fun BodyFirst() {
    Text(
        text = stringResource(R.string.body_text_1),
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify
    )
}


/**
 * 取説本文_2
 */
@Composable
fun BodySecond() {
    Text(
        text = stringResource(R.string.body_text_2),
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}