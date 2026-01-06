package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {
	public static void main(String[] args) {
		
		Animal[] a = new Animal[5];
		
		a[0] = new Dog("점박이","말티즈",3);
		a[1] = new Dog("바둑이","진돗개",4);
		a[2] = new Cat("네로","코코","강남","검은색");
		a[3] = new Cat("코코","보보","목동","회색");
		a[4] = new Dog("콩이","닥스훈트",2);

		for(Animal ani : a) {
			 ani.speak();
		 }
	}
}
