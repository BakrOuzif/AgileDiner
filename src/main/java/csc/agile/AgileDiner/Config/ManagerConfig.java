package csc.agile.AgileDiner.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import csc.agile.AgileDiner.Class.Manager;
import csc.agile.AgileDiner.Reposetories.ManagerRepository;

@Configuration
public class ManagerConfig {
    @Bean
    CommandLineRunner commandLineRunner1(ManagerRepository repository){
        String uname = "admin";
        String pwd = "admin";
        return args ->{
            Manager manager = new Manager(
                uname,
                pwd
            );
            repository.save(manager);
        };
    }
}
