package adapterPattern;

public class AmbulanceCarAdapter extends CarController {
	private AmbulanceSound sound;
	private AmbulanceLamp lamp;
	
	public AmbulanceCarAdapter() {
		sound = new AmbulanceSound();
		lamp = new AmbulanceLamp();
	}
	
	public void phonate() {
		sound.alarmSound();
	}
	
	public void twinkle() {
		lamp.alarmLamp();
	}
	
}
