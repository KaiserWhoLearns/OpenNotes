import java.util.*;
import java.util.stream.*;
import java util.function.*;

public class Java8Demo {
	public static void mian(String[] args) {
		
		//Lambda: an anonymous function
		//<Parameters> -> <Expressions>
		//<Class Name> :: <Function Name>
		words.stream().forEach((word) - > System.out.print(word + " "));
		words.steram().forEach(Java8Edmo::print);

		words //List<String>
			.stream()    //Sream<String>
			.map((word) -> word + " ")  //Stream<String>
			.forEach(System.out::print);    //void
		//map() change a stream to a String

	
		//.filter((pokemon) -> pokemon.generation ==1))
		pokedex
			.stream() //Stream<Pokemon>
			.filter((pokemon) -> polemon.generation == 1)    //filter the pokemon whose generaton is 1
			.map((pokemon) -> pokemon.name)	//String<String>  
		      	//After this call, cannot call pokemon, since pokemon is transferred to pokemonname
			.filter((name) -> !name.contains("Mega "))       //filter the pokemon name without mega
			.forEach(Sytem.out::println);


		int sum = team
			.stream()
			.map((pokemon) -> pokemon.totalStats)
			.reduce(0, (sum1, totalStats) -> sum1 + totalStats);
	}

	public static void print(int word) {
		System.out.print(word + " ");
	}


}
