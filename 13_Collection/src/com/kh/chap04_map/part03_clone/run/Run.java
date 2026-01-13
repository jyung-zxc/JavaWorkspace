package com.kh.chap04_map.part03_clone.run;

import java.util.HashMap;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;

public class Run<K, V> {
	private Entry<K, V>[] table;
	private int capacity; // 객체배열의 크기로서 사용
	private int size; // 객체배열 내부의 초기화된 객체의 수

	class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}

	}

	// 객체 생성시 반드시 객체배열의 크기를 지정
	public Run(int capacity) {
		this.capacity = capacity;
	}

	public static void main(String[] args) {
		HashMap hm = new HashMap(10);
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("포테이토칩", new Snack("짠맛", 500));
		System.out.println(hm.get("새우깡")); // 출력 : 짠맛, 500원
		hm.put("새우깡", new Snack("매운맛", 700));
		System.out.println(hm.get("새우깡")); // 출력 : 매운맛, 700원
		System.out.println(map.containsKey("새우깡 ")); // 출력 : true
		System.out.println(map.size()); // 출력 : 4
		map.remove("포테이토칩");
		System.out.println(map.containsKey("포테이토칩 ")); // 출력 : false
		System.out.println(map.size()); // 출력 : 3
	}

	public int getIndex(K key) {

		int hash = key.hashCode();
		/*
		 * 저장공간이 10이라면? 113355 % 10 == 5번 인덱스 12345678 % 10 == 8번 인덱스 77777778 % 10 ==
		 * 8번 인덱스
		 */

		return Math.abs(hash) % capacity;
		// 매개변수로 전달받은 key값을 hashCode()로 변환시킨후
		// 객체의 총 저장공간 수(capacity)만큼 나눈 나머지 결과값을 반환하는 함수.
	}

	public void put(K key, V value) {
		int index = getIndex(key);
		
		if(table[index] == null) {
			table[index] = new Entry<>(key,value,null);
		} else {
			// 이미 해당 위치에 값이 있는 경우
			// case 1. 완전 같은 key 값을 사용한 경우
			// key값이 동일한지 검사후 동일하다면 , 중복값이므로 value값만 덮어씌우고
			if(table[index].key.equals(key)) {
				table[index].value = value;
				//  - key 값 중복으로 인해 현재 들어온 value로 인덱스위치의 값을 덮어씌우기.
			}else {
				
				// 2. key값은 다르지만 hash값이 우연히 일치한 경우
				// key값이 다르다면 현재 entry의 next요소에 entry객체 저장.
			}
		}
		
		// getIndex함수 호출후 반환값으로 table의 index에 접근
		// 접근시 내부의 값이 null이라면 Entry매개변수 있는 생성자를 이용하여
		// 객체생성후 비어있는 저장공간에 Entry객체 추가하기.
		// ex) 최초 Entry 객체 생성시 : new Entry(key, value , null)
		// 값이 null이 아니라면 , entry에 저장된 key값과 새롭게 추가하려는 entry의
		// 만약 next에도 이미 값이 존재하는경우, next가 없는 entry를 찾을때까지 반복
		// 중복값을 제외하고, 값이 새롭게 추가된경우 size 증가
	}

	public Snack get(K key) {
		return null;
		// getIndex함수 호출후 반환값으로 table의 index에 접근
		// 접근시 내부의 값이 null이라면 null값 반환
		// 객체가 있다면 저장된 객체의 key값과 매개변수로 전달받은 key값 확인
		// 동일하다면 객체에 저장된 value값 반환.
		// 동일하지 않다면 노드드의 next 값을 찾아 다시한번 검사 (next가 존재하지
		// 않을때까지 반복). 다음 노드들 중에서 key값이 일치하는 값이 존재한다면
		// 노드 내부의 value값 반환. 일치하는 key값이 없었다면 null값 반환
	}

	public boolean containsKey(String key) {
		return false;
		// getIndex함수 호출후 반환값으로 table의 index에 접근
		// 접근시 내부의 값이 null이라면 null값 반환
		// 객체가 있다면 저장된 객체의 key값과 매개변수로 전달받은 key값 확인
		// 동일하다면 true반환, 일치하지 않는다면 node의 next값을 찾아 일치하는 것을
		// 찾을때까지 검사. 일치하는 값을 찾았다면 true/ 찾지 못했다다면 false 반환

	}

	public void remove(String key) {
		// getIndex함수 호출후 반환값으로 table의 index에 접근
		// 접근시 내부의 값이 null이라면 메소드 종료;
		// 객체가 있다면 저장된 객체의 key값과 매개변수로 전달받은 key값 확인
		// 동일하다면 현재 Node삭제
	}

	public int size() {
		return capacity;
		// size필드반환

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for (Entry e : table) {
			if (e == null)
				continue;
			// {key : value}
			sb.append("{").append(e.key).append(" : ").append(e.value).append("}").append(",");

			Entry next = e.next;
			do {
				if (next != null) {
					sb.append("{").append(next.key).append(" : ").append(next.value).append("}").append(",");
					next = next.next;
				}
			} while (next != null); //
		}
		// sb.append(Arrays.toString(table));

		sb.append('}');

		return sb.toString();
	}
}
