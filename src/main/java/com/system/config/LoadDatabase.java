package com.system.config;

//import org.springframework.boot.CommandLineRunner;
//
//import com.system.entities.Schoolclass;
//import com.system.entities.Student;
//import com.system.entities.User;
//import com.system.repositories.SchoolclassRepository;
//import com.system.repositories.StudentRepository;
//import com.system.repositories.UserRepository;

/***
 * 
 * This is an example how to inject data into the Database manually (per code)
 * 
 * @author Dennis
 *
 */

//@Configuration
//class LoadDatabase {
//	
////	@Bean
//	CommandLineRunner initDatabase(UserRepository rep1, SchoolclassRepository rep2, StudentRepository rep3) {
//		return args -> {
////			System.out.println("Preloading " + rep1.save(new User("User1","pw1","email1@email.com")));
////			System.out.println("Preloading " + rep1.save(new User("User2","pw2","email2@email.com")));
////			
////			System.out.println("Preloading " + rep2.save(new Schoolclass("4A",1)));
////			System.out.println("Preloading " + rep2.save(new Schoolclass("4B",2)));
////			
////			
////			System.out.println("Preloading " + rep3.save(new Student()));
////			System.out.println("Preloading " + rep3.save(new Student()));
////			System.out.println("Preloading " + rep3.save(new Student()));
////			System.out.println("Preloading " + rep3.save(new Student()));
//			
//		};
//	}
//}