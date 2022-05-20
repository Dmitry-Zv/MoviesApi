package by.zharikov.moviesapi.utils

import android.widget.TextView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.text.HtmlCompat
import org.w3c.dom.Text

class Constants {

    object Screens {
        const val SPLASH_SCREEN = "splash screen"
        const val MAIN_SCREEN = "main screen"
        const val DETAILS_SCREEN = "details screen"
    }


}
@Composable
fun HtmlText(text: String, modifier: Modifier){
    AndroidView(modifier = modifier,
        factory = {context -> TextView(context)  },
        update = {it.text = HtmlCompat.fromHtml(text,HtmlCompat.FROM_HTML_MODE_COMPACT)})

}