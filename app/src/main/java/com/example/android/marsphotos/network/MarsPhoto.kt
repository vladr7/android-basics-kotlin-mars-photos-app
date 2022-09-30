package com.example.android.marsphotos.network

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class MarsPhoto(
     val id: String,
     @SerialName("img_src") val imgSrcUrl: String
)