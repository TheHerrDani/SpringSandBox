package People;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PeopleServiceTests {

    @Mock
    private PeopleDao peopleDao;

    @InjectMocks
    private PeopleService peopleService;

    @Test
    public void testSave() {
        PeopleDao peopleDaoTest = new PeopleDao(1,"Daniel","Sipos", "Sipos.Herr.Dani@gmail.com",18);
        peopleService.plusYears(peopleDaoTest,10);
        verify(peopleDao).setAge(28);
        System.out.println(peopleDaoTest.getAge());
    }
}
