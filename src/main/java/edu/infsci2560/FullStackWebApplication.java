package edu.infsci2560;

import edu.infsci2560.models.Customer;
import edu.infsci2560.models.TennisBalls;
import edu.infsci2560.models.TennisBalls.BallType;
import edu.infsci2560.models.TennisRackets;
import edu.infsci2560.models.TennisRackets.RacketType;
import edu.infsci2560.models.TennisOvergrips;
import edu.infsci2560.models.TennisOvergrips.OvergripType;
import edu.infsci2560.models.TennisReplacementgrips;
import edu.infsci2560.models.TennisReplacementgrips.ReplacementgripType;
import edu.infsci2560.models.TennisShoes;
import edu.infsci2560.models.TennisShoes.ShoeType;
import edu.infsci2560.models.TennisStrings;
import edu.infsci2560.models.TennisStrings.StringType;

import edu.infsci2560.repositories.CustomerRepository;
import edu.infsci2560.repositories.BallRepository;
import edu.infsci2560.repositories.RacketRepository;
import edu.infsci2560.repositories.OvergripRepository;
import edu.infsci2560.repositories.ShoeRepository;
import edu.infsci2560.repositories.StringRepository;
import edu.infsci2560.repositories.ReplacementgripRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);
    
        BallRepository ballRepo = ctx.getBean(BallRepository.class);
        ballRepo.save(new TennisBalls(1L, "Normal", BallType.Slazenger));
        
        OvergripRepository overgripRepo = ctx.getBean(OvergripRepository.class);
        overgripRepo.save(new TennisOvergrips(1L, "Pro", OvergripType.Wilson));
        
        RacketRepository racketRepo = ctx.getBean(RacketRepository.class);
        racketRepo.save(new TennisRackets(1L, "Blade 16x19", RacketType.Wilson));
        racketRepo.save(new TennisRackets(1L, "Pure drive 16x19", RacketType.Babolat));
        
        ReplacementgripRepository replacementgripRepo = ctx.getBean(ReplacementgripRepository.class);
        replacementgripRepo.save(new TennisReplacementgrips(1L, "Grip", ReplacementgripType.Wilson));
        
        
    }
}

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
 /*   @Bean
    public CommandLineRunner databaseDemo(CustomerRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));
            repository.save(new Customer("Billy", "Bean"));

            // fetch all customers
            log.info("[Database Demo] Customers found with findAll():");
            log.info("[Database Demo] -------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info("[Database Demo] " + customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Customer customer = repository.findOne(1L);
            log.info("[Database Demo] Customer found with findOne(1L):");
            log.info("[Database Demo] --------------------------------");
            log.info("[Database Demo] " + customer.toString());            

            // fetch customers by last name
            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
            log.info("[Database Demo] --------------------------------------------");
            for (Customer bauer : repository.findByLastName("Bauer")) {
                log.info("[Database Demo] " + bauer.toString());
            }            
        };
    }
}*/
