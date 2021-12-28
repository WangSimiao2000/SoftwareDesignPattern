package adapterPattern;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		//Class c = Class.forName("adapterPattern.PoliceCarAdapter");
		CarController car;
		car = (CarController)XMLUtil.getBean();
		//car =(CarController) c.newInstance();
		
		car.move();
		car.phonate();
		car.twinkle();
	}
}
