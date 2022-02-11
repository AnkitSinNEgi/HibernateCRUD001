
package gradleCRUD;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;

public class fetchCRUD 

{
		private fetchCRUD() 
		{
			
		}
		
		public fetchCRUD(int id)
		{
			Configuration con =new Configuration().configure().addAnnotatedClass(StudentGradle.class).addAnnotatedClass(Laptop.class);
	         SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
	         org.hibernate.Transaction tx= session.beginTransaction();
	         //session.save(st);
			  StudentGradle st =(StudentGradle)session.get(StudentGradle.class,id);
			  
			  String laptopName = "";
			  
			 List<Laptop> laptopList= st.getLaptop();
			 
			 for(Laptop laptop: laptopList)
			 {
				 laptopName = laptop.getLname();
				 
			 }
			 
			 //Laptop laptop =(Laptop)session.get(Laptop.class,st.getId());
  	        //   Laptop laptop= st. 
			  System.out.println(st);
  	         System.out.println(laptopName);
	         	tx.commit();
//	         	
			
		}
	
//    public static void main( String[] args )
//    {
//      //  StudentGradle st =new StudentGradle();
//       // st.setId(106);
//       // st.setName("Akshat");
//       // st.setCity("Dehradun");
//        
//        Configuration con =new Configuration().configure().addAnnotatedClass(StudentGradle.class);
//         SessionFactory sf = con.buildSessionFactory();
//         Session session = sf.openSession();
//         org.hibernate.Transaction tx= session.beginTransaction();
//         //session.save(st);
//         //tx.commit();
//         
//         
//         StudentGradle st =(StudentGradle)session.get(StudentGradle.class,122);
//         
//         System.out.println(st);
//         	tx.commit();
//         	
//    }
}