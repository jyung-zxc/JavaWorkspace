package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List list = new ArrayList();

	public int addList(Music music) {
		try {
//		list.add(new Music(music.getTitle(),music.getSinger()));
			list.add(music);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	public int addAtZero(Music music) {
		try {
			// list.add(0,new Music(music.getTitle(),music.getSinger()));
			list.add(0, music);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	public List printAll() {
		return list;
	}

	public Music searchMusic(String title) {
//		for(int i = 0; i<list.size(); i++) {
//			if(list.get(i) == title) {
//				return (Music) list.get(i);
//			}
//		}
//		return null;
		Music m = null;

		for (Object o : list) {
			Music music = (Music) o;
			if (music.getTitle().equals(title)) {
				m = music;
				break;
			}
		}
		return m;
	}

	public Music removeMusic(String title) {
//		for(int i = 0; i<list.size(); i++) {
//			if(list.get(i) == title) {
//				list.remove(title);
//			}
//		}
//		return null;
		Music m = null;
		// 방법1
		for (int i = 0; i < list.size(); i++) {
			Music music = (Music) list.get(i);
			if (music.getTitle().equals(title)) {
				m = music;
				list.remove(i);
				break;
			}
		}
		// 방법2
//		Object o = searchMusic(title);
//		m = (Music) o;
//		list.remove(o);

		return m;
	}

	public Music setMusic(String title, Music music) {
		try {
			Music result = null;
			int index = -1;

			for (int i = 0; i < list.size(); i++) {
				Music m = (Music) list.get(i);
				if (m.getTitle().equals(title)) {
					index = i;
					result = m;
					break;
				}
				list.set(index, title);
			}
			return result;
		} catch (Exception e) {
			return null;
		}
	}

	public int ascTitle() {
		// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		try {
		Collections.sort(list, new AscTitle());
		return 1;
		}catch (Exception e) {
		return 0;
		}
	}

	public int descSinger() {
		// 리스트 가수 명 내림차순 정렬, 1 리턴
		Collections.sort(list);
		return 1;
	}
}
