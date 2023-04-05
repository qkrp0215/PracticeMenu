package ClothingSalesProject.view;

import ClothingSalesProject.controller.ClothingSalesProjectController;

public class StartView {

	public static void main(String[] args) {
		ClothingSalesProjectController controller = ClothingSalesProjectController.getInstance();
		
		// 모든 의류 검색
		System.out.println("===== 1. 모든 의류 검색  =====");
		controller.clothListView();
		
		
		
	}

}
