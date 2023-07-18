package com.kh.day17.oop.motal.doamin.vo;

public class Room {
	private boolean isAvailable;
	
	public Room() {
		
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Room [isAvailable=" + isAvailable + "]";
	}
}
