## Import Statement
> needs these two to work
```java
  import java.nio.file.Path;
  import java.nio.file.Paths; 
```

## Path instance
> right click file, then click copy path, to get path
```java
  Path test = Paths.get("E:\\IntelliJ Projects\\Random\\src\\test.txt");
```

## Get File Name
> returns test.txt
```java
  test.getFileName();
```

## Get File System
> returns sun.nio.fs.WindowsFileSystem@1b28cdfa
```java
  test.getFileSystem()
```

## Get Name
> returns directory names per level
```java
  test.getName(0); // returns parent directory name
  test.getName(1); // returns child directory
  test.getName(2); // returns grandchild directory
  test.getName(3); // returns great-grandchild directory
  test.getName(4); // returns IllegalArgumentException
```

## Get Name Count
> return directory level count
```java
  test.getNameCount(); 
```

## Get Parent
> returns parent directories - E:\IntelliJ Projects\Random\src
```java
  test.getParent()
```

## Get Root
> returns Disk letter - E:\
```java
  test.getRoot()
```

## Get Class
> returns class sun.nio.fs.WindowsPath
```java
  test.getClass()
```

## To Absolute Path and To File
> returns the absolute path. both returns the same thing. 
```java
  test.toAbsolutePath()
  test.toFile()
```

## To URI
> returns a link (clickable): file:///E:/IntelliJ%20Projects/Random/src/test.txt
```java
  test.toUri()
```

## To Real Path
> returns a link (clickable): file:///E:/IntelliJ%20Projects/Random/src/test.txt
```java
  try {
      System.out.println(test.toRealPath());
  } catch (IOException e) {
      e.printStackTrace();
  }
```

## To Hash Code
> returns this hash number: -1973821019
```java
  test.hashCode()
```

## Print File Texts
> using a for in loop
```java
import java.nio.file.Files;
import java.util.List;

Path test = Paths.get("E:\\IntelliJ Projects\\Random\\src\\test.txt");
  try {
      List data = Files.readAllLines(test);
      for (Object line : data) {
          System.out.println(line);
      }
  } catch (IOException e) {
      e.printStackTrace();
  }
```
