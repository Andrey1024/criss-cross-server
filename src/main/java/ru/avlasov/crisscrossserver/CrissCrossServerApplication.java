package ru.avlasov.crisscrossserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.avlasov.crisscrossserver.Auth.model.Role;
import ru.avlasov.crisscrossserver.Auth.model.User;
import ru.avlasov.crisscrossserver.Auth.repository.RoleRepository;
import ru.avlasov.crisscrossserver.Auth.repository.UserRepository;

import java.util.HashSet;

@SpringBootApplication
public class CrissCrossServerApplication {

	@Bean
    public CommandLineRunner demo(UserRepository userRepository, RoleRepository roleRepository) {
	    return args -> {
	        Role admin = roleRepository.save(new Role("ADMIN"));
	        Role user = roleRepository.save(new Role("USER"));

	        User user1 = userRepository.save(new User("admin", "admin", new HashSet<Role>(){{add(admin);}}));

	        admin.setUsers(new HashSet<User>(){{add(user1);}});
        };
    }

	public static void main(String[] args) {
		SpringApplication.run(CrissCrossServerApplication.class, args);
	}
}
