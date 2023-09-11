package com.example.assignment;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
@Service
public class IOService{
    private static final String File="pets.txt";
    public void savePest(List<Pet> pet)  {
        try(ObjectOutputStream outputStream= new ObjectOutputStream(new FileOutputStream(File))){
            outputStream.writeObject(pet);
            System.out.println("success");

        }catch (Exception e){
            System.out.println("error");
        }

    }
    public List<Pet> getPets() {
        List<Pet> pets= new ArrayList<>();
        try {
            ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream(File));
            Object obj= objectInputStream.readObject();
            if(obj instanceof List){
                pets= (List<Pet>) obj;

            }else{
                System.out.println("invalid data format in "+File);
            }
        }catch (Exception e){
            System.out.println("error");
        }

            return pets;
    }
}
