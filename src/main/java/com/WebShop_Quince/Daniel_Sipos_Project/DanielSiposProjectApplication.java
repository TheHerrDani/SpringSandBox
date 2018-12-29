package com.WebShop_Quince.Daniel_Sipos_Project;

import People.PeopleDao;
import People.PeopleService;
import People.Person;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DanielSiposProjectApplication {

	/*public static void main(String[] args) {
		SpringApplication.run(DanielSiposProjectApplication.class, args);
	}*/
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){

			PeopleDao peopleDao = (PeopleDao) context.getBean("peopleDao");

			PeopleDao peopleDao2 = context.getBean(PeopleDao.class);
			peopleDao2.savePeople(new Person(1,"Daniel","Sipos", "Sipos.Herr.Dani@gmail.com",18));
			System.out.println(peopleDao2.getPeople());

			PeopleService peopleService = (PeopleService) context.getBean("peopleService");
			peopleService.savePerson(new Person(1,"Daniel","Sipos", "Sipos.Herr.Dani@gmail.com",18));
			System.out.println(peopleService.getPeoples());

		}
	}

}

