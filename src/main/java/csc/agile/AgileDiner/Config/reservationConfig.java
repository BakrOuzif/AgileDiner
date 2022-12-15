package csc.agile.AgileDiner.Config;

import java.time.LocalDateTime;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import csc.agile.AgileDiner.Class.Reservation;
import csc.agile.AgileDiner.Reposetories.reservationRepository;

@Configuration
public class reservationConfig {
    @Bean
    CommandLineRunner commandLineRunner(reservationRepository repository){
        int party = 3;
        String email = "haha@outlook.com";
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        LocalDateTime now = LocalDateTime.now();  
        String comment = "I Have a gluten allergy";
        return args -> {
            Reservation res = new Reservation(

                party,
                date,
                email,
                now,
                comment
            );
            repository.save(res);
        };
    }
}
