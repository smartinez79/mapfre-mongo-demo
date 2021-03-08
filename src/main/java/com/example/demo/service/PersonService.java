package com.example.demo.service;

import com.example.demo.data.PersonDto;
import com.example.demo.mapper.PersonMapper;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonMapper personMapper;

    // TODO: Create a MongoPersonRepository and inject it into this service

    @Autowired
    public PersonService(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    public List<PersonDto> findAll() {
        // TODO: Replace by a method in MongoPersonRepository to find all people
        List<Person> models = Collections.emptyList();
        return models
                .stream()
                .map(personMapper::toDto)
                .collect(Collectors.toList());
    }

    public PersonDto findById(String id) {
        // TODO: Replace by a method in MongoPersonRepository to find a person by id
        Optional<Person> model = Optional.empty();
        return model
                .map(personMapper::toDto)
                .orElse(null);
    }

    public List<PersonDto> findByFirstName(String firstName) {
        // TODO: Replace by a method in MongoPersonRepository to find people with the same first name
        List<Person> models = Collections.emptyList();
        return models.stream()
                .map(personMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<PersonDto> findByCity(String city) {
        // TODO: Replace by a method in MongoPersonRepository to find people in the same city
        List<Person> models = Collections.emptyList();
        return models.stream()
                .map(personMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<PersonDto> findByFirstNameAndCity(String firstName, String city) {
        // TODO: Replace by a method in MongoPersonRepository to find people with the same first name who live in the same city
        List<Person> models = Collections.emptyList();
        return models.stream()
                .map(personMapper::toDto)
                .collect(Collectors.toList());
    }

    public PersonDto createPerson(PersonDto personDto) {
        Person model = personMapper.toModel(personDto);
        // TODO: Replace by a method in MongoPersonRepository to save a person and returns the saved person
        Person savedModel = Person.builder().build();
        return personMapper.toDto(savedModel);
    }

    public PersonDto updatePerson(PersonDto personDto) {
        // TODO: Replace by a method in MongoPersonRepository to find a person by id
        Optional<Person> model = Optional.empty();
        return model
                .map(p -> {
                    p.setFirstName(personDto.getFirstName());
                    p.setLastName(personDto.getLastName());
                    p.setAddress(personDto.getAddress());
                    p.setAliases(personDto.getAliases());
                    return p;
                })
                // TODO: Replace by a method in MongoPersonRepository to save a person and returns the saved person
                .map(Function.identity())
                .map(personMapper::toDto)
                .orElse(null);
    }

    public boolean deletePersonById(String id) {
        // TODO: Replace by a method in MongoPersonRepository to find a person by id
        Optional<Person> model = Optional.empty();
        if (!model.isPresent()) {
            return false;
        }
        boolean deleted;
        try {
            // TODO: Create a method in MongoPersonRepository to delete a person by id
            deleted = true;
        } catch (Exception ex) {
            deleted = false;
        }
        return deleted;
    }

    public void deleteAllPeople() {
        // TODO: Create a method in MongoPersonRepository to delete all the people
    }

    public PersonDto updatePersonAliases(String id, List<String> aliases) {
        // TODO: Replace by a method in MongoPersonRepository to update the aliases for a person given its id and returns the updated person.
        Person updatedPerson = Person.builder().build();
        return Optional.ofNullable(updatedPerson)
                .map(personMapper::toDto)
                .orElse(null);
    }
}

