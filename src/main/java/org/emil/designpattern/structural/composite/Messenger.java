//Code taken from https://java-design-patterns.com/patterns/composite/

package org.emil.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Factory
public class Messenger {

	public LetterComposite messageFromOrcs() {
		List<Word> words = new ArrayList<>();

		words.add(new Word(
				Arrays.asList(new Letter('W'), new Letter('h'), new Letter('e'), new Letter('r'), new Letter('e'))));

		words.add(new Word(
				Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'), new Letter('r'), new Letter('e'))
				));
		
		words.add(new Word(
				Arrays.asList(new Letter('i'), new Letter('s'))
				));
		
		words.add(new Word(
				Arrays.asList(new Letter('a'))
				));
		
		words.add(new Word(
				Arrays.asList(new Letter('w'), new Letter('h'), new Letter('i'), new Letter('p'))
				));
		
		words.add(new Word(
				Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'), new Letter('r'), new Letter('e'))
				));
		
		words.add(new Word(
				Arrays.asList(new Letter('i'), new Letter('s'))
				));
		
		words.add(new Word(
				Arrays.asList(new Letter('a'))
				));
		
		words.add(new Word(
				Arrays.asList(new Letter('w'), new Letter('a'), new Letter('y'))
				));
		
		return new Sentence(words);
	}
}
