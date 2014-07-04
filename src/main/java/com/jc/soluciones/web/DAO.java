/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.soluciones.web;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author T107
 */
public class DAO {
    
    private static final ThreadLocal tl = new ThreadLocal();
    //private static final SessionFactory sessionFactory = new Configuration()
    private static final SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml").buildSessionFactory();
    public DAO(){}
    public static Session getSession() {
        Session session = (Session) DAO.tl.get();
        if(session ==null){
            session = sessionFactory.openSession();
            DAO.tl.set(session);
        }
        return session;
        }
    
    protected void begin(){
        getSession().beginTransaction();
    }
    protected void commit() {
        getSession().getTransaction().commit();
        
    }
    protected void rollback(){
    try{
        getSession().getTransaction().rollback();
        getSession().close();
    }catch(HibernateException e){    }
    DAO.tl.set(null);
    
    }
    public static void close(){
        getSession().close();
        DAO.tl.set(null);
    }
}
    
    
    

