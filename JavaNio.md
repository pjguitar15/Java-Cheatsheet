## Java NIO
* It is a newer version of Java IO (File)
* NIO stands for Non-blocking IO

## Print File Texts
> using a for in loop
```java
import java.nio.file.Files;
import java.util.List;

Path path = Paths.get("E:\\IntelliJ Projects\\Random\\src\\test.txt");
  try {
      List data = Files.readAllLines(path);
      for (Object line : data) {
          System.out.println(line);
      }
  } catch (IOException e) {
      e.printStackTrace();
  }
```

## Writing a single line
> overwrites the whole file content
```java
import java.nio.file.Files; // required
  String content="Hey Coding Owls!!";
  Files.write(path, content.getBytes());
```

## Writing multiple lines
> overwrites the whole file content
```java
  List contentInList=new ArrayList<>();
  contentInList.add("Twinkle, twinkle, little star");
  contentInList.add("How I wonder what you are");
  contentInList.add("Up above the world so high");
  contentInList.add("Like a diamond in the sky");
  contentInList.add("Twinkle, twinkle little star");
  contentInList.add("How I wonder what you are");
  
  try {
    Files.write(path, contentInList);
  } catch (IOException e) {
    e.printStackTrace();
  }
```

## Import Statement
> needs these two to work
```java
  import java.nio.file.Path;
  import java.nio.file.Paths; 
```

## Path instance
> right click file, then click copy path, to get path
```java
  Path path = Paths.get("E:\\IntelliJ Projects\\Random\\src\\test.txt");
```

## Get File Name
> returns test.txt
```java
  path.getFileName();
```

## Get File System
> returns sun.nio.fs.WindowsFileSystem@1b28cdfa
```java
  path.getFileSystem()
```

## Get Name
> returns directory names per level
```java
  path.getName(0); // returns parent directory name
  path.getName(1); // returns child directory
  path.getName(2); // returns grandchild directory
  path.getName(3); // returns great-grandchild directory
  path.getName(4); // returns IllegalArgumentException
```

## Get Name Count
> return directory level count
```java
  path.getNameCount(); 
```

## Get Parent
> returns parent directories - E:\IntelliJ Projects\Random\src
```java
  path.getParent()
```

## Get Root
> returns Disk letter - E:\
```java
  path.getRoot()
```

## Get Class
> returns class sun.nio.fs.WindowsPath
```java
  path.getClass()
```

## To Absolute Path and To File
> returns the absolute path. both returns the same thing. 
```java
  path.toAbsolutePath()
  path.toFile()
```

## To URI
> returns a link (clickable): file:///E:/IntelliJ%20Projects/Random/src/test.txt
```java
  path.toUri()
```

## To Real Path
> returns a link (clickable): file:///E:/IntelliJ%20Projects/Random/src/test.txt
```java
  try {
      System.out.println(path.toRealPath());
  } catch (IOException e) {
      e.printStackTrace();
  }
```

## To Hash Code
> returns this hash number: -1973821019
```java
  path.hashCode()
```
