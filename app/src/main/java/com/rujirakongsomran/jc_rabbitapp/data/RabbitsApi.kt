package com.rujirakongsomran.jc_rabbitapp.data

import retrofit2.http.GET

interface RabbitsApi {
    @GET("/randomrabbit")
    suspend fun getRandomRabbit(): Rabbit

    companion object {
        const val BASE_URL = "http://192.168.1.6:8100"
    }
}