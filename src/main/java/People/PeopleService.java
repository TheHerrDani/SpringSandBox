package People;

import java.util.List;

public class PeopleService {
    private PeopleDao peopleDao;

    public PeopleService(PeopleDao peopleDao) {
        this.peopleDao = peopleDao;
    }

    public void savePeople(PeopleDao peopleDaoToSave) {
        //BL
        peopleDao.setFirstName(peopleDaoToSave.getFirstName().concat(" Teszt"));
        this.peopleDao.savePeople(peopleDaoToSave);
    }

    public void plusYears(PeopleDao peopleDaoToChange, int age) {
        int newAge = peopleDaoToChange.getAge() + age;
        peopleDaoToChange.setAge(newAge);
    }

    public List<PeopleDao> getPeoples() {
        return peopleDao.getPeoples();
    }
}
