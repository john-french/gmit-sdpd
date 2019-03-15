# Inheritance Example
Sample code illustrating the key concepts of inheritance can be found in the `.java` files above. Here's a short description of what's going on in that code.

`Person` is the **super** class (also called a *parent* or *base* class). This class includes attributes common to all persons, like `firstName` and `lastName`.
`HourlyEmployee` is a type of person. It can reuse the attributes and methods of `Person` using inheritance. To inherit from `Person`, `HourlyEmployee` uses the keyword `extends`.

```java
public class HourlyEmployee extends Person {
```

`HourlyEmployee` can now re-use the attributes and functionality already created in `Person`. Let's look at how this is done.

### Calling the superclass's constructor
- `HourlyEmployee` does some of the work of setting up a new `HourlyEmployee` instance in its own constructor, but it gets `Person` to do some of the work, by calling its constructor using `super(firstName, lastName);`

```java
    public HourlyEmployee(String firstName, String lastName, double rate, double hours) {
        super(firstName, lastName);
        this.payRate = rate;
        this.hoursWorked = hours;
    }
```
`super` is a Java keyword that refers to the superclass (`Person`). The `super(firstName, lastName);` method here means "calls the matching constructor on the superclass  (`Person`)".

**Question:** What happens if we try to call `super(firstName, lastName)` somewhere else in the code?
<details><summary>Answer</summary>
<p>
  
It doesn't work! You'll see this error message:

```bash
error: call to super must be first statement in constructor
  super(firstName, lastName);  
```
That's a pretty clear error message! We're only allowed to do `super(firstName, lastName)` when it's the first statement in the constructor of the class. 
</p>
</details>

### Using attributes and methods from the superclass
Let's say we want to add a method to `HourlyEmployee` that will allow us to set all it's attributes at once, e.g.:
```java
    public HourlyEmployee(String firstName, String lastName, double payRate, double hoursWorked) {

}
```
Setting the `payRate` and `hoursWorked` is straightforward, since these are attributes of the `HourlyEmployee` class:
```java
    public HourlyEmployee(String firstName, String lastName, double payRate, double hoursWorked) {
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
} 
```
But what about firstName and lastName? These are attributes of the superclass `Person`. 

**Question:** Could we just do this?
```java
        this.firstName = firstName;
        this.lastName = lastName;
```
<details><summary>Answer</summary>
<p>
Nope! We get this compiler error:
    
```bash
HourlyEmployee.java:42: error: firstName has private access in Person
    this.firstName = firstName;
            ^
HourlyEmployee.java:43: error: lastName has private access in Person
        this.lastName = lastName;
```
`firstName` and `lastName` are declared as `private` attributes in `Person`, which means they can only be accessed directly from inside the `Person` class. This is an example of encapsulation, a key object-oriented programming concept.
</p>
</details>

Since `HourlyEmployee` inherits from `Person`, we can reuse some of the methods in `Person`. This gives us a nifty way to set `firstName` and `lastName`:

```java
    public void setNameRateHours(String firstName, String lastName, double payRate, double hoursWorked) {
        setName(firstName, lastName);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
}
```

The statement `setName(firstName, lastName);` looks like its calling a method called `setName` in the current class (`HourlyEmployee`). But there's no method defined in `HourlyEmployee` with that name and signature. 

**Question** So where is the `setName(firstName, lastName)` method defined?
<details><summary>Answer</summary>
<p>
    
 It's defined in `Person`. We can use it in `HourlyEmployee` as if it was was defined in `HourlyEmployee` because `HourlyEmployee` extends `Person`, and so can use all the public (and protected) methods in the `Person` class as if they were its own.
 
</p>
</details>
    

