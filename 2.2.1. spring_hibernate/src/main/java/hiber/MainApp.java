package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

/*      userService.add(new User("Алексей", "Цуцкарёв", "wertor@mail.ru", new Car("Opel Astra", 1234)));
      userService.add(new User("Мария", "Сазыкина", "manechka@mail.ru"));
      userService.add(new User("Екатерина", "Цуцкарёва", "kolgotka@mail.ru"));
      userService.add(new User("Максим", "Серов", "maksonchik@mail.ru", new Car("BMW", 5678)));

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println("Car = " + user.getCar());
         System.out.println("");
      }*/
      System.out.println(userService.getUserFromCar("BMW", 5678));

      context.close();
   }
}
