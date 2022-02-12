
package gradleCRUD;

import java.util.List;
import java.util.Scanner;

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
		  
		 List<Laptop> laptopList= st.getLaptop();
		 Scanner sc = new Scanner(System.in);
		 System.out.print("What to you want to delete: \n1. Person, \n2. Laptops\n ");
		 int dltOption = sc.nextInt();
		 if (dltOption == 1) {
			 for(Laptop laptop: laptopList)
			 {
				 session.remove(laptop);
			 }
			 session.remove(st);
		 } else {
			 System.out.println("Do you want to delete all laptops \n1.All \n2. Delete by laptop id");
			 int laptopDltOption = sc.nextInt();
			 
			 fetchCRUD fc = new fetchCRUD(id);
			 
			 if(laptopDltOption == 1) {
				 for(Laptop laptop: laptopList)
				 {
					 session.remove(laptop);
				 }
			 }
			 
			 while(laptopDltOption == 2) {
				 System.out.print("Enter Laptop ID to be deleted: ");
				 int ltId = sc.nextInt();
				 for(Laptop laptop: laptopList)
				 {
					 if(laptop.getLid() == ltId)
						 session.remove(laptop);
				 }
				 
				 System.out.print("Delete more? Enter 2, else enter 1: ");
				 laptopDltOption = sc.nextInt();
			 }
	         
		 }
         tx.commit();
	}
 
}


