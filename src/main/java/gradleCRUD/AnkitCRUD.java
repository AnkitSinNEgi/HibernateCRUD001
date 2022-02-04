package gradleCRUD;

import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;

public class AnkitCRUD 
{
    public static void main( String[] args )
    {
        StudentGradle st =new StudentGradle();
        st.setId(102);
        st.setName("Ankit");
        st.setCity("Delhi");
        
        Configuration con =new Configuration().configure().addAnnotatedClass(StudentGradle.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
         Session session = sf.openSession();
        
         org.hibernate.Transaction tx= session.beginTransaction();
         session.save(st);
         tx.commit();
         
    }
}
