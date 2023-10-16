package learningList;

import java.util.ArrayList;

public class MainClass1 {
	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		
		l1.add(1001);
		l1.add("kamlesh kumar kolhi");
		l1.add("B.E");
		l1.add("Anna University");
		l1.add('m');
		
		
		
		System.out.println("SL NO.\tName\tDegree\tCollege\tGender");
		System.out.println("-----------------------------------------");
		for (Object ele : l1) {
			System.out.print(ele+" ");
			
		}
		System.out.println();
		
		System.out.println("inserting elements @ index 2\n");
		
		//inserting elements @ index 2
		l1.add(2,"CSE");
		System.out.println(l1);
		
		//replaceing element @ index 2
		System.out.println("replaceing element @ index 2");
		l1.set(0, 310519104054l);
		
		System.out.println(l1);
		
		
		
	}

}
