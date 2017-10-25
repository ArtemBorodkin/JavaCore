package less23;

import java.sql.*;

public class Main {
	
	public static final String CONNECTION_URL ="jdbc:mysql://localhost:3306/devjava?useSSL=false";
	
	public static final String USER = "root";
	
	public static final String PASSWORD = "qazwsx";
	
	public static final String CREATE_TABLE_PERSON_QUERY = "CREATE TABLE person(id INT PRIMARY KEY AUTO_INCREMENT, age INT, name VARCHAR(255))";
	
	public static final String CREATE_TABLE_BOOK_QUERY = "CREATE TABLE book(id INT PRIMARY KEY AUTO_INCREMENT, person_id INT, title VARCHAR(255))";
	
	public static final String ADD_CONSTRAINT_BOOK_PERSON = "ALTER TABLE book ADD CONSTRAINT book_person FOREIGN KEY(person_id) REFERENCES person(id)";
	
	public static final String ADD_COLUMN_BOOK = "ALTER TABLE book add author VARCHAR(255)";

	public static final String INSERT_PERSON = "INSERT INTO person (name, age) VALUES(?, ?)";
	
	public static final String INSERT_BOOK = "INSERT INTO book (author, title, person_id) VALUES(?, ?, ?)";
	
	public static final String SELECT_PERSON_BOOK = "Select p.name, p.age, b.title, b.author from person p Join book b ON b.person_id = p.id";
	
	public static void main(String[] args) {
		
		try(Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD)){
			
//			Statement statement = connection.createStatement();
//			statement.execute(CREATE_TABLE_PERSON_QUERY);
//			statement.close();
			
//			Statement statement = connection.createStatement();
//			statement.execute(CREATE_TABLE_BOOK_QUERY);
//			statement.close();
			
//			Statement statement = connection.createStatement();
//			statement.execute(ADD_COLUMN_BOOK);
//			statement.close();
			
//			PreparedStatement statement = connection.prepareStatement(INSERT_PERSON);
//			statement.setString(1, "Ivan");
//			statement.setInt(2, 18);
//			statement.executeUpdate();
//			statement.setString(1, "Mykola");
//			statement.setInt(2, 27);
//			statement.executeUpdate();
//			statement.setString(1,"Petro");
//			statement.setInt(2, 22);
//			statement.executeUpdate();
//			statement.close();
			
//			PreparedStatement statement = connection.prepareStatement(INSERT_BOOK);
//			statement.setString(1, "Dale Carnegie");
//			statement.setString(2, "The Leader in you");
//			statement.setInt(3, 3);
//			statement.executeUpdate();
//			statement.setString(1, "Horstamann");
//			statement.setString(2, "Big Java");
//			statement.setInt(3, 2);
//			statement.executeUpdate();
//			statement.setString(1,"Jack London");
//			statement.setString(2, "White Fang");
//			statement.setInt(3, 1);
//			statement.executeUpdate();
//			statement.close();
			
			PreparedStatement statement = connection.prepareStatement(SELECT_PERSON_BOOK);
			ResultSet rs = statement.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("p.name")+" "+rs.getInt("p.age")
				+" \""+rs.getString("b.title")+"\" author is "+rs.getString("author"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
