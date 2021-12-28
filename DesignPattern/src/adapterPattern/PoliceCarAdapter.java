package adapterPattern;

public class PoliceCarAdapter extends CarController {
	private PoliceSound sound;
	private PoliceLamp lamp;
	
	public PoliceCarAdapter() {
		sound = new PoliceSound();
		lamp = new PoliceLamp();
	}
	
	public void phonate() {
		sound.alarmSound();
	}
	
	public void twinkle() {
		lamp.alarmLamp();
	}
	
}
