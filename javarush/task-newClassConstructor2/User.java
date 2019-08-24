public class User {
	String name;
	short age;
	int height;
	static int count = 0;

	public User(String name, short age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public User(int height, String name, short age) {		
		this.height = height;
		this.name = name;
		this.age = age;
	}

	public User(int height, short age, String name) {
		this.height = height;
		this.age = age;
		this.name = name;		
	}

	public User(short age, int height, String name) {		
		this.age = age;
		this.height = height;
		this.name = name;
	}

	public User(short age, String name, int height) {		
		this.age = age;
		this.name = name;
		this.height = height;
	}

	public User(String name, int height, short age) {
		this.name = name;		
		this.height = height;
		this.age = age;
	}

	public static void main(String[] args) {
		User user1 = new User(167, (short)34, "Mark");
		User user2 = new User("Betty", 158, (short)43);
		User user3 = new User((short)51, "John", 181);
		System.out.println("user1: " + user1.name + " " + 
							user1.age + " " + user1.height);
		System.out.println("user2: " + user2.name + " " + 
							user2.age + " " + user2.height);
		System.out.println("user3: " + user3.name + " " + 
							user3.age + " " + user3.height);												
	}
}

/*User user1 = new User("Mark", 34, 167);
User user1 = new User("Betty", 43, 158);
User user1 = new User("John", 51, 181);
User user1 = new User("Donna", 29, 162);
User user1 = new User("Hew", 31, 170);*/