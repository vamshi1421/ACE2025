package freelancer;

public class Category {
    private int categoryId;
    private String CategoryName;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public Category(int categoryId,String categoryName) {
		System.out.println(" ");
		this.categoryId=categoryId;
		this.CategoryName=categoryName;
	}
    
    // Constructors, getters, setters
}
