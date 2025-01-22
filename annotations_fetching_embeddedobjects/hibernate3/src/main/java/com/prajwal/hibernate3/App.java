package com.prajwal.hibernate3;

import org.hibernate.cfg.Configuration;

//import jakarta.transaction.Transaction;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "helloworld" );
        
        Product_SubCategory pcat1=new Product_SubCategory(); 
        pcat1.setPcat("grocery_item");
        pcat1.setP_subcat("biscuits");
        
        Product p1=new Product();
        p1.setPid(1);
        p1.setPname("Parle Hide Seek");
        p1.setPcat(pcat1);
        p1.setPrice(45.00);
        Product p2=new Product();
        p2.setPid(2);
        p2.setPname("Britannia Bourbon");
        p2.setPcat(pcat1);
        p2.setPrice(10.00);
        Product p3=new Product();
        p3.setPid(3);
        p3.setPname("Cadbury Oreo Original Vanilla");
        p3.setPcat(pcat1);
        p3.setPrice(10.00);
        
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        
        //create and insert
        Transaction tx= session.beginTransaction();
        session.save(p1);
        session.save(p2);
        session.save(p3);
        tx.commit();
        
        //fetching values from Database 
        Transaction tx2= session.beginTransaction();
        //object
        Product result=null;
        result=(Product)session.get(Product.class,1);
        result.toString();
        tx2.commit();
        System.out.println(result);
    }
}
