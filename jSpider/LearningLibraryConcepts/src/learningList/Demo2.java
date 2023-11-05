package learningList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Demo2 {
public static void main(String[] args) {
	
	ArrayList l1 = new ArrayList();
	LinkedList l = new LinkedList();
	
	System.out.println(l instanceof Serializable);
	System.out.println(l instanceof Cloneable);
	System.out.println(l instanceof RandomAccess);
}
}
