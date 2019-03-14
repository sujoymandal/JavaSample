package JavaProgarm4;

public class MainClassForDemo {

	public static void main(String[] args) {
	
		WebDriverInterfaceDemo obj=new DriverClassDemo();
		int r1=obj.doSquare(10, 12);
		int r2=obj.doSum(20, 90);
		((TakesScreenshotInterfaceDemo)obj).doPrint(r1);
		((TakesScreenshotInterfaceDemo)obj).doPrint(r2);

	}

}
