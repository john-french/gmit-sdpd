# Methods review

## What are methods for?
- break program into more **manageable chunks**
- **reuse** code to avoid repetition

## Things methods have
- **name**: a label briefly describing what the method does
- **signature**: the things that make that particular method unique
- **parameters**: things we can *input* to the method for it to process
- **return type**: the type of thing the method can *output*
```java
// name: yardsFtInchToCM
// parameters: 3 ints, called yards, feet, inches
// return type: double
// this line is the method signature
public static double yardsFtInchToCM (int yards, int feet, int inches)  {
    final double CMs_in_INCH = 2.54;
    double cms = (yards *36 + feet *12 + inches ) * CMs_in_INCH;

    return (cms);
}
```

## Input/Output: Methods can have...
- **no input or output**, just do something
    - empty parameter list `()`
    - `void` return type
```java
public static void sayHello() {
    System.out.println("Hello!");
}
```

- **output** but **no input** (just returns something)
    - empty parameter list `()`
    - return type says what it returns
```java
public static String getCleverThing() {
    String cleverThing = "This is so clever!";
    return cleverThing;
}
```

- **input** but **no output** (processes something but doesn't return anything)
    - parameter list says what you can input
    - `void` return type
```java
public static void saySomething(String thingToSay) {
    System.out.println(thingToSay);
}
```

- **input and output** (processes something and returns something else)
    - parameter list says what you can input
    - return type says what it returns
```java
public static int getNumberSquared(int number) {
    int square = number * number;
    return number;
}
```

## Using a method: new jargon
- **call** a method
    - using method in your program
- **pass** parameters to a method
    - sending input to a method for it to process

```java
// Time to say hello
sayHello();

String somethingClever = getCleverThing();
System.out.println(somethingClever);

saySomething("Howya");

// Time to do sums
int number = 11;
int squareOfNumber = getNumberSquared(number);
```


