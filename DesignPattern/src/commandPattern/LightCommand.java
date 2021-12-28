package commandPattern;

public class LightCommand extends Command {
    private Light light;

    public void execute(){    	
    	light.shine();
    }

    public LightCommand(){
    	light = new Light();
    }

}
