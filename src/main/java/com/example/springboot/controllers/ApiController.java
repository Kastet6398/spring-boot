package com.example.springboot.controllers;

import com.example.springboot.models.BaseModel;
import com.example.springboot.models.MessageModel;
import com.example.springboot.models.PersonModel;
import com.example.springboot.utils.Utils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ApiController {
    private int a;
    @PostMapping("/person")
    public BaseModel createOrUpdatePerson(@RequestBody PersonModel personForm) throws IOException {
        Utils.writeJson("person.json", personForm);
        return new MessageModel("created/updated successfully");
    }

    @GetMapping("/person")
    public BaseModel getPersonDetails() {
        try {
            PersonModel person = (PersonModel) Utils.readJson("person.json", PersonModel.class);
            if (person == null)
                return new MessageModel("person is null");

            return person;
        } catch (IOException e) {
            return new MessageModel("person isn't set");
        }
    }

    @DeleteMapping("/person")
    public BaseModel deletePerson() throws IOException {
        Utils.delete("person.json");
        return new MessageModel("deleted successfully");
    }

    @PostMapping("/add")
    public BaseModel add() throws IOException {
        a++;
        return new MessageModel("success");
    }

    @GetMapping("/read")
    public int read() throws IOException {
        return a;
    }
    // 333
}
