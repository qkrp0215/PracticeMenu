package ClothingSalesProject.view;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import ClothingSalesProject.controller.ClothingSalesProjectController;
import ClothingSalesProject.dto.Person;

public class StartView {

	public static void main(String[] args) {
		// 새로운 고객
		Person newPerson = new Person("david", "dv123", "234-5452", 30);
		
		
		
		ClothingSalesProjectController controller = ClothingSalesProjectController.getInstance();
		
		// 모든 의류 검색
		System.out.println("===== 1. 모든 의류 검색  =====");
		controller.clothListView();
		
		// 모든 회원정보 검색
//		System.out.println("===== 2. 모든 회원 정보 검색  =====");
//		controller.personListView();
//		
//		// 특정 회원 정보 검색 + 예외처리
//		System.out.println("===== 3. 특정 회원 정보 검색  =====");
//		Scanner inData = new Scanner(System.in);
//		String searchPerson = inData.next();
//		controller.personView(searchPerson);
//		System.out.println();
//		
//		// 새로운 정보 추가 
		System.out.println("===== 4.회원 정보 추가 =====");
		controller.personInfoSave(newPerson);
		controller.personListView();
		System.out.println();
	
		
		System.out.println("===== 6. 회원 정보 데이터 =====");
		controller.personListView();
		System.out.println("====삭제 할 데이터 아이디 입력====");
//		Scanner Data = new Scanner(System.in);
//		String deletePersonId = Data.next();
//		controller.deletePerson(deletePersonId);
//		controller.personListView();
		
		// 아이디를 입력 받아서 삭제된 데이터 제외 후 데이터 출력 ? ?

		
		System.out.println("===== 7. 회원 정보 수정 =====");
		controller.updatePersonInfo("지연", new Person("찬진","cj0518","123-2232", 20));
		controller.personView("지연");
		
		
		
		
		
		
	}

}
