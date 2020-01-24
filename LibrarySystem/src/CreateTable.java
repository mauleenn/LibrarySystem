import java.sql.*;

public class CreateTable {

public static void main( String args[] )

{

Connection c = null;

Statement stmt = null;

try {

Class.forName("org.sqlite.JDBC");

c = DriverManager.getConnection("jdbc:sqlite:LibraryDB.db");

System.out.println("Database Opened...\n");

stmt = c.createStatement();

String sql = "CREATE TABLE Employees " +

"(p_id INTEGER PRIMARY KEY AUTOINCREMENT," +

" book_name TEXT NOT NULL, " +

" price REAL NOT NULL, " +

" quantity INTEGER) " ;

stmt.executeUpdate(sql);

stmt.close();

c.close();

}

catch ( Exception e ) {

System.err.println( e.getClass().getName() + ": " + e.getMessage() );

System.exit(0);

}

System.out.println("Table Books Created Successfully!!!");

}

}