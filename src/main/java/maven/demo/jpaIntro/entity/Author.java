package maven.demo.jpaIntro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	
	public Author() {
		super();
	}

	public Author(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Author [ID= " + id + ", Name= " + name + "]";
	}
}