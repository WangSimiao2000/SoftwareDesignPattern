package simpleFactoryPattern;

public class PieChart implements Chart{
	public PieChart() {
		System.out.println("创建饼状图");
	}
	public void display() {
		System.out.println("这是一个饼状图");
	}
}

