package ClothingSalesProject.Service;

import java.util.ArrayList;

import ClothingSalesProject.dto.Cloth;
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
	
	
}
