package adapterPattern;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		//Class c = Class.forName("adapterPattern.PoliceCarAdapter");
		CarController car;
		car = (CarController)XMLUtil.getBean();
		//car =(CarController) c.newInstance();
		
		car.move();
		car.phonate();
		car.twinkle();
	}
}
