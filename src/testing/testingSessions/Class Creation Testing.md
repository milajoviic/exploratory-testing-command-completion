# Session 02: Class Creation
## Info
- Test name: Testing class creation
- Date: 05/05/2026
- Tester: Mila Jovic
- Duration: 20min
- OS: Windows 11

## Charter
> Testing the ability to create classes 
> using Command Completion functionality in Java.
## Scope of testing
- Class creation using '.' and '..'
- Adding all methods suggested by  '.' and '..'
- Adding fields to the class along with their getters and setters
- Adding the method that is not suggested by '.' and '..'
## Session flow
1. Declared an object whose type is a class that does not exist in the project.
2. Creating a class called Adder using '.' or '..'
3. Added class fields, basic methods such as constructor and methods suggested by Command Completion.

----

## Notes during testing
- [9:53] A variable was declared of type Adder, a class that does not exist in the project.
- [9:53] Class Adder was created using '.' in Main.java.
- [9:55] Fields were added to the class manually.
- [9:56] Typing 'priv..' suggests and completes the 'private' access modifier.
- [9:57] Typing '.' on an empty line inside a class suggests an All-Args Constructor. The entire constructor was generated.
- [9:59] Typing '.' on an empty line in the code suggests generating a Getter or a Setter for one of the fields in the class. This is how
a getter and a setter for field 'a' were created.
- [10:00] Typing '.' next to a class field (e.g. 'b') offers the option to generate its getter and setter directly, without any additional configuration.
- [10:02] Typing '.' next to a class name offers the option to create a class that extends it. The generated class automatically includes a constructor that calls
the parent class constructor.
- [10:05] Typing '.' on an empty line offers the option to generate an overriden toString() method.
- [10:10] The equals() and hashCode() methods were fully generated using '.'.
- [10:13] A method called Add was created that returns c = a + b. When 'c=' was typed, Command Completion offered to add a variable initialization inside a method.

------

## Results of testing

### Expected result
> A class and its basic methods such as constructor can be created using Command Completion.
> Working with class fields, manipulating access modifiers and generating getters and setters is supported.
> Creating classes that extend the generated class is also possible.
### Results obtained
> All expected behavior was confirmed. Command Completion successfully supported class creation, constructor generation, getter and setter
> generation, access modifier suggestions and the creation of a class that extends the generated class.
### Unexpected behavior
> None.
### Questions
> None.