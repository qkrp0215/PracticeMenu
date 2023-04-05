package ClothingSalesProject.model;

import java.util.ArrayList;

import ClothingSalesProject.dto.Cloth;
import ClothingSalesProject.dto.Person;
import clthingsalesproject.enumtype.Category;

public class ClothingSalesPrjojectDB {
	static ClothingSalesPrjojectDB instance = new ClothingSalesPrjojectDB();
	private ArrayList<Cloth> clothes = new ArrayList<Cloth>();
	private ArrayList<Person> people = new ArrayList<Person>();
	
	public ClothingSalesPrjojectDB () {
		clothes.add(new Cloth("A20230809","stripe t-shirt", "M",100, 30000, "반팔"));
		
		clothes.add(new Cloth("B20230909", "mini-skirt", "F", 100, 25000,"스커트"));
		
		clothes.add(new Cloth("C20230910", "silver-jacket", "F", 100, 125000,"아우터"));
		
		people.add(new Person("예린", "yr0215", "010-1234-1233", 23));
		
		people.add(new Person("지연", "jy0215", "010-3444-1213", 19));
		
		people.add(new Person("민경", "mg0215", "010-6574-1293", 14));
		
	
		
	}
	
	
	public static ClothingSalesPrjojectDB getInstance() {
		return instance;
	}
	
	// 모든 옷 정보 반환하기
	public ArrayList<Cloth> getClothesList(){
		return clothes;
			
	}
	
	// 모든 회원 정보 반환
	public ArrayList<Person> getAllPerson(){
		return people;
		}
	
	// 회원정보 추가하기
	public void insertPersonInfo (Person newpersonInfo) {
		people.add(newpersonInfo);
	}
	
	// 회원정보 삭제하기
	public void deletePersonInfo (String deletePersonInfo) {
		for(int i = 0 ; i < people.size(); i++) {
			if(people.get(i).getId().equals(deletePersonInfo)) {
				people.remove(i);
			}
		}
		
	}
	
}
