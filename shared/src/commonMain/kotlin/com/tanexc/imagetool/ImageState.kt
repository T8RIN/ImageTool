package com.tanexc.imagetool

import androidx.compose.ui.graphics.ImageBitmap

/**
 * ImageState represents state of loading image from network
 **/
sealed class ImageState {
    class Loading(
        val progress: Float
    ) : ImageState()

    data object Failed : ImageState()

    data class Success(
        val imageBitmap: ImageBitmap
    ) : ImageState()
}