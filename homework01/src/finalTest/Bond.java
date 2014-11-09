package finalTest;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.LinkedList;

public class Bond {
	private static long sequence = 0;
	protected long id;
	protected String date;
	protected LinkedList<Position> possition;
	
	protected static  Long getNextId() {
		return ++sequence;
	}
	public Bond() {
		super();
	}
	private static Position Position(int i, String string, int j) {
		Position pos = new Position(i, string, j);
		return pos;
	}

	public Bond(Long id, String date, LinkedList<Position> possition) {
		super();
		this.id = id;
		this.date = date;
		this.possition = possition;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bond [ Id:").append(id).append(", date: ").append(date)
				.append(", Possition(s): \n").append(Arrays.toString(possition.toArray()))
				.append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		LinkedList<Position> positionList = new LinkedList<>();
		for (int i =0; i<3; i++){
			positionList.add(Position(i+1, "code"+i, i+2));
		};
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date(); 
		Long id = getNextId();
		Bond bond1 = new Bond(id, dateFormat.format(date), positionList);
		System.out.println(bond1.toString());
	}

	
}
