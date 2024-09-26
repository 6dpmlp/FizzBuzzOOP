package hu.ak_akademia.oop.fizzbuzz.tagger1;

import hu.ak_akademia.oop.fizzbuzz.Tagger;

public class TaggerServicePoint {
	private Tagger[] taggers = { new Fizz(), new Buzz(), new Chirp() };

	public Tagger[] getTaggers() {
		return taggers;
	}
}
