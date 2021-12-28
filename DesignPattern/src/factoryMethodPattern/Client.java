package factoryMethodPattern;

public class Client {
	public static void main(String arg[]) {
		LoggerFactory factory;
		Logger logger;
		factory = new FileLoggerFactory();
		logger = factory.createLogger();
		logger.writeLog();
	}
}
