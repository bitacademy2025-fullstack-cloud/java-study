package chgapter03.tv;

public class TV {
	private static final int MAX_VOLUME = 100;
	private static final int MIN_VOLUME = 0;
	
	private int channel; // 1 ~ 255, rotate
	private int volume;  // 0 ~ 100
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void status() {
		System.out.println("TV[channel=" + channel + ", volume=" + volume + ", power=" + (power ? "on" : "off") + "]");
	}

	public void power(boolean on) {
		power = on;
	}

	public void volume(boolean up) {
		if(!power) {
			return;
		}
		
		volume += (up ? 1 : -1);
		
		if(volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		} else if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		}
	}

	public void channel(int channel) {
		if(!power) {
			return;
		}
		
		if(channel < 1) {
			channel = 255;
		} else if(channel > 255) {
			channel = 1;
		}
		
		this.channel = channel;
	}

	public void channel(boolean up) {
		channel(channel + (up ? 1 : -1));
	}

}
