
package gradleCRUD;

import java.util.List;

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
		
//		 Configuration con =new Configuration().configure().addAnnotatedClass(StudentGradle.class);
		Configuration con =new Configuration().configure().addAnnotatedClass(StudentGradle.class).addAnnotatedClass(Laptop.class);
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
  
}


