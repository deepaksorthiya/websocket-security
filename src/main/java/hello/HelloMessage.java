package hello;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HelloMessage {

	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date date = new Date();

	public HelloMessage() {
	}

	public HelloMessage(String name) {

	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloMessage [name=" + name + ", date=" + date + "]";
	}

}
