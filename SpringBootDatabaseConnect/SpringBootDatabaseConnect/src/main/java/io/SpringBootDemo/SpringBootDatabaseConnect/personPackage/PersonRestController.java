package io.SpringBootDemo.SpringBootDatabaseConnect.personPackage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("personInfo")
public class PersonRestController {

    @Autowired
    private PersonService thepersonService;

    @RequestMapping("getPersonInfo")
    public Iterable<Person> getPersonInfo(){

        return thepersonService.getAllDetails();
    }
}
