package ma.fsm.activite3_ahansal_salaheddine__part1;

import ma.fsm.activite3_ahansal_salaheddine__part1.entities.Patient;
import ma.fsm.activite3_ahansal_salaheddine__part1.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.util.Date;

@SpringBootApplication
public class Activite3AhansalSalaheddinePart1Application implements  CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(Activite3AhansalSalaheddinePart1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //method 1 avec setters
       /* Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("Mohamed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);*/

       //method 2 avec Constructor arg
        //Patient patient2 = new Patient(null,"Yassine",new Date(),false,123);

        //method 3 En utilisant buider
       /* Patient patient3 = Patient.builder()
                .nom("Imane")
                .dateNaissance(new Date())
                .score(56)
                .malade(false)
                .build();*/

        //method 4
       /* patientRepository.save(new Patient(null,"Mohamed",new Date(),false,134));
        patientRepository.save(new Patient(null,"Hanane",new Date(),false,4321));
        patientRepository.save(new Patient(null,"Imane",new Date(),true,134));*/
    }
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return args -> {
            UserDetails u1 = jdbcUserDetailsManager.loadUserByUsername("user11");
            UserDetails u2 = jdbcUserDetailsManager.loadUserByUsername("user22");
            UserDetails u3 = jdbcUserDetailsManager.loadUserByUsername("user33");

           if(u1==null)
                jdbcUserDetailsManager.createUser(User.withUsername("user11").password(passwordEncoder.encode("password1")).roles("USER").build());
           if(u2==null)
                jdbcUserDetailsManager.createUser(User.withUsername("user22").password(passwordEncoder.encode("password1")).roles("USER").build());
           if(u3==null)
                jdbcUserDetailsManager.createUser(User.withUsername("user33").password(passwordEncoder.encode("password1")).roles("USER","ADMIN").build());
        };
    }
}
