package interfaceTwo;

public class Info implements ListData{
	
	@Override
	public void onClick(String message) {
		System.out.println(message);
	}
	
	@Override
	public void onClickHistory(String message) {
		System.out.println(message);
		
	}
	
	 void initializeStudent(){
			new Student(this);	
		}

}
