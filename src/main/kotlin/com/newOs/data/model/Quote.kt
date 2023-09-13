package com.newOs.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Quote(
    val author: String,
    val text: String
)
