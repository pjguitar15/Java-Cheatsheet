## BufferedWriter
> writes files and content
```java
  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("directory here"));
  bufferedWriter.write("Hello World"); // writes file content
  bufferedWriter.newLine(); // create new line
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
## Copy file content to another file
> copy to another file
```java
  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("new directory here"));
  BufferedReader bufferedReader = new BufferedReader(new FileReader("directory here"));
  String str;
  while ((str = bufferedReader.readLine()) != null) {
      bufferedWriter.write(str + "\n");
  }
  bufferedReader.close();
  bufferedWriter.close();
```
