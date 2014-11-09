package finalTest;

import java.sql.Date;
import java.util.LinkedList;

public class CashRegister {
	protected String izdatel;
	protected LinkedList <Product> products;
	protected double casa;
	protected String date;

	
	public void initialize(){
		Product pr1 = new Product ("1jdgye", "Articul 1", 123.5);
		Product pr2 = new Product ("2oiuer", "Articul 1", 153.03);
		Product pr3 = new Product ("3poeu", "Articul 1", 10.69);
		products.add(pr1);
		products.add(pr2);
		products.add(pr3);
		izdatel = "IPT";
		casa = 0;
		
	}

	;
	public CashRegister() {
		super();
	}

	public CashRegister(String izdatel, LinkedList<Product> products,
			double casa, String date) {
		super();
		this.izdatel = izdatel;
		this.products = products;
		this.casa = casa;
		this.date = date;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
