package interfaceTwo;

public class Student {
	
	ListData listData;
	
	Student(ListData listData) {
		this.listData = listData;
		listData.onClick("Hello");
		listData.onClickHistory("Hello from List Data");
	}
	
	

}
