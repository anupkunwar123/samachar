package com.anupkunwar.samachar

import android.os.Build
import android.text.Html
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("html_text")
fun TextView.setHtml(htmlText:String){
    text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        Html.fromHtml(htmlText,Html.FROM_HTML_MODE_COMPACT)
    }else{
        Html.fromHtml(htmlText)
    }
}