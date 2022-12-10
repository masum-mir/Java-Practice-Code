package interfaceTwo;

public class TestThree implements ListData{
	
	@Override
	public void onClick(String msg) {
		System.out.println(msg);
	}
	
	@Override
	public void onClickHistory(String msg) {
		System.out.println(msg);
	}
	
	void showInterface() {
		new Student(this);
	}

}
