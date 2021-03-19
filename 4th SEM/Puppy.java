class PuppyClass{
	
	public String Name(String name) {
		String puppyName = name;
		return puppyName;
	}
	
	public  int  Age(int age) {
		int puppyAge = age;
		return puppyAge;
	}
}


public class Puppy{

	public static void main(String[] args) {
		
		PuppyClass puppy = new PuppyClass();
		
		String name = puppy.Name("Tommy");
		int age = puppy.Age(3);
		
		System.out.println("Puppy's name is " + name + " and age is " + age);
	}

}
