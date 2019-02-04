package com.rag.controller;

import com.rag.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ragesh on 2/3/2019.
 */
@RestController
public class MyController {

    @GetMapping(value = "/getPerson",produces = "application/json")
    public Person getPerson(){
        Person person = new Person();
        person.setName("Ragesh");
        person.setAddress("1111 abc ln");
        person.setSsn("999234567");
        return person;
    }

    @PostMapping(value = "/setPerson", consumes = "application/json")
    public void setPerson(@RequestBody Person person){
//        System.out.println(person.toString());
    }

}
