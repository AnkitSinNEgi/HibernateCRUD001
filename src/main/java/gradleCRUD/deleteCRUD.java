
package gradleCRUD;

import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;

public class deleteCRUD 
{
	private  deleteCRUD() 
	{
	}
	
	public deleteCRUD(int id)
	{
		
		 Configuration con =new Configuration().configure().addAnnotatedClass(StudentGradle.class);
         SessionFactory sf = con.buildSessionFactory();
         Session session = sf.openSession();
         org.hibernate.Transaction tx= session.beginTransaction();
         //session.save(st);
         //tx.commit();
         
         
         StudentGradle st =(StudentGradle)session.get(StudentGradle.class,id);
         
         System.out.println(st);
         
         	session.remove(st);
         	tx.commit();
	}
  
	
	
	
	
//	public static void main( String[] args )
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
//         StudentGradle st =(StudentGradle)session.get(StudentGradle.class,145);
//         
//         System.out.println(st);
//         
//         	session.remove(st);
//         	tx.commit();
//         	
//    }
}


