package com.kh.day12.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day12.music.model.vo.Music;

public class MusicController {
	List<Music> mList;

	public MusicController() {
		mList = new ArrayList<Music>();
	}

	/**
	 * 마지막 위치에 곡 추가
	 * 
	 * @param music
	 */
	public void addAtLast(Music music) {
		mList.add(music);
	}

	/**
	 * 첫 위치에 곡 추가
	 * 
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0, music);
	}

	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}

	/**
	 * 곡 삭제하기
	 * 
	 * @param i
	 */
	public void removeMusic(int i) {
		// mList에서 삭제
		mList.remove(i);
	}

	/**
	 * 음악 전체 정보 출력
	 * 
	 * @return mList
	 */
	public List<Music> printMusicList() {
		return mList;
	}

	/**
	 * 
	 * @param title
	 * @return
	 */
	public List searchMusicsByName(String title) {
		// 찾은 음악을 담을 리스트
		List<Music> findList = new ArrayList<Music>();
		// 기존 음악이 있는 mList에서 찾기
		for (Music mOne : mList) {
			// 입력한 이름이 같으면
			if (mOne.getTitle().equals(title)) {
				// findList에 추가하기
				findList.add(mOne);
			}
		}
		// 다 찾았으면 리턴하기
		return findList;
	}

	/**
	 * 이름으로 곡 검색하기
	 * 
	 * @param title
	 * @return
	 */
	public int searchOneByTitle(String title) {
		for (int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if (music.getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}

	public void bubleSortByTitleASC() {
		// int [] nums; -> mList로 변경 필요
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < (mList.size() - 1) - i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j + 1);
				// The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
				// 결과값이 
				// 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 오른쪽이 순서가 더 큼
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}

	public void bubleSortByTitleDESC() {
		// int [] nums; -> mList로 변경 필요
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < (mList.size() - 1) - i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j + 1);
				// The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
				// 결과값이 
				// 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 오른쪽이 순서가 더 큼
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
	
	public void bubleSortBySingerASC() {
		// int [] nums; -> mList로 변경 필요
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < (mList.size() - 1) - i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j + 1);
				// The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
				// 결과값이 
				// 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 오른쪽이 순서가 더 큼
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 0) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
	
	public void bubleSortBySingerDESC() {
		// int [] nums; -> mList로 변경 필요
		for (int i = 0; i < mList.size() - 1; i++) {
			for (int j = 0; j < (mList.size() - 1) - i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j + 1);
				// The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
				// 결과값이 
				// 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수값이면 오른쪽이 순서가 더 큼
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 0) {
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
		
	}
}
