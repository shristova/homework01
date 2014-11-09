package finalTest;

public class Product {
	protected String productCode;
	protected String name;
	protected double price;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [Product Code: ").append(productCode)
				.append(", Name: ").append(name).append(", Price: ")
				.append(price).append("]");
		return builder.toString();
	}

	public Product() {
		super();
	}

	public Product(String productCode, String name, double price) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.price = price;
	}


	public static void main(String[] args) {
		Product pr1 = new Product ("1jdgye", "Articul 1", 123.5);
		Product pr2 = new Product ("2oiuer", "Articul 1", 153.03);
		Product pr3 = new Product ("3poeu", "Articul 1", 10.69);
		System.out.println(pr1.toString());
		System.out.println(pr2.toString());
		System.out.println(pr3.toString());
	}

}
