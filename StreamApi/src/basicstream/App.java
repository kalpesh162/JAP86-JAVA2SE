package basicstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		// of
		Stream<String> stream1 = Stream.of("Apple", "Banana", "Mango");

		Stream<Integer> stream2 = Stream.of(11, 22, 33, 44, 55);
		System.out.println(stream1.count());
		// empty()
		Stream<String> stream3 = Stream.empty();

		System.out.println(stream3.count());

		// builder()
		// Stream<String> stream4=(Stream<String>) Stream.<String>builder();
		Stream<String> stream4 = Stream.<String>builder().add("A").add("B").add("C").build();

		// concat
		Stream<String> s1 = Stream.of("1", "2", "3");
		Stream<String> s2 = Stream.of("4", "5", "6");

		Stream<String> s3 = Stream.concat(s1, s2);

		// generate()

		// static <T> Stream<T> generate(Supplier<T> s)

		// Supplier<Integer> numbers= () -> return 11;

		// Supplier<Double> numbers = () -> new Double(Math.random());
		// Supplier<Double> numbers1 = () -> Math.random();

		Stream<Double> streamDouble = Stream.generate(Math::random).limit(5);

		streamDouble.forEach(System.out::println);

		// UnaryOperator<Integer> increment = (n) -> n+2;
		// n->n+2
		// iterate()
		// static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)
		Stream<Integer> streamInt = Stream.iterate(10, n -> n + 2).limit(5);

		streamInt.forEach(System.out::println);

		// MOSTLY USED
		List<String> letters = Arrays.asList("A", "B", "C", "D");
		
		Stream<String> words=letters.stream();

		String arr[]= {"A", "B", "C", "D"};
		Stream<String> str=Arrays.stream(arr);
	
		
	}

}
