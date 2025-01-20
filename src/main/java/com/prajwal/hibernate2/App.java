package com.prajwal.hibernate2;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "helloworld" );
        
        Product p1=new Product();
        p1.setPid(1);
        p1.setPname("kitkat");
        p1.setPcat("grocery");
        p1.setPrice(40.00);
        
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class);
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(sr);
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(p1);
        tx.commit();
    }
}
