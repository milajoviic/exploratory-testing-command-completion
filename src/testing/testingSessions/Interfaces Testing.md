# Session 03: Interfaces and Command Comlpetion
## Info
- Test name: Interfaces and Command Completion
- Date: 05/05/2026
- Tester: Mila Jovic
- Duration: 30min
- OS: Windows 11

## Charter
> Testing the creation of interfaces, classes that implement them and their behavior. 
## Scope of testing
- Interface creation using '.' or '..'.
- Creating classes that implement this interface using '.'.
- Implementation of interface methods and their behavior in different scenarios.
## Session flow
1. Created an Interface called Vehicle using '.' or '..' in the Main.java file.
2. Created classes that implement this interface.
3. Added some methods inside the interface.
4. Tested the implementation of interface methods inside classes.

----

## Notes during testing
- [12:10] If the name of an interface that does not exist is typed in Main.java,
Command Completion offers the option to create it. This is how the Vehicle interface was created.
- [12:10] Typing '.' or '..' next to an interface name offers the option to implement the interface.
This is how class Bike was created.
- [12:12] A method called changeGear was made in this interface. Typing '..' next to the method name offered
the option to implement it inside all classes that implement the Vehicle interface.
- [12:14] Another class that implements Vehicle interface was created and name VehicleImpl.
Using '.' and Rename, the class was renamed to Bicycle.
- [12:17] Typing '.' next to the name of a class that implements an interface offers the option to implement the interface methods.
- [12:19] When fields are added inside a class without an access modifier, typing '.' or '..' after the field type offers the option
to change the access modifier and shows the available options.
- [12:21] A constructor was added to the Bike class.
- [12:23] A method was added to the Bike class, and marked as default using '.'.
- [12:26] If a method has an implementation inside the interface, '.' offers the option to mark it as private.
- [12:27] If a method inside an interface is marked as private or default, typing '.' or '..' at the end of the method name does not offer the option to
implement it in classes that implement the interface.
- [12:29] If a method in the interface is modified by adding a new parameter, '.' and '..' only offer to implement the updated method inside the implementing classes,
but do not offer to update the method signature in those classes.
- [12:31] Typing '.' or '..' next to the same modified method inside an implementing class also does not offer the otpion to add only the missing parameter.
- [12:36] In the Bike class, the @override annotation was removed from the speedUp method, which now has a different signature in the interface. This resolved the exisiting issue via a quick-fix, offered by typing '.' next to the annotation.
- [12:40] An object of type Bike was created in Main.java. The Bike class was imported into the Main file using '.'.

--------

## Results of testing

### Expected result
> An interface and classes that implement it are created successfully.
> Interface methods are successfully added and implemented inside the classes.
> Methods marked as private or default inside the interface are not offered for override in the implementing classes.
### Results obtained
> All expected behavior was confirmed. Command Completion successfully supported the creation of intreface, classes that implement it and the implementation of interface methods.
> Methods marked as private or default inside the interface were not offered for implementation in the implementing classes.
### Unexpected behavior
> When a new parameter is added to an existing interface method, Command Completion does not offer to update the method signature
> in the implementing class, only to implement the updated version. The same applies when typing '.' or '..' next to the same method inside the implementing class, adding only
> missing parameters is not offered.
### Questions
> Is it expected that Command Completion does not offer to update the method signature inside the implementing class? 