package Oops;

public class TimeException {
	private int second;
	private int minute;
	private int hour;

	public void setSecond(int second) {
		if(second>=0 &&second<=60) {
			this.second=second;
		}else {
			throw new IllegalArgumentException("invalid argument");
		}
	}

	public void setMinute(int minute) {
		if(minute>=0 && minute<=60) {
			this.minute=minute;
		}else {
			throw new IllegalArgumentException("invalid argument");
		}
	}

	public void setHour(int hour) {
		if(hour>=0 && hour<=24) {
			this.hour=hour;
		}else {
			throw new IllegalArgumentException("invalid argument");
		}
	}
	public int getSecond() {
		return second;
	}
	public int getMinute() {
		return minute;
	}
	public int getHour() {
		return hour;
	}
	public void setTime(int second,int minute,int hour) {
		this.setSecond(second);
		this.setMinute(minute);
		this.setHour(hour);
	}
	public TimeException(int second,int minute,int hour) {
		this.setTime(second,minute,hour);
	}
	public TimeException() {
		this.second=second;
		this.minute=minute;
		this.hour=hour;
	}	

}
