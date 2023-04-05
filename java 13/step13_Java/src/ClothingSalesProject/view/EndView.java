package ClothingSalesProject.view;

import java.util.ArrayList;

import ClothingSalesProject.dto.Cloth;

public class EndView {

	public static void projectListView(ArrayList<Cloth> allClothes) {
		for(int i=0; i< allClothes.size(); i++) {
			System.out.println("[cloth 정보 "+ (i+1)+ "]");
			System.out.println(allClothes.get(i));
			System.out.println();
		}
	}

}
