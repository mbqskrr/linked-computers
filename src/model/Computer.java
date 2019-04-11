package model;

public class Computer {
	
	private int hd;
	private int ram;
	private String ip;
	private Computer next;
	private Computer previous;
	
	public Computer(int h, int r, String ip) {
		hd = h;
		ram = h;
		this.ip = ip;
	}
	
	public int getHd() {
		return hd;
	}
	
	public int getRam() {
		return ram;
	}
	
	public String getIp() {
		return ip;
	}
	
	public Computer gerNext() {
		return next;
	}
	
	public Computer getPrevious() {
		return previous;
	}
	
	public void setNext(Computer c) {
		next = c;
	}
	
	public void setPrevious(Computer c) {
		previous = c;
	}

}
