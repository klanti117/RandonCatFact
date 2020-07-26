package com.example.randomcatfacts

import com.example.randomcatfacts.api.CatJson
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequest {
	@GET("/facts/random")
	fun getCatFact(): Call<CatJson>
}
