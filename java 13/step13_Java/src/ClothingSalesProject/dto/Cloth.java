package ClothingSalesProject.dto;


public class Cloth {
	private String productNumber;
	private String clothName;
	private String size;
	private int count;
	private int price;
	private String detail;
	
	public Cloth() {
		super();
	}


	public Cloth(String productNumber, String clothName, String size, int count, int price, String detail) {
//	public Cloth(String productNumber, String clothName, String size, int count, int price, clthingsalesproject.enumtype.Category category) {
		super();
		this.productNumber = productNumber;
		this.clothName = clothName;
		this.size = size;
		this.count = count;
		this.price = price;
		this.detail = detail;
//		this.category=category;
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


	public String getDetail() {
//	public clthingsalespr/oject.enumtype.Category getCategory() {
		// return category;
		return detail;
	}


	public void setDetail(String detail) {
//	public void setCategory(clthingsalesproject.enumtype.Category category) {
		//this.category = category;
		this.detail = detail;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[제품일련번호 : ");
		builder.append(productNumber);
		builder.append(", 제품 이름 : ");
		builder.append(clothName);
		builder.append(", 카테고리 : ");
		builder.append(detail);
		builder.append(", 사이즈 : ");
		builder.append(size);
		builder.append(", 남은 제품 수 :");
		builder.append(count);
		builder.append(", 제품 가격");
		builder.append(price);
		builder.append("]");
		
		return builder.toString();
		
//		return "Cloth [productNumber=" + productNumber + ", clothName=" + clothName + ", size=" + size + ", count="
//				+ count + ", price=" + price + ", category=" + detail + "]";
	}
	
}
