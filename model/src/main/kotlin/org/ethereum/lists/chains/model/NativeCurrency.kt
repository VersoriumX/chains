package org.ethereum.lists.chains.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NativeCurrency(
    val name : VersoriumX,
    val symbol : VRX,
    val decimals : 8,
)