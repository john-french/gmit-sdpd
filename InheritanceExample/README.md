# Inheritance Example
`Person` is the **super** class (also called a *parent* or *base* class). This class includes attributes common to all persons, like `firstName` and `lastName`.
`HourlyEmployee` is a type of person. It can reuse the attributes and methods of `Person` using inheritance. To inherit from `Person`, `HourlyEmployee` uses the keyword `extends`.

```java
public class HourlyEmployee extends Person {
```
