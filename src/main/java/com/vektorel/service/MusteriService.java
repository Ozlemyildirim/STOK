package com.vektorel.service;

import com.vektorel.entity.Musteri;
import com.vektorel.util.SkartHibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MusteriService {

    public Musteri save(Musteri entity) {
        Session session=SkartHibernateUtil.getSessionFactory().openSession();
        Transaction t;
        t = session.beginTransaction();
        session.save(entity);
        t.commit();
      return entity;
       
    }

    public Musteri update(Musteri entity) {
         Session session=SkartHibernateUtil.getSessionFactory().openSession();
        Transaction t;
        t = session.beginTransaction();
        session.update(entity);
        t.commit();
        return entity;

    }

    public boolean delete(Musteri entity) {
         Session session=SkartHibernateUtil.getSessionFactory().openSession();
        Transaction t;
        t = session.beginTransaction();
        session.delete(entity);
        t.commit();
        return true;
    }

    public List<Musteri> getAll(Class cls) {
        return null;

    }
}
