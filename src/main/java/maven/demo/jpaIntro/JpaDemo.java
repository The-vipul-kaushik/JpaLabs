package maven.demo.jpaIntro;



import javax.persistence.Query;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import antlr.collections.List;
import maven.demo.jpaIntro.entity.Author;
import maven.demo.jpaIntro.entity.BookAuthor;
import maven.demo.jpaIntro.entity.Book;

public class JpaDemo {
	public static void main(String[] args) {
		
		System.out.println("start");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();
		
		
//		Author a1 = new Author(10, "A");
//		Author a2 = new Author(20, "B");
//		Author a3 = new Author(40, "D");
		
//		Book b = new Book("ISBN1", "Book X", 1000);
//		Book b1 = new Book("ISBN2", "Book Y", 2000);
//		Book b2 = new Book("ISBN3", "Book Z", 3000);
//		Book b3 = new Book("ISBN4", "Book A", 4000);
		
//		BookAuthor ba = new BookAuthor(b,a1);
//		BookAuthor ba2 = new BookAuthor(b1,a2);
//		BookAuthor ba3 =  new BookAuthor(b2,a3);

				

		em.getTransaction().begin();
		
//		em.persist(a1);                         //INSERTING NEW RECORDS IN AUTHOR
//		em.persist(a2);
//		em.persist(a3);
		
//		em.persist(b1);                         // INSERTING NEW RECORDS IN BOOK
//		em.persist(b2);
//		em.persist(b3);
		
//		em.persist(ba);                         // INSERTING NEW RECORDS IN BOOK_AUTHOR
//		em.persist(ba2);
//		em.persist(ba3);
		
//		a1.setName("A_new");
		
//		em.persist(b);
//		em.merge(a1);                           //UPDATING RECORDS IN AUTHOR
		em.getTransaction().commit();

//		Book data = em.find(Book.class, "ISBN1");
//		em.getTransaction().commit();
//		System.out.println(data.toString());
		
		
//		Query query1 = em.createQuery("SELECT title FROM Book");                     // (a). GETTING ALL BOOKS FROM BOOK_TABLE
//		System.out.println((Collection<Book>)query1.getResultList());
		
//		Query query1 = em.createQuery("SELECT title FROM BookAuthor WHERE aname='A' ");                     // (b). GETTING ALL BOOKS WRITTEN BY GIVEN AUTHOR NAME
//		System.out.println((Collection<Book>)query1.getResultList());

//		Query query1 = em.createQuery("SELECT title FROM Book WHERE price BETWEEN 500 AND 1000");                     // (c). GETTING ALL BOOKS with Price range 500-1000
//		System.out.println((Collection<Book>)query1.getResultList());

		
		Query query1 = em.createQuery("SELECT aname from BookAuthor WHERE isbn='ISBN3' ");                     // (c). GETTING author name for given book id
		System.out.println((Collection<Book>)query1.getResultList());

		
		System.out.println("end");
	}
	
}


