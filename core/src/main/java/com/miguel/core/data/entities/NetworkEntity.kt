package com.miguel.core.data.entities

data class NetworkEntity(
    val id: Long,
    val name: String,
    val country: CountryEntity,
)
