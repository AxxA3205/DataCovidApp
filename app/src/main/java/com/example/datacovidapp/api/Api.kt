package com.example.datacovidapp.api

import com.example.datacovidapp.model.IndonesiaResponse
import com.example.datacovidapp.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun  getProvince(): Call<ArrayList<ProvinceResponse>>
}