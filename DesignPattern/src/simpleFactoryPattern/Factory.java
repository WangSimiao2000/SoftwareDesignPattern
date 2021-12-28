package simpleFactoryPattern;

public class Factory {
	public static Chart getChart(String arg) {
		Chart chart=null;
		if (arg.equalsIgnoreCase("HistogramChart")) {
			System.out.println("��ʼ����״ͼ");
			chart = new HistogramChart();
		}
		else if (arg.equalsIgnoreCase("LineChart")) {
			System.out.println("��ʼ������ͼ");
			chart = new LineChart();
		}
		else if (arg.equalsIgnoreCase("PieChart")) {
			System.out.println("��ʼ����״ͼ");
			chart = new PieChart();
		}
		return chart;
	}
}
