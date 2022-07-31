package com.example.customfontcomposeexample

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.customfontcomposeexample.R

val best = FontFamily(Font(R.font.best))


val bebasNeueFamily = FontFamily(
    Font(R.font.bebas_neue_thin, FontWeight.Thin),
    Font(R.font.bebas_neue_regular, FontWeight.Normal),
    Font(R.font.bebas_neue_bold, FontWeight.Bold),

    // If you have a font like bold italic, you can add it like that
    //Font(R.font.MY_BOLD_ITALIC_FONT_NAME, FontWeight.Bold, FontStyle.Italic),
)