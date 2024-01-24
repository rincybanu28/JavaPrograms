package java8features;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//created by Rincy banu
public class StreamWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(56);
		marks.add(72);
		marks.add(48);
		marks.add(84);
		marks.add(66);
		
		System.out.println("Marks before grace: "+marks);
		
		//give grace marks by 10
		List<Integer> updateMarks = marks.stream().map(i -> i+10).collect(Collectors.toList());
		System.out.println("Marks after grace: "+updateMarks);
		
	}

}
