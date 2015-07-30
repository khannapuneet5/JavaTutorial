package com.msci.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		List<String> countries = Arrays.asList("India", "UK", "USA", "Spain", "SL");
		// Print all countries that start with U in lowercase
		countries.stream().filter(a->a.startsWith("U")).map(s->s.toLowerCase()).forEach(System.out::println);
		
		Stream.of("India", "UK", "USA", "Spain", "SL").filter(a->a.startsWith("U")).map(s->s.toLowerCase()).forEach(System.out::println);
		
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(a->a%2==0).forEach(System.out::println);
		System.out.println("Sum of even numbers: " + Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(a->a%2==0).reduce((x,y) -> x+y).get());
		System.out.println("Sum of square of even numbers: " + Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(a->a%2==0).map(x->x*x).reduce((x,y) -> x+y).get());
	}

}
