package ClothingSalesProject.view;

import java.util.ArrayList;

import ClothingSalesProject.dto.Cloth;
import ClothingSalesProject.dto.Person;

public class EndView {

	// 모든 의류정보 출력
	public static void projectClothesListView(ArrayList<Cloth> allClothes) {
		for(int i=0; i< allClothes.size(); i++) {
			System.out.println("[cloth 정보 "+ (i+1)+ "]");
			System.out.println(allClothes.get(i));
			System.out.println();
		}
	}
	// 모든 회원 정보 출력
	public static void PersonListView(ArrayList<Person> allPeople) {
		for(int i=0; i< allPeople.size(); i++) {
			System.out.println("[회원 정보 "+ (i+1)+ "]");
			System.out.println(allPeople.get(i));
			System.out.println();
		}
	}
	// 특정 회원 정보 출력
	public static void personView (Person person) {
		if(person !=null) {
			System.out.println(person);
		}else {
			System.out.println("조회된 검색 결과가 없습니다.");
		}
	}
	
	public static void messageView (String message) {
		System.out.println(message);
	}
	
	
	
	}
