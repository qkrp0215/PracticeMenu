package ClothingSalesProject.controller;

import java.util.ArrayList;

import ClothingSalesProject.Service.ClothingSalesProjectService;
import ClothingSalesProject.dto.Cloth;
import ClothingSalesProject.dto.Person;
import ClothingSalesProject.excep.NotExistException;
import ClothingSalesProject.view.EndView;

public class ClothingSalesProjectController {

	private static ClothingSalesProjectController instance = new ClothingSalesProjectController();
	private ClothingSalesProjectService service = ClothingSalesProjectService.getInstance();
	
			
	public ClothingSalesProjectController() {}
	
	public static ClothingSalesProjectController getInstance() {
		return instance;
	}
		
	// 모든 의류 검색
	public void clothListView() {
		ArrayList<Cloth> clothList  = service.getAllClothes();
		EndView.projectClothesListView(clothList);
	}
		
	// 모든 회원 정보 검색
	public void personListView() {
		ArrayList<Person> personList = service.getAllPerson(); 
		EndView.PersonListView(personList);
	}
		
	// 특정 고객 정보 검색
	public void personView(String personName) {
		Person person =null;
		try {
			person=service.getPerson(personName);
		} catch (NotExistException e) {
			EndView.messageView(e.getMessage());
		}
		EndView.personView(person);
		
	}
	
	
	
	
	// 새로운 고객정보 저장
	public void personInfoSave(Person newPerson) {
		service.personInfoInsert(newPerson);
	}
	
	// 아이디로 검색한 회원정보 삭제
	public void deletePerson (String deletePersonId) {
		try {
			service.deletePerson(deletePersonId);
		} catch (NotExistException e) {
			e.printStackTrace();
		}
	}
		
	// 회원정보 수정
	public void updatePersonInfo (String name, Person person) {
		try {
			service.personInfoUpdate(name, person);
		} catch (NotExistException e) {
		}
		
	}
}
	
	
	
	
	
	
	

