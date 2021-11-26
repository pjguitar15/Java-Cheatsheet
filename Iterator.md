## Generate Random ID
> Iterate through a list
```java
    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());

    // loop through items. it will serve as the index
    while(it.hasNext()) {
      System.out.println(it.next());
    }
```
