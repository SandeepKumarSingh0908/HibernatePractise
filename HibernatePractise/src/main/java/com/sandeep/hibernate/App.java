package com.sandeep.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sandeep.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("Project Started");
       
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       
       Student student = new Student(1,"Sandeep","Ranchi");
       
       System.out.println(student);
       Session session = factory.openSession();
       
       Transaction tx = session.beginTransaction();
       
       session.save(student);
       
       tx.commit();
       
       session.close();
       
       
       
    }
}
