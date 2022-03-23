package maven.demo.jpaIntro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_author")
public class BookAuthor {
	
	@Id
	@Column(name = "isbn")
	private String isbn;
	@Column(name = "title")
	private String title;
	@Column(name = "price")
	private int price;
	@Column(name = "aid")
	private int aid;
	@Column(name = "aname")
	private String aname;
	
//	private Book book;
//	private Author author;
	
	public BookAuthor() {
		super();
	}

	public BookAuthor(Book book, Author author) {
		super();
		this.isbn = book.getIsbn();
		this.title = book.getTitle();
		this.price = book.getPrice();
		this.aid = author.getId();
		this.aname = author.getName();
//		this.book=book;
//		this.author=author;
	}

//	public Book getBook() {
//		return book;
//	}
//
//	public void setBook(Book book) {
//		this.book = book;
//	}
//
//	public Author getAuthor() {
//		return author;
//	}
}
