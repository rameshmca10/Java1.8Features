package java18.samples;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		numbers.add(null);
		numbers.forEach((n) -> {
			System.out.println(n);
		});

		Consumer<Integer> method = (n) -> {
			System.out.println(n);
		};
		numbers.forEach(method);

		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";

		System.out.println(exclaim.run("Hello"));
		System.out.println(ask.run("Hello"));
		System.out.println(StringFunction.runs("Hello"));
		//System.out.println(StringFunction.show());
				
	}
	
	void show() {
		System.out.println("Hello default");
	}

}

interface StringFunction {
	String run(String str);

	static String runs(String str) {
		return "String " + str;
	}
	
	default String show()
    {
      return "Default Method Executed";
    }
	
}