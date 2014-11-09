package finalTest;

public class Position {
	protected int positionNumber;
	protected String productCode;
	protected int quantity;
	
	
	public Position(int positionNumber, String productCode, int quantity) {
		super();
		this.positionNumber = positionNumber;
		this.productCode = productCode;
		this.quantity = quantity;
	}

	public Position() {
		super();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Position Number: ").append(positionNumber)
				.append(", Product Code:").append(productCode)
				.append(", Quantity ").append(quantity).append("\n");
		return builder.toString();
	}
	
}
