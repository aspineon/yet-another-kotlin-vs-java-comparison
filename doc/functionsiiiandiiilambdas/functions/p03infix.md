
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Infix

## Kotlin

**Example.kt**

```kotlin
package functionsiiiandiiilambdas.functions.p03infix

infix fun Int.shl(x: Int): Double {
    println("x:" + x)
    println("this: " + this)
    val y = (this + x) * Math.random()
    println(y)
    return y
}

fun test() {
    val res1 = 1 shl 2
    println(res1)
    val res2 = 1.shl(2)
    println(res2)
}
```

## Java

**ExampleKt.java**

```java
package functionsiiiandiiilambdas.functions.p03infix;

import java.io.PrintStream;
import kotlin.Metadata;

public final class ExampleKt {
    public static final double shl(int $receiver, int x) {
        double y;
        String string = "x:" + x;
        System.out.println((Object)string);
        string = "this: " + $receiver;
        System.out.println((Object)string);
        y = (double)($receiver + x) * Math.random();
        System.out.println(y);
        return y;
    }

    public static final void test() {
        int res1 = 4;
        System.out.println(res1);
        int res2 = 1 << 2;
        System.out.println(res2);
    }
}

```
