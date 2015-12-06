package com.vektorel.service;

import com.vektorel.entity.Skart;
import com.vektorel.util.SkartHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SkartService {

    public Skart save(Skart entity) {
        Session session=SkartHibernateUtil.getSessionFactory().openSession();
        Transaction t;
        t = session.beginTransaction();
        session.save(entity);
        t.commit();
      return entity;
       
    }

    public Skart update(Skart entity) {
         Session session=SkartHibernateUtil.getSessionFactory().openSession();
        Transaction t;
        t = session.beginTransaction();
        session.update(entity);
        t.commit();
        return entity;

    }

    public boolean delete(Skart entity) {
         Session session=SkartHibernateUtil.getSessionFactory().openSession();
        Transaction t;
        t = session.beginTransaction();
        session.delete(entity);
        t.commit();
        return true;
    }

    public List<Skart> getAll(Class cls) {
    Session session = SkartHibernateUtil.getSessionFactory().openSession();
            Criteria criteria =session.createCriteria(Skart.class);
            return criteria.list();

    }
}
