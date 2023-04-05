package ClothingSalesProject.controller;

import java.util.ArrayList;

import ClothingSalesProject.Service.ClothingSalesProjectService;
import ClothingSalesProject.dto.Cloth;
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
		EndView.projectListView(clothList);
	}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

