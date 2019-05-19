package jp.co.stah.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface  GithubService{
    @GET("orgs/{org}/repos")
    fun getRepository(@Path("org") org: String) : Call<List<GithubRespository>>
}