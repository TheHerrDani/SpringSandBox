package People;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PeopleDao {
    private int ID;
    private String firstName;
    private String lastName;
    private String eMail;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private List<PeopleDao> peoples = new CopyOnWriteArrayList<>();

    public PeopleDao() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public PeopleDao(int ID, String firstName, String lastName, String eMail, int age) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PeopleDao{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", age=" + age +
                ", peoples=" + peoples +
                '}';
    }

    public void savePeople(PeopleDao peopleDao) {
        peoples.add(peopleDao);
    }

    public List<PeopleDao> getPeoples() {
        return new ArrayList<>(peoples);
    }
}
