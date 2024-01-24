package collection;
import java.util.Enumeration;
import java.util.Vector;
//Created by Rincy banu
public class VectorEx {
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		vector.addElement("Jasmin");
		vector.add("Rose");
		vector.add("Lilly");
		vector.add("Lotus");
		vector.add("Ziniya");
		vector.add(null);
		
		Enumeration<String> em = vector.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}

	}

}
