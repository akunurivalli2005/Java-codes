# Day 6: Data Types

**Topic:** Data Types in Java  

**Overview:**  
Data types define the kind of values a variable can hold. They are essential for memory management, program accuracy, and efficient coding.  

**Types of Data Types:**  

1. **Primitive Data Types:**  
   - Basic types provided by Java.  
   - Examples: `int`, `float`, `double`, `char`, `boolean`, `byte`, `short`, `long`.  
   - Store single values like numbers, characters, or true/false.  
   - Fixed memory size and fast performance.  

2. **Non-Primitive (Reference) Data Types:**  
   - Also called objects or derived types.  
   - Examples: `String`, `Arrays`, `Classes`, `Objects`.  
   - Can store multiple values or complex data structures.  
   - More flexible but slightly slower than primitive types.  

**Importance:**  
- Correct data type selection ensures **efficient memory use**.  
- Helps prevent errors and maintain **data accuracy**.  
- Forms the **foundation for all Java programming concepts**.


# Day 8: Access Modifiers

**Topic:** Access Modifiers in Java  

**Overview:**  
Access modifiers define the **visibility and accessibility** of classes, methods, and variables in Java. They control **who can use or modify** the members of a class.  

**Types of Access Modifiers:**  

1. **Private:**  
   - Accessible **only within the same class**.  
   - Cannot be accessed from outside the class.  

2. **Default (No modifier):**  
   - Accessible **within the same package**.  
   - No keyword is used; just declare the member normally.  

3. **Protected:**  
   - Accessible **within the same package** and **by subclasses** in other packages.  

4. **Public:**  
   - Accessible **from any class** in any package.  

**Key Points:**  
- Use `private` to **hide data** and ensure security.  
- Use `public` for methods or classes that should be widely accessible.  
- `protected` is mainly used for **inheritance**.  
- Default access is used when **no modifier is specified**.  
- Choosing the correct access modifier improves **encapsulation, security, and maintainability**.
