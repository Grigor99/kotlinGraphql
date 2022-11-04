//package com.example.kotlinTest1
//
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.network.okHttpClient
import okhttp3.OkHttpClient

var okHttpClient=OkHttpClient()

val apolloClient = ApolloClient.Builder()
    .serverUrl("https://localhost:8080/graphql")
    .okHttpClient(okHttpClient)
    .build()