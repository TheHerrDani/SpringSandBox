package com.WebShop_Quince.Daniel_Sipos_Project;

import People.PeopleDao;
import People.PeopleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PeopleDao peopleDao(){
        return new PeopleDao();
    }

    @Bean
    public PeopleService peopleService(){
        return new PeopleService(peopleDao());
    }
}
