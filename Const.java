//Constructor

package employeeData;

public class Const {

	String name,email;
	int age;
	//Default Constructor
	
			void display()
			{
				System.out.println("Name => "+name+"\nE-Mail => "+email+"\nAge => "+age);
			}
			
			public static void main(String[] args) {
	
				Const s = new Const();
				s.display();

	}

}
