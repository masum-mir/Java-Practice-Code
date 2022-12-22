package lifeCycleMethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceEXM implements InitializingBean, DisposableBean {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public InterfaceEXM(int price) {
		super();
		this.price = price;
	}

	public InterfaceEXM() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "InterfaceEXM [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {

		System.out.println("Inteface Practice");
		
	}

	public void destroy() throws Exception {

		System.out.println("Inteface is Distroy");
		
	}
	
	
	
}
