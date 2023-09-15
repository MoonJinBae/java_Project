package word;

import java.util.Objects;

public class Word implements Comparable<Word>{

	private String word;
	private String mean;
	
	public Word() {}
	public Word(String word) {
		this.word = word;
	}
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 주소까지 동일하게 일치한다면 true 리턴
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null) {
				return false;
			}
		} else if (!word.equals(other.word)) {
			return false;
		}
		return true;
//		return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}


	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return "단어 " + word + " => " + mean;
	}
	@Override
	public int compareTo(Word o) {
		// TODO Auto-generated method stub
		return word.compareTo(o.word);
	}
	
	
}
