package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.User_Data;

public class User_Data_Access 
{
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
      EntityManager em=emf.createEntityManager();
      EntityTransaction et=em.getTransaction();
 
      //method for SignUp method
      public void forward(User_Data user_Data)
      {
    	 et.begin();
    	 em.persist(user_Data);
    	 et.commit();  
      }
      
      //method for Login phone no method
      public User_Data Login(long mobile)
      {
    	  return em.find(User_Data.class, mobile);
      }
	
      
      //method for Login email 
      //this nativequery it's support SQL select * from user_data
//      public Query Login(String email)
//      {
//		return em.createNativeQuery("select * from user_data where email=?1",User_Data.class).setParameter(1, email);
//    	  
//      }
      
      
      //JPAQuery it's support select n from user_data n   method
      public User_Data Login(String email)
      {
    	List<User_Data> list=em.createQuery("select x from User_Data x where email=?1").setParameter(1, email).getResultList();
    	if(list.isEmpty())
    	{
    		return null;
    	}
    	else
    	{
    		return list.get(0);
    	}
      }
      
      
      //fetch All data method
      
      public List<User_Data> fetchAll()
      {
    	 return em.createQuery("select n from User_Data n").getResultList();
    	        
      }
      
      
      //delete data by id
      
      public User_Data find(long mobile)
      {
    	  return em.find(User_Data.class, mobile);
      }
      
	  public void delete(User_Data user_Data)
	  {
		et.begin();
		em.remove(user_Data);
		et.commit();
	  }
	  
	  
	  
	  //update method
	  public void update(User_Data user_Data)
      {
    	 et.begin();
    	 em.merge(user_Data);
    	 et.commit();  
      }
	  
}
