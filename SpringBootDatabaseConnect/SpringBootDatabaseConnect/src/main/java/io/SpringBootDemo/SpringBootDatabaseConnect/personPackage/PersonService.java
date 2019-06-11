package io.SpringBootDemo.SpringBootDatabaseConnect.personPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService
{
    @Autowired
    private PersonRepository thePersonRepository;

    public Iterable<Person> getAllDetails(){

        return thePersonRepository.findAll();
    }

}
