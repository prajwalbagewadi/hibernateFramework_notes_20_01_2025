package com.prajwal.Hibernate3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

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
        //Embedded objects: object(n1) inside object(e1)
        EmpName n1=new EmpName();
        n1.setFname("abc");
        n1.setMname("abc");
        n1.setLname("abc");
        e1.setEname(n1);
        e1.setDname("Engg");
        e1.setDesg("assoicate Engg");
        e1.setSal(55000.00);
        e1.setLogin(LocalDate.now());
        
        Emp e2=new Emp();
        e2.setEid(102);
        EmpName n2=new EmpName();
        n2.setFname("def");
        n2.setMname("def");
        n2.setLname("def");
        e2.setEname(n2);
        e2.setDname("Engg");
        e2.setDesg("assoicate Engg");
        e2.setSal(45000.00);
        e2.setLogin(LocalDate.now());
        
        Emp e3=new Emp();
        e3.setEid(103);
        EmpName n3=new EmpName();
        n3.setFname("hij");
        n3.setMname("hij");
        n3.setLname("hij");
        e3.setEname(n3);
        e3.setDname("hr");
        e3.setDesg("assoicate hr");
        e3.setSal(35000.00);
        e3.setLogin(LocalDate.now());
        
        Emp e4=new Emp();
        e4.setEid(104);
        EmpName n4=new EmpName();
        n4.setFname("klm");
        n4.setMname("klm");
        n4.setLname("klm");
        e4.setEname(n4);
        e4.setDname("hr");
        e4.setDesg("hr");
        e4.setSal(45000.00);
        e4.setLogin(LocalDate.now());
        
        Dept d1=new Dept();
        d1.setDid(1);
        d1.setDloc("PUNE");
        d1.setDname("Engineering.");
        
        Dept d2=new Dept();
        d2.setDid(2);
        d2.setDloc("PUNE");
        d2.setDname("HumanResource");
        
        
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Emp.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        //create / insert operation
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(e4);
        
        tx.commit();
        
        Configuration cfg1 = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Dept.class);
        SessionFactory sf1 = cfg1.buildSessionFactory();
        Session sessiondept = sf1.openSession();
        Transaction txd1 = sessiondept.beginTransaction();
        
        sessiondept.save(d1);
        sessiondept.save(d2);
        
        txd1.commit();
        
        Transaction tx1 = session.beginTransaction();
        
        //update operation
        Emp g1= session.get(Emp.class,101);
        g1.setDesg("SDE1 Engg");
        session.update(g1);
        
        tx1.commit();
        
        Transaction tx2 = session.beginTransaction();
        
        //delete operation
        Emp D1= session.get(Emp.class,103);
        //session.delete(D1);
        
        tx2.commit();
        
        Transaction tx3 = session.beginTransaction();
        //read or fetching operation
        Emp r1=null;
        r1= session.get(Emp.class,101);
        r1.toString();
        tx3.commit();
        System.out.println("retrieved obj="+r1);
        
        
        //HQL (hibernate query Language): Database independent lang.
        System.out.println("Select.query:");
        String hqlString="from Emp";
        List<Emp> objects = session.createQuery(hqlString,Emp.class).list();
        objects.forEach(obj -> {
        	obj.toString();
        	System.out.println(obj);
        });
        
        //where
        System.out.println("Where.query:");
        hqlString="from Emp E where E.Sal > :MinSal";
        Query<Emp> query = session.createQuery(hqlString,Emp.class).setParameter("MinSal", 50000.00);
        List<Emp> objects1 = query.list(); 
        objects1.forEach(obj1 -> {
        	obj1.toString();
        	System.out.println(obj1);
        });
        
        //order by
        System.out.println("orderBy.query:");
        hqlString="from Emp E order by E.Sal DESC";
        List<Emp> objects2 = session.createQuery(hqlString,Emp.class).list();
        objects2.forEach(obj2 -> {
        	obj2.toString();
        	System.out.println(obj2);
        });
        
        //joint
    }
}
