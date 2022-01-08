## BufferedWriter
> writes files and content
```java
  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("directory here"));
  bufferedWriter.write("Hello World"); // writes file content
  bufferedWriter.close(); // write won't work without this
```
## BufferedReader
> read file contents
```java
  BufferedReader bufferedReader = new BufferedReader(new FileReader("directory here"));
  String str;
  while ((str = bufferedReader.readLine()) != null) {
      System.out.println(str);
  }
  bufferedReader.close();
```
