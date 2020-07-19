# Java Design Patterns & Principles

## Principles

### SOLID
**Single Responsibility** - A class should only have one responsibility. Furthermore, it should only have one reason to change.

**Open/Closed Principle** - Classes should be open for extension, but closed for modification. In doing so, we stop ourselves from modifying existing code and causing potential new bugs. One exception to the rule is when fixing bugs in existing code.

**Liskov Substitution** - If class A is a subtype of class B, then we should be able to replace B with A without disrupting the behavior of our program.

**Interface Segregation** - Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

**Dependency Inversion** - The principle of Dependency Inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.
## Behavioral Patterns

### Strategy Pattern

With the Strategy Pattern, a class behavior or its algorithm can be changed at run time.

When implementing the Strategy Pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object.

![strategy pattern](https://www.tutorialspoint.com/design_pattern/images/strategy_pattern_uml_diagram.jpg)

### Observer Pattern

The Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified that it's dependent objects are to be notified automatically.

![observer pattern](https://www.tutorialspoint.com/design_pattern/images/observer_pattern_uml_diagram.jpg)

## Misc

### Project Lombok
This project uses Project Lombok to handle most of the boilerplate code. See https://projectlombok.org/ for more information.

### Slf4j
This project uses SLF4J for logging. See http://www.slf4j.org/ for more information.