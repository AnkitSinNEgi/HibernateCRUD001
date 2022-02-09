package gradleCRUD;

import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;
import java.util.Scanner;

public class AnkitCRUD 
{
    public static void main( String[] args )
    {
        StudentGradle st =new StudentGradle();
        
        System.out.println("Enter an id: ");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Enter new Data: \n 2. Delete a data: \n 3. Fetch data :");
        int choice = sc.nextInt();
        if(choice == 1){
        	 //Insert data code goes here
        	 
            int n= sc.nextInt();
       
            System.out.println("Enter name : ");
             String name= sc.next();
       
            System.out.println("Enter an city: ");
            String city= sc.next();
       
            
            st.setId(n);
            st.setName(name);
            st.setCity(city);
            
            Configuration con =new Configuration().configure().addAnnotatedClass(StudentGradle.class);
            
            SessionFactory sf = con.buildSessionFactory();
            
             Session session = sf.openSession();
            
             org.hibernate.Transaction tx= session.beginTransaction();
             session.save(st);
             tx.commit();
        
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
