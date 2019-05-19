package jp.co.stah.api

import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MixiApiClient {
     val BASE_URL = "https://api.github.com/"

    /*
    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(baseApiUrl)
        .client(httpClientBuilder.build())
        .build()
     */

    private fun restClient() : Retrofit {

        val httpClientBuilder = OkHttpClient.Builder()

        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .client(httpClientBuilder.build())
            .build()
    }

    fun fetchReposList() : Response<List<GithubRespository>> {
        val service = restClient().create(GithubService::class.java)
        return service.getRepository("mixi-inc").execute()
    }
}