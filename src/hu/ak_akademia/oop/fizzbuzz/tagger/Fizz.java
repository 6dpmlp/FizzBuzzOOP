package hu.ak_akademia.oop.fizzbuzz.tagger;

import hu.ak_akademia.oop.fizzbuzz.Tagger;

class Fizz implements Tagger {

	@Override
	public boolean isToTag(int number) {
		return number % 3 == 0;
	}

	@Override
	public String getTag() {
		return "Fizz";
	}
}
