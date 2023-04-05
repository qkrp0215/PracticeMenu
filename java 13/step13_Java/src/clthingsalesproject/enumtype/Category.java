package clthingsalesproject.enumtype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Category {
	TOP(Arrays.asList("반팔", "맨투맨")),
	BOTTOM,
	OUTER;
	
	private List<String> values;
	
	Category () {};
	Category (List<String> values){
		this.values=values;
	}
	
	public List<String> getValues() {
		return this.values;
	}
}
