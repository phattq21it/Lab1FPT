package com.example.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class Test {
    private final IOService ioService;
@Autowired
    public Test(IOService ioService) {
        this.ioService = ioService;
    }

    public void performTasks()  {

            List<Pet> petList = List.of(
                    new Pet("Mowzer", "cat", 3),
                    new Pet("Woofie", "dog", 5),
                    new Pet("Chirpy", "bird", 1)
            );
        // Save the list of pets to "pets.txt"
        ioService.savePest(petList);

        // Retrieve the list of saved pets from "pets.txt"
        List<Pet> savedPets = ioService.getPets();

        for (Pet pet : savedPets) {
            pet.makeNoise();
        }
    }
}
