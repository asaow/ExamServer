/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examserver.database;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Grupp 2
 */
public class MyHibernateUtil {

    private static final SessionFactory sessionFactory;
    static {
        try {
            Configuration configuration= new Configuration() ;
            configuration.configure();
            StandardServiceRegistry serviceRegistry= 
                    new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory=configuration.buildSessionFactory(serviceRegistry);
    }
    catch(Throwable ex) {
        System.err.println("Initial SessionFactorycreationfailed." + ex);
        throw new ExceptionInInitializerError(ex);
    }
}

public static SessionFactory getSessionFactory() {
return sessionFactory;
}
}


    
    

