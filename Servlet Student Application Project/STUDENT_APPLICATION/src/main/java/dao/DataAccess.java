package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.DataTransfer;

public class DataAccess {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// This method for store data to database
	public void save(DataTransfer dataTransfer) {
		entityTransaction.begin();
		entityManager.persist(dataTransfer);
		entityTransaction.commit();
	}

	// This method for fetching all students data
	public List<DataTransfer> FetchAll() {
		Query query = entityManager.createQuery("select s from DataTransfer s");
		List list = query.getResultList();
		return list;
	}

	// This method for fetch students data by Id
	public DataTransfer Fetchid(int Id) {
		return entityManager.find(DataTransfer.class, Id);

	}

	// This method for Update Students data
	public void update(DataTransfer dataTransfer) {
		entityTransaction.begin();
		entityManager.persist(dataTransfer);
		entityTransaction.commit();
	}

	// This method for delete Students data
	public void delete(DataTransfer dataTransfer) {
		entityTransaction.begin();
		entityManager.remove(dataTransfer);
		entityTransaction.commit();
	}
}
