package simpleFactoryPattern;

public class HistogramChart implements Chart{
	public HistogramChart() {
		System.out.println("创建柱状图");
	}
	public void display() {
		System.out.println("这是一个柱状图");
	}
}
