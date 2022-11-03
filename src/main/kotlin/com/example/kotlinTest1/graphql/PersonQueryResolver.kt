package com.example.kotlinTest1.graphql

import com.example.kotlinTest1.dao.PersonDao
import com.example.kotlinTest1.repository.PersonRepository
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery

@DgsComponent
class PersonQueryResolver(
    private val personDao: PersonRepository
) {
    @DgsQuery( field = "person")
    fun person(id: String) =
        personDao.findById(id)
    @DgsQuery( field = "personsByName")
    fun personsByName(name: String) =
        personDao.findByNameLike(name)
}