package hu.ak_akademia.oop.fizzbuzz;

import hu.ak_akademia.oop.fizzbuzz.tagger.TaggerServicePoint;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void print(Tagger taggers[], int num) {
		System.out.println();
		for(int i = 1; i <= num; ++i) {
			System.out.printf("%3d", i);
			for (Tagger d : taggers) {
				if (d.isToTag(i)) {
					System.out.printf(" %s", d.getTag()); 
				}
			}
			System.out.println();
		}
	}
	
	private void run() {
		print(new TaggerServicePoint().getTaggers(), new UserInput().askInput());
	}
}
