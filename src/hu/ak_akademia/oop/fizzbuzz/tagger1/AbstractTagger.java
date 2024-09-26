package hu.ak_akademia.oop.fizzbuzz.tagger1;

import hu.ak_akademia.oop.fizzbuzz.Tagger;

abstract class AbstractTagger implements Tagger {

	private final int divisor;
	private final String name;

	AbstractTagger(int divisor, String name) {
		this.divisor = divisor;
		this.name = name;
	}

	@Override
	public boolean isToTag(int number) {
		return number % divisor == 0;
	}

	@Override
	public String getTag() {
		return name;
	}
}
