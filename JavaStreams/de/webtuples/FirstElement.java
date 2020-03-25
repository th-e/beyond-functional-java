package de.webtuples;
import java.util.List;

public class FirstElement {
	public static void main(final String[] args) {
		List<Integer> ints = List.of(10, 2, 4);
		System.out.println(firstElement(ints));
	}	

	private static int firstElement(List<Integer> ints){
		return ints.get(0);
	}
}
