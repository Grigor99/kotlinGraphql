package com.example.kotlinTest1.graphql

import com.example.kotlinTest1.data.Person
import com.example.kotlinTest1.repository.PersonRepository

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import org.jetbrains.annotations.NotNull

@DgsComponent
class PersonQueryResolver(private val personRepository: PersonRepository) {


//    @DgsQuery(field = "person")
//    fun person(id: String) =
//        personRepository.findById(id)


    @DgsQuery(field = "personByName")
    fun personByName(name: String): List<Person> =
        personRepository.findByNameLike(name);


}

