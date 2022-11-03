package com.example.kotlinTest1.dao

import com.example.kotlinTest1.repository.PersonRepository
import org.springframework.stereotype.Component

@Component
class PersonDao(
    private val personRepository: PersonRepository
) {
    fun getPersonById(id: String) =
        personRepository.findById(id)

    fun getPersonsByName(name: String) =
        personRepository.findByNameLike(name)
}