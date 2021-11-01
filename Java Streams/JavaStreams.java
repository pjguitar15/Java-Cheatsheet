/*
Filter, Sort, Map -> Collect
(transform a list)
forEach() applies same function to each element
collect saves the elements into a collection
*/

// Lambda
stream.forEach( s-> System.out.println(s));
// Colon Operator 
stream.forEach( System.out::println(s));

// 1. Integer Stream
IntStream.range(1, 10).forEach(System.out::println); // prints 1 to 9

// 2. Integer Stream with skip (skips first five elements)
IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));

// 3. Integer Stream with sum (adds all elements in a range)
System.out.println(IntStream.range(1, 5).sum()); // prints 10

// 4. Stream.of, sorted and findFirst (Stream.of is used for list of Strings)
Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);  // prints Alberto
Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(x -> System.out.println(x)); // same as above but using lambda

// 5. Stream from Array, sort, filter and print
// same as Stream.of
String[] names = {"One", "Two", "Three", "Four", "Five"};
Arrays.stream(names).filter(x -> x.startsWith("T")).sorted().forEach(System.out::println);

// 6. Average of squares of an int array
Arrays.stream(new int[] {2, 4, 6, 8, 10}).map(x -> x * x).average().ifPresent(System.out::println);

// 7. Get average grade
int[] grades = {90, 87, 89, 92, 95, 88};
Arrays.stream(grades).average().ifPresent(System.out::println);

// 8. Stream from list, filter and print
List<String> people = Arrays.asList("One", "Two", "Three", "Four", "Five");
people.stream().map(x -> x.toLowerCase()).filter(x -> x.startsWith("t")).forEach(System.out::println);

// 9. Stream rows from text file, sort, filter, and print