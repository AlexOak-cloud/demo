package Repository;

import Entity.Person;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private static List<Person> list = new ArrayList<>();


    public void add(Person person) {
        list.add(person);
    }

    public static Person getById(int id) {
        Person person = new Person();
        for (Person tmp : list) {
            if (tmp.getId() == id) {
                person = tmp;
            }
        }
        return person;
    }
}
