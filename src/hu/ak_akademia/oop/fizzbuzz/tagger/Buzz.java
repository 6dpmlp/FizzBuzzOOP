package hu.ak_akademia.oop.fizzbuzz.tagger;

import hu.ak_akademia.oop.fizzbuzz.Tagger;

class Buzz implements Tagger {

	@Override
	public boolean isToTag(int number) {
		return number % 5 == 0;
	}

	@Override
	public String getTag() {
		return "BUZZ";
	}
}
