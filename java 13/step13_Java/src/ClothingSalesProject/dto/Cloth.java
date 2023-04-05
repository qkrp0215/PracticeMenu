package ClothingSalesProject.dto;


public class Cloth {
	private String productNumber;
	private String clothName;
	private String size;
	private int count;
	private int price;
	private Category category;
	
	public Cloth() {
		super();
	}


	public Cloth(String productNumber, String clothName, String size, int count, int price, Category Category) {
		super();
		this.productNumber = productNumber;
		this.clothName = clothName;
		this.size = size;
		this.count = count;
		this.price = price;
		this.category=category;
	}


	public String getProductNumber() {
		return productNumber;
	}


	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}


	public String getClothName() {
		return clothName;
	}


	public void setClothName(String clothName) {
		this.clothName = clothName;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Cloth [productNumber=" + productNumber + ", clothName=" + clothName + ", size=" + size + ", count="
				+ count + ", price=" + price + ", category=" + category + "]";
	}
	
}
