package com.baloch.relationshipMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	RelationshipMapping laptop=new RelationshipMapping();
    	laptop.setLid(101);
    	laptop.setLname("dell");
    	
    	
    	Student st=new Student();
    	st.setRollNo(19);
    	st.setSname("Muhammad Bux");
    	st.setMarks(69);
    	st.getLaptop().add(laptop);
    	laptop.getStudents().add(st);
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(RelationshipMapping.class).addAnnotatedClass(Student.class);
    
    	SessionFactory sf=cfg.buildSessionFactory();
    	
    	
    	Session s=sf.openSession();
    	
    	Transaction tx=s.beginTransaction();
    	
    	s.save(laptop);
    	s.save(st);
    	System.out.println("the data is saved");
    	tx.commit();
    	
    }
}
