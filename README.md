# java


```java

class Solution {
    public int solution(String str1, String str2) {
        int n = str2.length();
        int m = str1.length();

        for (int i = 0; i <= n - m; i++) {
            if (str2.substring(i, i + m).equals(str1)) {
                return 1;
            }
        }

        return 0;
    }
}
```
```java
String str = "Hello, World!";

// Extracts substring starting from index 0 (inclusive) to 5 (exclusive)
String sub1 = str.substring(0, 5); // sub1 is "Hello"

// Extracts substring starting from index 7 (inclusive) to the end of the string
String sub2 = str.substring(7); // sub2 is "World!"

// Extracts substring starting from index 1 (inclusive) to 4 (exclusive)
String sub3 = str.substring(1, 4); // sub3 is "ell"
```




