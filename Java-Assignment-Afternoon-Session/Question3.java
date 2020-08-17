
/*Question 3. Create a Product class having properties like name,category, price .Create a ProductFactory class which gives you the List of products when you pass the number of Products.
  Now use stream Api -
	1) To get the list of products whose price range is between x and y.(You can assume x and y yourself)
	2) To get the total categories in the product list.
	3) To get the maximum and minimum priced product in each category.
*/
import java.util.*;
import java.util.stream.Collectors;

class Product {
	private String name;
	private Integer Category;
	private Double price;

	public Product() {

	}

	public Product(String name, Integer category, Double price) {
		super();
		this.name = name;
		Category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCategory() {
		return Category;
	}

	public void setCategory(Integer category) {
		Category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}

class ProductFactory {
	public String assignName(int len) {
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int MAX = 26;
		String name = "";
		for (int i = 0; i < len; i++)
			name = name + alphabet[(int) (Math.random() * 10 % MAX)];

		return name;
	}

	public double assignPrice() {
		int min = 100, max = 1000;
		return Math.random() * (max - min + 1) + min;

	}

	public int assignCategory() {
		return (int) (Math.random() * (10) + 1);
	}

	public List<Product> createList(int size) {
		List<Product> productList = new ArrayList<>(size);

		for (int i = 0; i < size; i++) {
			productList.add(new Product(assignName(7), assignCategory(), assignPrice()));
		}

		return productList;
	}
}

public class Question3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of list you want");
		System.out.println();
		int sizeOfList = s.nextInt();

		ProductFactory pfObject = new ProductFactory();

		List<Product> productList = pfObject.createList(sizeOfList);

		System.out.println("Enter range of price");
		System.out.println();
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println();

		List<Product> listFilteredOnPrice = productList.stream()
				.filter(product -> product.getPrice() >= x && product.getPrice() <= y).collect(Collectors.toList());

		System.out.println("Filtered products are : ");
		System.out.println();

		for (Product p : listFilteredOnPrice) {
			System.out.println("Product Name " + p.getName());
			System.out.println("Product Category " + p.getCategory());
			System.out.println("Product Name " + p.getPrice());
			System.out.println();
		}

		System.out.println();
		System.out.println();

		Set<Integer> categoryList = productList.stream().map(Product::getCategory).collect(Collectors.toSet());
		int totalCategories = categoryList.size();
		System.out.println("Total number of categories  = " + totalCategories);
		System.out.println();
		System.out.println();
		double minPrice = 0;
		double maxPrice = 0;
		for (Integer j : categoryList) {
			maxPrice = productList.stream().filter(product -> product.getCategory() == j).map(Product::getPrice)
					.max(Comparator.comparing(Double::valueOf)).get();
			minPrice = productList.stream().filter(product -> product.getCategory() == j).map(Product::getPrice)
					.min(Comparator.comparing(Double::valueOf)).get();
			System.out.println("Max price in category " + j + " = " + maxPrice);
			System.out.println("Min price in category " + j + " = " + minPrice);
			System.out.println();

		}
		s.close();
	}
}

/*
Output

Enter size of list you want


25
Enter range of price

400 500

Filtered products are : 

Product Name bjjagif
Product Category 1
Product Name 458.9928881054933

Product Name gabjiff
Product Category 9
Product Name 419.92381565220467



Total number of categories  = 10


Max price in category 1 = 983.6334630429619
Min price in category 1 = 458.9928881054933

Max price in category 2 = 173.20116763010373
Min price in category 2 = 173.20116763010373

Max price in category 3 = 147.36996627345206
Min price in category 3 = 147.36996627345206

Max price in category 4 = 909.415729725824
Min price in category 4 = 306.7588267938613

Max price in category 5 = 652.122489432252
Min price in category 5 = 652.122489432252

Max price in category 6 = 977.7890408162671
Min price in category 6 = 235.9093240858653

Max price in category 7 = 973.9461806487942
Min price in category 7 = 166.46098112350145

Max price in category 8 = 905.7938695608386
Min price in category 8 = 336.2878244211446

Max price in category 9 = 597.5481518069046
Min price in category 9 = 144.51940259176195

Max price in category 10 = 170.8259253082026
Min price in category 10 = 132.669476044399


*/
