package gradleCRUD;

import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;
import java.util.Scanner;
import javax.persistence.OneToOne;

public class AnkitCRUD 
{
    public static void main( String[] args )
    {
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
    
            //laptop 
            Laptop laptop = new Laptop();
             laptop.setLid(6011);
             laptop.setLname("Hp");
             
//             laptop.setLid(6012);
//             laptop.setLname("Hpp");
//             
//        
           
            st.setId(n);
            st.setName(name);
            st.setCity(city);
            st.getLaptop().add(laptop);
            
            laptop.getStudentgradle().add(st);
             
            //for students
            Configuration con =new Configuration().configure().addAnnotatedClass(StudentGradle.class).addAnnotatedClass(Laptop.class);
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            org.hibernate.Transaction tx= session.beginTransaction();
             session.save(st);
             session.save(laptop);
             tx.commit();
             
             //for laptop
             
         } 
        else if(choice == 2)
        {
        //Delete data code
        	System.out.println("Enter ID to be Deleted: ");
        	int id =sc.nextInt();
        	
        deleteCRUD dc = new deleteCRUD (id);
        }
        else if(choice ==3)
        {
        	//get data
        	System.out.println("Enter ID to get INfo :");
        	int id =sc.nextInt();
        	fetchCRUD fc = new fetchCRUD(id);
        }
        
//        
//        int n= sc.nextInt();
//   
//        System.out.println("Enter name : ");
//         String name= sc.next();
//   
//        System.out.println("Enter an city: ");
//        String city= sc.next();
//   
//        
//        st.setId(n);
//        st.setName(name);
//        st.setCity(city);
//        
//        Configuration con =new Configuration().configure().addAnnotatedClass(StudentGradle.class);
//        
//        SessionFactory sf = con.buildSessionFactory();
//        
//         Session session = sf.openSession();
//        
//         org.hibernate.Transaction tx= session.beginTransaction();
//         session.save(st);
//         tx.commit();
         
    }
}
