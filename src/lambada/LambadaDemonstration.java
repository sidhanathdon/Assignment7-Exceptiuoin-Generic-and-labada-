package lambada;
//@file LambadaDemonstration.java
//@author Sidhanath Verekar
//@brief This is a starter class in which Arraylist and Connsumer as labada method is demonstrated
//@Date:22/10/24
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambadaDemonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    Consumer<Integer> method = (n) -> { System.out.println(n); };
	    numbers.forEach( method );
	}

}
