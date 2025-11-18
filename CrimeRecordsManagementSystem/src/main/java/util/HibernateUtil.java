package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    // Create only one SessionFactory instance (singleton)
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create configuration instance & read hibernate.cfg.xml
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    // Get the active SessionFactory
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    // Close the SessionFactory when app stops
    public static void shutdown() {
        getSessionFactory().close();
    }
}