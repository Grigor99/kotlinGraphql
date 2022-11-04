package com.example.kotlinTest1.graphql
//
//import com.example.kotlinTest1.data.Person
//import com.example.kotlinTest1.repository.PersonRepository
//import com.netflix.graphql.dgs.DgsComponent
//import com.netflix.graphql.dgs.DgsMutation
//import java.util.UUID
//
//
//@DgsComponent
//class PersonMutationResolver(private val personRepository: PersonRepository) {
//    @DgsMutation(field = "newPerson")
//    fun newPerson(name: String):Person{
//        var person = Person(UUID.randomUUID().toString(),name);
//        return personRepository.save(person);
//    }
//}