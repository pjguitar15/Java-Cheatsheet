## Generate Random String
> NumberFormat is abstract. It cannot be instantiated. Here's how you do it.
```java
    public static String generateSalt() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String salt = "";
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length()); // generates random number up to String length
            salt += SALTCHARS.charAt(index); // append the taken char to salt string
        }        
        return salt;
    }
```
