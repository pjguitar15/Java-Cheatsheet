## Add All
> useful for removing duplicates
```java
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));         
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));         
        listOne.addAll(listTwo);    //Merge both lists         
        System.out.println(listOne);
```

## LinkedList
> add, addAll, clear, getFirst, getLast, get, set, Iterator, Collections
```java
        LinkedList linky = new LinkedList();
        linky.add("Rob");
        linky.add("Alex");
        linky.add("Jose");                
        
        Iterator it = linky.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
```

## ArrayList
> same as LinkedList (except, it can't get first and last)
```java
        ArrayList arrList = new ArrayList();
        arrList.add("Rob");
        arrList.add("Alex");
        arrList.add("Jose");                     
        Iterator it2 = arrList.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
```

## Queue
> same as LinkedList
```java
        Queue<String> q = new LinkedList<String>();
        q.add("Rob");
        q.add("Alex");
        q.add("Jose");       
        q.add("Philcob");     
        System.out.println(q.peek()); // gets first element        
        q.poll(); // removes first element and doesn't return error if list is empty
        System.out.println(q.poll()); // you can also print out the removed element
        System.out.println(q);
```

## Stack
```java
        Stack<String> games = new Stack<String>();
        games.push("Call of Duty");
        games.push("Guitar Hero");
        games.push("Super Monkey Ball");
        games.remove(1); // specifies index to be removed
        games.pop();
        System.out.println(games);
```
