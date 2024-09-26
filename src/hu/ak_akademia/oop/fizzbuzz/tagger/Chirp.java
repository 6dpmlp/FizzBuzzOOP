package hu.ak_akademia.oop.fizzbuzz.tagger;

import hu.ak_akademia.oop.fizzbuzz.Tagger;

class Chirp implements Tagger{
	
	@Override
	public boolean isToTag(int number) {
		return number % 7 == 0;
	}
	
	@Override
	public String getTag() {
		return "Chirp";
	}
}
