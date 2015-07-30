package com.msci.ex1;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Lambda2 {

	public static void main(String[] args) {
		
		
		Function<Integer, Function<Integer, UnaryOperator<Integer>>> multiAdd = a -> {return b->(c)->a+b+c;};
		System.out.println(multiAdd.apply(1).apply(2).apply(3));
		
		Function<Integer, BiFunction<Integer, Integer, Integer>> add3 = a -> {return (b,c)->a+b+c;};
		System.out.println(add3.apply(1).apply(2, 3));
			
		
		/*UnaryOperator<Integer> square1 = (Integer a) -> {return a*a;};
		System.out.println(square1.apply(100));
		*/
		UnaryOperator<Integer> square1 = (a) -> { return a*a;};
		System.out.println(square1.apply(100));
		
		
		BiFunction<Integer, Integer, Integer> add = (a, b) -> {return a+b;};
		System.out.println(add.apply(10, 20));
				
		Function<Integer, Boolean> isEven = (Integer num) -> {return num % 2 == 0;};
		System.out.println(isEven.apply(15));
		System.out.println(isEven.apply(16));
		
		Function<String, Integer> fn1 = (String a) -> {return Integer.parseInt(a);};
		System.out.println(fn1.apply("25"));
				
		Function<Integer, Integer> square = (Integer a) -> {return a*a;};
		System.out.println(square.apply(10));
	}

}
