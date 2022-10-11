package hibernateproject;
import org.hibernate.cfg.Configuration;



import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class Tester



   public static void main(String[] args) {
        Configuration configuration=new Configuration();
         configuration.configure("hibernate.cfg.xml");
         System.out.println("works");
         SessionFactory factory=configuration.buildSessionFactory();
         Session session=factory.openSession();
         session.getTransaction().begin();
         Student student=new Student();
         student.setId(1);
         student.setFirstName("Gyana");
         student.setLastName("Ranjan");
         student.setEmail("gyanaranjan@gmail.com");
         session.save(student);
        session.getTransaction().commit();
         
    }



}
	

