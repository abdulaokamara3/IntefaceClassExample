package com.example.Sample.ProjectAndrewJar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class joinclass {
    public static void main(String[] args) {
        List<Person> deff = new ArrayList<>();
        deff.add(new Person("kamara",34));
        deff.add(new Person("solomon",10));
        deff.add(new Person("mercary",89));
        deff.add(new Person("samson",12));

        System.out.println(deff);

    }

}
