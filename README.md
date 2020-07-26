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

### Command Pattern

The Command pattern is a data driven design pattern. A request is wrapped under an object as command and passed to invoker object. Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.

![command pattern](https://www.tutorialspoint.com/design_pattern/images/command_pattern_uml_diagram.jpg)

### Iterator Pattern

Iterator pattern is very commonly used design pattern in Java and .Net programming environment. This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.

![iterator pattern](https://www.tutorialspoint.com/design_pattern/images/iterator_pattern_uml_diagram.jpg)

### Template Pattern

In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class.

![template pattern](https://www.tutorialspoint.com/design_pattern/images/template_pattern_uml_diagram.jpg)

### Null Object Pattern

In Null Object pattern, a null object replaces check of NULL object instance. Instead of putting if check for a null value, Null Object reflects a do nothing relationship. Such Null object can also be used to provide default behaviour in case data is not available.

In Null Object pattern, we create an abstract class specifying various operations to be done, concrete classes extending this class and a null object class providing do nothing implementation of this class and will be used seamlessly where we need to check null value.

![null object pattern](https://www.tutorialspoint.com/design_pattern/images/null_pattern_uml_diagram.jpg)

## Misc

### Project Lombok
This project uses Project Lombok to handle most of the boilerplate code. See https://projectlombok.org/ for more information.

### Slf4j
This project uses SLF4J for logging. See http://www.slf4j.org/ for more information.