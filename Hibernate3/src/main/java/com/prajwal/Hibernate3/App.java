package com.prajwal.Hibernate3;

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
        System.out.println( "helloworld" );
//        Emp e1=new Emp();
//        e1.setEid(101);
//        e1.setEname("abc");
//        e1.setDname("Engg");
//        e1.setDesg("assoicate Engg");
//        e1.setSal(45000.00);
        Emp e2=new Emp();
        e2.setEid(102);
        e2.setEname("def");
        e2.setDname("Engg");
        e2.setDesg("assoicate Engg");
        e2.setSal(45000.00);
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Emp.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //session.save(e1);
        tx.commit();
        Session session1=sf.openSession();
        tx = session1.beginTransaction();
        session1.save(e2);
        tx.commit();
    }
}
