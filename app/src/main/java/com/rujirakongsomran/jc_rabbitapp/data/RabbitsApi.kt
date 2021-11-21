package com.rujirakongsomran.jc_rabbitapp.data

import retrofit2.http.GET

interface RabbitsApi {
    @GET("/randomrabbit")
    suspend fun getRandomRabbit(): Rabbit
}