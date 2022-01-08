## BufferedWriter
> needs these two to work
```java
  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("directory here"));
  bufferedWriter.write("Hello World"); // writes file content
  bufferedWriter.close(); // write won't work without this
```
