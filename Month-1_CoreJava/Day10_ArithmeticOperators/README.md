# Day 10: Arithmetic Operators in Java

**Topic:** Arithmetic Operators  

**Overview:**  
Arithmetic operators in Java are used to perform **mathematical calculations** on numeric data types like `int`, `float`, `double`, etc. They form the foundation of all numeric operations in Java.  

---

## **1. Types of Arithmetic Operators**

| Operator | Description | Example |
|----------|-------------|---------|
| `+`      | Addition – adds two values | `a + b` |
| `-`      | Subtraction – subtracts second value from first | `a - b` |
| `*`      | Multiplication – multiplies two values | `a * b` |
| `/`      | Division – divides first value by second | `a / b` |
| `%`      | Modulus – remainder after division | `a % b` |
| `++`     | Increment – increases value by 1 | `a++` |
| `--`     | Decrement – decreases value by 1 | `a--` |

---

## **2. Example Program with All Operators**

```java
// Month-1_CoreJava/Day10_ArithmeticOperators/ArithmeticOperatorsExample.java
// Day 10: Arithmetic Operators Example

public class ArithmeticOperatorsExample {
    public static void main(String[] args) {

        // Declaring two integer variables
        int a = 10;  // First number
        int b = 3;   // Second number

        // Addition
        int sum = a + b;  // Adds 10 + 3 = 13
        System.out.println("Sum: " + sum);  // Prints "Sum: 13"

        // Subtraction
        int diff = a - b;  // Subtracts 3 from 10 = 7
        System.out.println("Difference: " + diff);  // Prints "Difference: 7"

        // Multiplication
        int prod = a * b;  // Multiplies 10 * 3 = 30
        System.out.println("Product: " + prod);  // Prints "Product: 30"

        // Division
        int div = a / b;  // Divides 10 / 3 = 3 (integer division)
        System.out.println("Division: " + div);  // Prints "Division: 3"

        // Modulus
        int mod = a % b;  // Remainder of 10 / 3 = 1
        System.out.println("Modulus: " + mod);  // Prints "Modulus: 1"

        // Increment
        a++;  // Increases a by 1, now a = 11
        System.out.println("Incremented a: " + a);  // Prints "Incremented a: 11"

        // Decrement
        b--;  // Decreases b by 1, now b = 2
        System.out.println("Decremented b: " + b);  // Prints "Decremented b: 2"
    }
}
Sum: 13
Difference: 7
Product: 30
Division: 3
Modulus: 1
Incremented a: 11
Decremented b: 2

