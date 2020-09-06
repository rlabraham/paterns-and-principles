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

### Visitor Pattern

In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class. By this way, the execution algorithm of an element can vary as and when the visitor varies. As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object.

![visitor pattern](https://www.tutorialspoint.com/design_pattern/images/visitor_pattern_uml_diagram.jpg) 

## Creational Patterns

### Singleton Pattern

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

![singleton pattern](https://www.tutorialspoint.com/design_pattern/images/singleton_pattern_uml_diagram.jpg)

### Factory Pattern

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

![factory pattern](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)

### Builder Pattern

Builder pattern builds a complex object using simple objects and using a step by step approach. This pattern provides one of the best ways to create an object.

![builder pattern](https://www.tutorialspoint.com/design_pattern/images/builder_pattern_uml_diagram.jpg)

### Data Access Object (DAO) Pattern

Data Access Object Pattern or DAO pattern is used to separate low level data accessing API or operations from high level business services. Following are the participants in Data Access Object Pattern.

   - **Data Access Object Interface** - This interface defines the standard operations to be performed on a model object(s).

   - **Data Access Object concrete class** - This class implements above interface. This class is responsible to get data from a data source which can be database / xml or any other storage mechanism.

   - **Model Object or Value Object** - This object is simple Java object containing get/set methods to store data retrieved using DAO class.
   
![data access object pattern](https://www.tutorialspoint.com/design_pattern/images/dao_pattern_uml_diagram.jpg)


## Misc

### Project Lombok
This project uses Project Lombok to handle most of the boilerplate code. See https://projectlombok.org/ for more information.

### Slf4j
This project uses SLF4J for logging. See http://www.slf4j.org/ for more information.

### Apache Commons-Lang
This project uses the Apache Commons-Lang library in several places. See https://commons.apache.org/proper/commons-lang/ for more information.