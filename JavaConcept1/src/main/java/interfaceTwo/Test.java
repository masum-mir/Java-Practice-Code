package interfaceTwo;

public class Test {

	public static void main(String[] args) {

		Info info = new Info();
		info.initializeStudent();
		
		TestTwo test = new TestTwo();
		test.initializeStudent();
		
		TestThree test3 = new TestThree();
		test3.showInterface();

	}
	
}
