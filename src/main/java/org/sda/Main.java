package org.sda;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        System.out.println("Hello Hibernate!");

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Worker.class);
        //configuration.

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        Department department = new Department("IT");
        Worker bob = new Worker("Bob");
        logger.info("Worker before save {}", bob);
        session.persist(bob);
        logger.info("Worker after save {}", bob);

        transaction.commit();

    }
}