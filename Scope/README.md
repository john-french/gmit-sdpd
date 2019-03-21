# Scope
## Different kinds of variables

- **instance variables **
    - Any method in the class definition can access these variables

- **parameter variables**
    - Only the method where the parameter appears can access these variables.
    - This is how information is passed to the method.

- **local variables**
    - Only the method where the parameter appears can access these variables.
    - These variables are used to store intermediate results.

 ### Each kind of variable has different **scope**
Scope means where in the code a variable can be accessed

---
## Scope Example
```java
public class TwoSides
{
   int side1, side2;
   public boolean isRightTriangle(int hypoteneuse)
   {
      int side1Squared = side1 * side1 ;
      int side2Squared = side2 * side2 ;
      int hypSquared = hypoteneuse * hypoteneuse ;

      return (side1Squared + side2Squared) == hypSquared ;
   }
}
```
- side1, side2 are **instance variables**
    - Any method in TwoSides can access these variables
    - **class scope**
- hypoteneuse is a **parameter variable** for `isRightTriangle`
    - only visible in `isRightTriangle` method
    - **method scope**
- hypSquared is a **local variable**
    - only visible in `isRightTriangle` method
    - **method scope**

---
### Different methods can use the same parameter names
```java
public class TwoSides
{
   int side1, side2;

   public boolean isRightTriangle(int hypoteneuse)
   {
      // hypoteneuse refers to parameter above
      // NOT same as isScaleneTriangle
   }

   public boolean isScaleneTriangle(int hypoteneuse)
   {
      // hypoteneuse refers to parameter above
      // hypoteneuse is NOT same as isRightTriangle
   }
}
```
---
### Parameter variables can have same names as instance variables
Use `this` to indicate the instance variables
```java
public class TwoSides
{
   int side1, side2;

   public TwoSides(int side1, int side2) {
       this.side1 = side1;
       this.side2 = side2;
   }
}
```
---
## Shadowing
- When a variable has the same name as another variable in the same scope
    - e.g. `title` in this example

```java
public class ShadowingExample {
    String title = "John French";
    public void printTitle() {
        System.out.println(title);
        String title = "John Doe";
        System.out.println(title);
    }
}
```
- Variable with local scope **shadows** the outer variable
    - overrides it

### Bad practice, potentially confusing, watch out for it!

---
## Variable memory
### Do variables have memory?
can they remember their values after you've finished using them?

- Local variables: **NO**
    - get new values every time method is called
- Parameter variables: **NO**
    - get new values every time method is called
- Instance variables: **YES**
    - keep their value unless explicitly changed

### Why do different types of variables have different *memory*?

- #### Depends on *lifetime* of variable

---
## Lifetime

## Different kinds of variables have different lifetimes.
- **Parameter variables**
    - Created when the method call is made
    - Disappear when the method call is complete
- **Local variables** have a similar lifetime to parameter variables.
    - Created when the method is called
    - Disappear when the method call is complete
- **Instance variables** have a much longer lifetime
    -   Created when the object is constructed
    -   Disappear when the object **disappears**.

### What does it mean to disappear?
- Java runs a Garbage Collector program
    - periodically removes objects from memory which are no longer used
