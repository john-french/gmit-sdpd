# Inheritance Example
`Person` is the **super** class (also called a *parent* or *base* class). This class includes attributes common to all persons, like `firstName` and `lastName`.
`HourlyEmployee` is a type of person. It can reuse the attributes and methods of `Person` using inheritance. To inherit from `Person`, `HourlyEmployee` uses the keyword `extends`.

```java
public class HourlyEmployee extends Person {
```

`HourlyEmployee` can now re-use the attributes and functionality already created in `Person`. We'll look at three ways of doing this:
- `HourlyEmployee` does some of the work of setting up a new `HourlyEmployee` instance in its own constructor, but it gets `Person` to do some of the work, by calling its constructor using `super(firstName, lastName);`

```java
    public HourlyEmployee(String firstName, String lastName, double rate, double hours) {
        super(firstName, lastName);
        this.payRate = rate;
        this.hoursWorked = hours;
    }
```
The `super(firstName, lastName);` method here means "calls the matching constructor on the parent class (`Person`)".

<details><summary>What happens if we try to call `super(firstName, lastName)` somewhere else in the code?</summary>
<p>
  
It ain't gonna work! You'll see this error message:

```bash
error: call to super must be first statement in constructor
  super(firstName, lastName);  
```
That's a pretty clear error message! We're only allowed to do `super(firstName, lastName)` when it's the first statement in the constructor of the class. 
</p>
</details>
