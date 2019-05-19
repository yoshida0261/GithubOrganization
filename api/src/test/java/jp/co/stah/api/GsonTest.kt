package jp.co.stah.api

import com.google.gson.Gson
import org.junit.Test



class GsonTest {

    @Test
    fun response() {

        val str =
            "         {         \"id\":19052241,         \"node_id\":\"MDEwOlJlcG9zaXRvcnkxOTA1MjI0MQ==\",         \"name\":\"introduction-for-objective-c\" }"
        val gson = Gson()
        val result = gson.fromJson<MixiJson>(str, MixiJson::class.java)
        println(result.id)
    }
}