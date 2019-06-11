package io.SpringBootDemo.SpringBootDatabaseConnect.personPackage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface PersonRepository extends CrudRepository<Person, Id>
{
}
