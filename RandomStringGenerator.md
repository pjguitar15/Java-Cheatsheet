## Generate Random String
> This method basically generates a random index from 0 to the SALTCHARS length
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
