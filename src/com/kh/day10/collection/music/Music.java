package com.kh.day10.collection.music;

public class Music {
	private String title;
	private String singer;
	
	public Music() {
		
	}
	
	public Music(String title, String singer) {
		this.setTitle(title);
		this.setSinger(singer);
	}
	// getter
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	// setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Music [title=" + title + ", Singer=" + singer  + "]";
	}
}
