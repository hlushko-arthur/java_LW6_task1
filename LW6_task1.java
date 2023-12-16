interface LightSource {
	void turnOn();

	void turnOff();
}

class Lamp implements LightSource {
	private boolean isOn;

	public Lamp() {
		this.isOn = false;
	}

	@Override
	public void turnOn() {
		isOn = true;
		System.out.println("Lamp is turned on.");
	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("Lamp is turned off.");
	}

	public boolean isOn() {
		return isOn;
	}
}

class DeskLamp extends Lamp {
	private boolean adjustableHeight;

	public DeskLamp(boolean adjustableHeight) {
		this.adjustableHeight = adjustableHeight;
	}

	public boolean isAdjustableHeight() {
		return adjustableHeight;
	}

	public void setAdjustableHeight(boolean adjustableHeight) {
		this.adjustableHeight = adjustableHeight;
	}

	public void adjustHeight() {
		if (adjustableHeight) {
			System.out.println("Desk lamp height is adjustable.");
		} else {
			System.out.println("Desk lamp height is not adjustable.");
		}
	}
}

public class LW6_task1 {
	public static void main(String[] args) {
		DeskLamp deskLamp = new DeskLamp(true);

		deskLamp.turnOn();

		deskLamp.adjustHeight();

		deskLamp.turnOff();
	}
}
