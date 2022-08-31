package cn.com;

public class MyTime {

	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;

	}

	public void display() {
		System.out.println(this.hour + ":" + this.minute + ":" + this.second);
	}

	public void addHour(int hou) {
		this.hour += hou;
	}

	public void addMinute(int min) {
		this.minute += min;
	}

	public void addSecond(int sec) {
		this.second += sec;
	}

	public void subHour(int hou) {
		this.hour -= hou;
	}

	public void subMinute(int min) {
		this.minute -= min;
	}

	public void subSecond(int sec) {
		this.second -= sec;
	}
}