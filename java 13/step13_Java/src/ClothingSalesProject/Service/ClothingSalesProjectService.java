package ClothingSalesProject.Service;

import java.util.ArrayList;

import ClothingSalesProject.dto.Cloth;
import ClothingSalesProject.dto.ClothingSalesProject;
import ClothingSalesProject.dto.Person;
import ClothingSalesProject.excep.NotExistException;
import ClothingSalesProject.model.ClothingSalesPrjojectDB;

public class ClothingSalesProjectService {
	private static ClothingSalesProjectService instance = new ClothingSalesProjectService();
	private ClothingSalesPrjojectDB clothesData = new ClothingSalesPrjojectDB();
	
	
	public ClothingSalesProjectService() {}
	public static ClothingSalesProjectService getInstance () {
		return instance;
		
	}
	
	// 모든 의류 검색
	public ArrayList<Cloth> getAllClothes() {
		return clothesData.getClothesList();
	}
	 
	// 모든 회원정보 검색
	public ArrayList<Person> getAllPerson(){
		return clothesData.getAllPerson();
	}
	
	// 특정 고객 검색
	public Person getPerson(String personName) throws NotExistException {
		Person person = null;
		ArrayList<Person> personlist = clothesData.getAllPerson();
		for (int i=0; i< personlist.size(); i++ ) {
			if(personlist.get(i).getName().equals(personName)) {
				person=personlist.get(i);
				
			}
		}
		if(person==null) {
			throw new NotExistException("검색하신 회원은 회원가입이 되어있지 않습니다.");
		}
		
		
		return person;
		
	}
	
	// 회원 정보 추가하기
	public void personInfoInsert (Person newpersonInfo) {
		clothesData.insertPersonInfo(newpersonInfo);
	}
	
	// 회원 정보 삭제
	public void deletePerson (String deletePersonInfo) throws NotExistException {
		clothesData.deletePersonInfo(deletePersonInfo);
	}
	
	// 회원 정보 수정 -회원 이름을 조회하여 정보 수정
	public void personInfoUpdate (String name, Person person) throws NotExistException {
		Person projectPersonName = getPerson(name);
		
		if(projectPersonName==null) {
			throw new NotExistException("수정하고자 하는 id가 존재하지 않습니다.");
		}
			projectPersonName.setName(name);;
			
		
			
		
	}
	
	
	
}
