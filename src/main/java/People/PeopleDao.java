package People;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PeopleDao {

    private List<Person> people = new CopyOnWriteArrayList<>();

    public void savePeople(Person person) {
        people.add(person);
    }

    public List<Person> getPeople() {
        return new ArrayList<>(people);
    }
}
