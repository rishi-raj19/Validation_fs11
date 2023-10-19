package com.example.UserManagementWithValidation.configuration;

import com.example.UserManagementWithValidation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
class BeanManager {

    @Bean
    public List<User> getInitializedList()
    {
        User initUser = new User(7,"Rishi Raj","rishirajrd4@gmail.cpm","Abcd@123","7004463346",LocalDate.of(1996,12,19),24 ,LocalDate.now(), LocalTime.now());
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
