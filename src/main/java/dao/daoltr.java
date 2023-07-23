package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.dtoltr;
import dto.dtostd;

public class daoltr {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("lt");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();



public void insert(dtoltr d) {
et.begin();
em.persist(d);
et.commit();
}


public dtoltr fetch(String el) {
	dtoltr d= em.find(dtoltr.class, el);
	return d;
}


public List<dtoltr> fetchall() {
	Query q= em.createQuery("select ter from lecture ter");
	List<dtoltr> l= q.getResultList();
	return l;
}


public String remove(String el) {
	dtoltr d= em.find(dtoltr.class, el);
	et.begin();
	em.remove(d);
	et.commit();
	return "rmd";
}
}