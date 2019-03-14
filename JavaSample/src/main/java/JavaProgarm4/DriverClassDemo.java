package JavaProgarm4;

public class DriverClassDemo implements WebDriverInterfaceDemo,TakesScreenshotInterfaceDemo {

	@Override
	public int doSum(int x,int y) {
		
		int z=x+y;
		return z;
	}

	@Override
	public int doSquare(int x, int y) {
		int z=x*y;
		return z;
	}

	@Override
	public void doPrint(int x) {
		System.out.println("result is "+x);
		
	}

}
