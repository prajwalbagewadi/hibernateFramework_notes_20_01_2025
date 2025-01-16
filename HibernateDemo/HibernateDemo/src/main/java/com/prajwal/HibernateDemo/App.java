package com.prajwal.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Employee emp1=new Employee();
        emp1.setEmpid(101);
        emp1.setEname("Prajwal");
        emp1.setEdept("Software");
        Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session session = sf.openSession();
        session.save(emp1);
    }
}
