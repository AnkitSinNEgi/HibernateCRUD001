package gradleCRUD;

import javax.transaction.Transaction;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;

public class AnkitCRUD 
{
    public static void main( String[] args )
    {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("rel_per");
		EntityManager emanager = emFactory.createEntityManager();
		emanager.getTransaction().begin();		

        StudentGradle st =new StudentGradle();
        
        System.out.println("Select Yout Option: ");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("  Enter 1 for new Data \n  Enter 2 to delete Data  \n  Enter 3 to  get Data ");
        int choice = sc.nextInt();
        if(choice == 1){
        	 //Insert data code goes here
        	 System.out.println(" Enter Unique ID ");
            int n= sc.nextInt();
       
            System.out.println("Enter name : ");
             String name= sc.next();
       
            System.out.println("Enter an city: ");
            String city= sc.next();
            
            st.setId(n);
            st.setName(name);
            st.setCity(city);
            
            //Input muliple laptops
//            System.out.println("Enter number of laptops to insert: ");
//            int lCount = sc.nextInt();
            
          //for students
//            Configuration con =new Configuration().configure().addAnnotatedClass(StudentGradle.class).addAnnotatedClass(Laptop.class);
//            SessionFactory sf = con.buildSessionFactory();
//            Session session = sf.openSession();
//            org.hibernate.Transaction tx= session.beginTransaction();
//            session.save(st);
            
            emanager.persist(st);
            
//            while(lCount-- > 0) {
//            	//input for laptop values
//                System.out.println(" Enter Laptop ID ");
//                int lapID= sc.nextInt();
//           
//                System.out.println("Enter Laptop Name  ");
//                 String lapname= sc.next();
//                 
//                 Laptop laptop = new Laptop();
//                 laptop.setLid(lapID);
//                 laptop.setLname(lapname);
//                 st.getLaptop().add(laptop);
//                 laptop.getStudentgradle().add(st);
////                 session.save(laptop);
//                 emanager.persist(laptop);
//            }
            
            System.out.println("Done!!!");
//             tx.commit();
//             
             //for laptop
             
         } 
//        else if(choice == 2)
//        {
//        //Delete data code
//        	System.out.println("Enter ID to be Deleted: ");
//        	int id =sc.nextInt();
//        	
//        deleteCRUD dc = new deleteCRUD (id);
//        }
//        else if(choice ==3)
//        {
//        	//get data
//        	System.out.println("Enter ID to get INfo :");
//        	int id =sc.nextInt();
//        	fetchCRUD fc = new fetchCRUD(id);
//        }
//        

		emanager.getTransaction().commit();
		emanager.close();
		emFactory.close();

         
    }
}
