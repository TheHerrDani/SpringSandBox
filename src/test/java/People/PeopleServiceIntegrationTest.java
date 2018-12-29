package People;

import com.WebShop_Quince.Daniel_Sipos_Project.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class PeopleServiceIntegrationTest {
    @Test
    public void testSaveThanList(){
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){
            PeopleService peopleService = context.getBean(PeopleService.class);
            PeopleDao peopleDao = new PeopleDao(1,"Daniel","Sipos", "Sipos.Herr.Dani@gmail.com",18);
            peopleService.plusYears(peopleDao,10);
            assertEquals(peopleDao.getAge(),28);
        }
    }
}
