package com.example.kotlinTest1.repository

import com.example.kotlinTest1.data.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : CrudRepository<Person, String> {
    fun findByNameLike(name: String): List<Person>


     override fun findAll():List<Person>;
}