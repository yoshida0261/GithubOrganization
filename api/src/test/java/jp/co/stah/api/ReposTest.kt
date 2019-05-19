package jp.co.stah.api

import org.junit.Test

class ReposTest {
    @Test
    fun getRepos(){
        val response = MixiApiClient.fetchReposList()
        // とりあえず1つだけ表示させてみる
        val firstRepos = response.body()!![0]
        println(firstRepos.name)
    }
}