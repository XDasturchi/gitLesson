package org.example;

import com.github.javafaker.Faker;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 10; i++){
            Faker faker = new Faker();

            String  name = faker.name().firstName();

            System.out.println(name);

            if(builder.toString().contains(name)){
                System.out.println("Oldin Kelgan: " + name);
            }

            builder.append(name);

        }

        System.out.println("Ishladi");
    }

}