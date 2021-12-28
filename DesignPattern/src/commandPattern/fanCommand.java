package commandPattern;

public class fanCommand extends Command {
    private Fan fan;

    public void execute(){
    	fan.start();
    }

    public fanCommand(){
    	fan = new Fan();
    }

}
