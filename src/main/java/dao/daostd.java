package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.dtostd;

public class daostd {
	EntityManagerFactory emfst=Persistence.createEntityManagerFactory("st");
	EntityManager emst=emfst.createEntityManager();
	EntityTransaction etst=emst.getTransaction();
	public void insertstd(dtostd ds) {
		etst.begin();
		emst.persist(ds);
		etst.commit();
		}


		public String delete(String usn) {

		dtostd d=	emst.find(dtostd.class, usn);
		etst.begin();
		emst.remove(d);
		etst.commit();
			return "deleted";
		}


		public dtostd fetch(String usn) {
		dtostd d=	emst.find(dtostd.class, usn);
			return d;
		}


		public String update(String us, String date, int eng1, int hin1, int kan1, int mat1, String mname, String name,
				int scs1, int ttl, double prc) {
		dtostd d=	emst.find(dtostd.class, us);
		d.setDate(date);
		d.setEnglish(eng1);
		d.setHindi(hin1);
		d.setKannada(kan1);
		d.setMaths(mat1);
		d.setMother_name(mname);
		d.setName(name);
		d.setPercentage(prc);
		d.setScience(scs1);
		d.setTotal(ttl);
		
		etst.begin();
		emst.merge(d);
		etst.commit();
			return "upd";
		}


		public List<dtostd> fetchall() {
		Query q=	emst.createQuery("select ter from student ter");
		List<dtostd> d= q.getResultList();
			return d;
		}
}