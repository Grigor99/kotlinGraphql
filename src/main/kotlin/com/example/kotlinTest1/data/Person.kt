package com.example.kotlinTest1.data


import java.time.LocalDate
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "person")
data class Person(
    @Id
    val id: String = UUID.randomUUID().toString(),
    var name: String,
    var birth: OffsetDateTime

){
}