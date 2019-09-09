package htp.home.task01.main;

import java.util.List;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль текст, 
 * заголовок текста.
 */

public class Main {

	public static void main(String[] args) {
					
		Sentence sent1 = new Sentence();
		
		sent1.add(new Word("I"));
		sent1.add(new Word("am"));
		sent1.add(new Word("learnig"));
		sent1.add(new Word("Java"));
		
		Sentence sent2 = new Sentence();
		
		sent2.add(new Word("I"));
		sent2.add(new Word("will"));
		sent2.add(new Word("be"));
		sent2.add(new Word("a"));
		sent2.add(new Word("great"));
		sent2.add(new Word("programmer"));
		
		Sentence title = new Sentence();		
		title.add(new Word("Java"));
		
		Text text = new Text();
		
		text.addTitle(title);		
		text.addText(sent1);
		text.addText(sent2);
					
		print(text.getTitle());
		System.out.println();
		print(text.getText());
		
				
	}
	
	public static void print(List<Sentence> text) {
		for(Sentence sen : text) {
			List<Word> wrd = sen.getSentence();
			
			for(Word w : wrd) {
				System.out.print(w.getWord());
			}
			System.out.print(".");
		}
	}

}
