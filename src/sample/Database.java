package sample;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Person> listPerson = new ArrayList<>();

    public static void setListPerson(List<Person> listPerson) {
        Database.listPerson = listPerson;
    }

    public static List<Person> getListPerson() {
        return listPerson;
    }

    public static void addPerson(Person person) {
        listPerson.add(person);
    }
}
