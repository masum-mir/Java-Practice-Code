package interfaceTwo;

public class TestTwo implements ListData {

	@Override
	public void onClick(String message) {
		System.out.println(message);
		
	}

	@Override
	public void onClickHistory(String message) {
		System.out.println(message);
		
	}
	
	void initializeStudent(){
		Student student = new Student(this);			
			
	}

}
