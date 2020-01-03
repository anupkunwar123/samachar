package com.anupkunwar.samachar

import android.os.Build
import android.view.View
import android.widget.ImageView
import androidx.core.view.doOnPreDraw
import androidx.databinding.BindingAdapter
import coil.api.load


@BindingAdapter(
    value = ["image_url"],
    requireAll = false
)
fun setImageUrl(
    imageView: ImageView,
    imageUrl: String?

) {
    imageView.doOnPreDraw {
        if (!imageUrl.isNullOrBlank()) {
            imageView.load(imageUrl) {
                crossfade(true)
            }
        }
    }

}


@BindingAdapter("elevation")
fun setElevation(view: View, elevation: Float) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        view.elevation = elevation
    }
}


