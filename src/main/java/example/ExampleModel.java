package example;
import java.time.LocalDateTime;

import com.github.mygreen.supercsv.annotation.CsvBean;
import com.github.mygreen.supercsv.annotation.CsvColumn;
import com.github.mygreen.supercsv.annotation.format.CsvDateTimeFormat;

@CsvBean
public class ExampleModel {
	
	@CsvColumn(number = 1, label = "ID")
	private int id;
	@CsvColumn(number = 2, label = "FirstName")
	private String firstName;
	@CsvColumn(number = 3, label = "LastName")
	private String lastName;
	@CsvColumn(number = 4, label = "Age")
	private int age;
	@CsvColumn(number = 5, label = "CreatedAt")
	@CsvDateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private LocalDateTime createdAt;
	
	public ExampleModel(int id, String firstName, String lastName, int age, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}
