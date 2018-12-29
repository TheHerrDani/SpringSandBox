package People;

import java.util.List;

public class PeopleService {
    private PeopleDao peopleDao;

    public PeopleService(PeopleDao peopleDao) {
        this.peopleDao = peopleDao;
    }

    public void savePerson(Person personToSave) {
        //BL
        personToSave.setFirstName(personToSave.getFirstName().concat(" Teszt"));
        this.peopleDao.savePeople(personToSave);
    }

    public void plusYears(Person personToSave, int age) {
        int newAge = personToSave.getAge() + age;
        personToSave.setAge(newAge);
    }

    public List<Person> getPeoples() {
        return peopleDao.getPeople();
    }
}
