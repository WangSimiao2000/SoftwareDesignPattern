package simpleFactoryPattern;

public class Factory {
	public static Chart getChart(String arg) {
		Chart chart=null;
		if (arg.equalsIgnoreCase("HistogramChart")) {
			System.out.println("初始化柱状图");
			chart = new HistogramChart();
		}
		else if (arg.equalsIgnoreCase("LineChart")) {
			System.out.println("初始化折线图");
			chart = new LineChart();
		}
		else if (arg.equalsIgnoreCase("PieChart")) {
			System.out.println("初始化饼状图");
			chart = new PieChart();
		}
		return chart;
	}
}
