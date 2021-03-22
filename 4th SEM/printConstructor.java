class print{
	public print (String text){
		System.out.println(text);
	}
}

public class Main {
	public static void main(String[] args) {
		int a=5;
		new print("hello"+1);
		new print("hello world"+a);
	}
}