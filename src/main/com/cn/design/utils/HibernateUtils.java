package com.cn.design.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by lijunhong on 17/1/24.
 */
public class HibernateUtils {

    public static SessionFactory sessionFactory;

    static {

        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
    }
}
