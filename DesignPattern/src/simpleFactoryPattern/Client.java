package simpleFactoryPattern;

public class Client {
	public static void main(String[] args) {
		Chart chart;
		chart = Factory.getChart("HistogramChart");
		chart.display();
	}
}
