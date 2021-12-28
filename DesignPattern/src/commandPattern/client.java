package commandPattern;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Command command = new fanCommand();
		
		Button b = new Button();
		b.setCommand(command);
		b.click();
	}

}
