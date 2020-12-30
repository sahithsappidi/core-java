package Oops;

public class Time {
	private int second;
	private int minute;
	private int hour;
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public Time() {
		this.second=0;
		this.minute=0;
		this.hour=0;
	}
	
	public Time(int second,int minute,int hour){
		this.second=second;
		this.minute=minute;
		this.hour=hour;
	}
	
	public String toString() {
		return String.format("%2d%2d%2d", hour,minute,second);
	}
	public Time nextSecond() {
		second++;
		if(second>=60) {
			second=0;
			minute++;
			if(minute>=60) {
				minute=0;
				hour++;
				if(hour>=24) {
					hour=0;
				}
				
			}
			
		}
		return this;
	}
	public void setTime(int hour, int minute, int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
}
