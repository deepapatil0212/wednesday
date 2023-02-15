package hiber;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Create123 {
public static void main(String[] args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager =entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction = entityManager.getTransaction();
Hiber23 hiber23 = new Hiber23();
hiber23.setE_id(1);
hiber23.setName("putti");
hiber23.setAddress("raichur");
entityTransaction.begin();
entityManager.persist(hiber23);
entityTransaction.commit();
}
}
