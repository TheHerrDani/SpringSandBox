package People;


import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class PeopleDaoTests {

    PeopleDao peopleDao = new PeopleDao();

    @Test
    public void testSavePeople(){
        PeopleDao testDao = new PeopleDao(1,"Hund","Jóska","valami@gmail.com",18);
        peopleDao.savePeople(testDao);
        assertEquals(List.of(testDao),peopleDao.getPeople());
    }
}
