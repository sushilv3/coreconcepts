package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Person p = new Person(1,"Sushil");
		
		FileOutputStream fout = new FileOutputStream("f.text");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(p);
		out.flush();  
		  
		out.close();  
		System.out.println("success");  
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.text"));
		Person p1 = (Person)in.readObject();
		System.out.println("Person Id : "+p1.getId() + " & Name : "+p1.getName());
		
		
		
		

	}

}
