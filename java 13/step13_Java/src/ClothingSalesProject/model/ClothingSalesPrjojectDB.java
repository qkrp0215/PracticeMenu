package ClothingSalesProject.model;

import java.util.ArrayList;

import ClothingSalesProject.dto.Cloth;

public class ClothingSalesPrjojectDB {
	static ClothingSalesPrjojectDB instance = new ClothingSalesPrjojectDB();
	private ArrayList<Cloth> clothes = new ArrayList<Cloth>();
	
	public ClothingSalesPrjojectDB () {
		clothes.add(new Cloth("A20230809","stripe t-shirt", "M",100, 30000,new));
		
		clothes.add(new Cloth("B20230909", "mini-skirt", "F", 100, 25000));
		
		clothes.add(new Cloth("C20230910", "silver-jacket", "F", 100, 125000));
		
	}
	
	public static ClothingSalesPrjojectDB getInstance() {
		return instance;
	}
	
	// 모든 cloth 정보반환하기
	public ArrayList<Cloth> getClothesList(){
		return clothes;
		
		
		
	}
	
	
	
	
	
	
	
}
