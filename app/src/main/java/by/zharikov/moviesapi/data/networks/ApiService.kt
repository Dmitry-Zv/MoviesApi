package by.zharikov.moviesapi.data.networks

import by.zharikov.moviesapi.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/shows")
    suspend fun getAllMovies():Response<List<Movies>>
}