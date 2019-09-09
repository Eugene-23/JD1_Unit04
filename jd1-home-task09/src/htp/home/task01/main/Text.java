package htp.home.task01.main;

import java.util.ArrayList;
import java.util.List;

public class Text {

	private List<Sentence> title;
	private List<Sentence> text;
	
	public Text() {
		text = new ArrayList<Sentence>();
		title = new ArrayList<Sentence>();
	}
	
	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}
	
	public List<Sentence> getTitle() {
		return title;
	}

	public void setTitle(List<Sentence> title) {
		this.title = title;
	}
	
	
	public void addTitle(Sentence newSentence) {		
		title.add(newSentence);
		
	}
	
	public void addText(Sentence newSentence) {		
		text.add(newSentence);
		
	}	

	@Override
	public String toString() {
		return "Title: " + title + '\n' + "Text: " + text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
		
}
