# Inner Classes

---

# What is an Inner Classes?
- Classes don't have to be in their own files.

- A class can be **defined inside** another class


```java
class OuterClass {
    ...
    class InnerClass {
        ...
    }
}
```

- Also called **nested** or **embedded** class

---
# When to use Inner Class?
When a class is used by only **one** other class.

## Benefits
- logically group classes that are only used in one place
- Increases encapsulation
    - outer class private members still visible to inner class
    - inner class hidden entirely
- Helps keep code readable and maintainable
---
# An inner class can....

...... only exist within an instance of its outer class

...... access private members of its outer class
