package ClothingSalesProject.dto;

public class Category {
	
	enum Kind {TOP, BOTTOM, SKIRT,OUTER}
	enum Value {반팔 ,맨투맨,데님팬츠,블루종,미니스커트,재킷}
	
	
	final Kind kind = Kind.TOP;
	final Value value = Value.반팔;
	
	
}
