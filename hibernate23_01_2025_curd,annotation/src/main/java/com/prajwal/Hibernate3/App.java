package com.prajwal.Hibernate3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.time.LocalDate;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "helloworld" );
        
        Emp e1=new Emp();
        e1.setEid(101);
        e1.setEname("abc");
        e1.setDname("Engg");
        e1.setDesg("assoicate Engg");
        e1.setSal(45000.00);
        e1.setLogin(LocalDate.now());
        
        Emp e2=new Emp();
        e2.setEid(102);
        e2.setEname("def");
        e2.setDname("Engg");
        e2.setDesg("assoicate Engg");
        e2.setSal(45000.00);
        e2.setLogin(LocalDate.now());
        
        Emp e3=new Emp();
        e3.setEid(103);
        e3.setEname("hij");
        e3.setDname("hr");
        e3.setDesg("assoicate hr");
        e3.setSal(35000.00);
        e3.setLogin(LocalDate.now());
        
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Emp.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        //create / insert operation
        session.save(e1);
        session.save(e2);
        session.save(e3);
        
        
        tx.commit();
        
        Transaction tx1 = session.beginTransaction();
        
        //update operation
        Emp g1= session.get(Emp.class,101);
        g1.setDesg("SDE1 Engg");
        session.update(g1);
        
        tx1.commit();
        
        Transaction tx2 = session.beginTransaction();
        
        //delete operation
        Emp D1= session.get(Emp.class,103);
        session.delete(D1);
        
        tx2.commit();
        
        Transaction tx3 = session.beginTransaction();
        //read or fetching operation
        Emp r1=null;
        r1= session.get(Emp.class,101);
        r1.toString();
        tx3.commit();
        System.out.println("retrieved obj="+r1);
    }
}
