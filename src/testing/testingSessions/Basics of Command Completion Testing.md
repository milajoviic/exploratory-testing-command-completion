# Session 01: Basics of Command Completion
## Info
- Test name: Basics of Command Completion funcionality
- Date: 05/04/2026
- Tester: Mila Jovic
- Duration: 45min
- OS: Windows 11

## Charter
>Testing the behavior of Command Completion in different 
>code contexts and the relevance of its suggestions.
## Scope of testing
- Activation of Command Completion using '.' and '..'
- Difference in behavior between '.' i '..'
- Suggestions in different code contexts (loops, 
branching, variable declaration, value assigment, null, strings)
## Session flow
1. I created different scenarios in the Main.java file
2. Testing '.' and '..' on:
   1. Variable declarations of different types.
   2. Loops
   3. If and if-else statements
   4. Switch statements
3. Exploring available functionalities and suggestions

----

## Notes during testing
- [15:18] Created a String variable.
- [15:19] Commmand Completion suggests adding a semicolon if one is missing. This applies to both '.' and '..'.
- [15:20] Command Completion suggests variable initialization when '..' is used, but not when '.' is used.
- [15:21] Declared an int variable x.
- [15:23] Command Completion suggests merging variable declaration and value assigment when they are on separate lines.
- [15:24] Created a for loop.
- [15:26] Command Completion does not complete the code inside the loop's parentheses before it is fully typed. However, once the 
parentheses are complete, it suggests reversing the loop direction and changing int to var.
- [15:26] Command Completion does not suggest adding curly braces {}.
- [15:33] If an if-statement contains only one statement in its body, Command Completion suggests removing the curly braces {}.
- [15:34] Command Completion offers the option to quickly wrap a section of code inside a loop or an if(-else) statement.
- [15:36] Typing '.' or '..' inside a String literal does not trigger Command Completion.
- [15:38] If a variable is assigned a value of the wrong type, typing '..' okaces quick-fixes at the top of the list, such as changing the 
variable type or casting.
- [15:41] If the condition of a while loop is not a boolean value, '.' suggests changing the value's type to boolean.
- [15:44] Command Completion is not triggered inside comments.
- [15:45] Inside a switch statement, Command Completion suggests adding a default branch
- [15:46] Typing '.' or '..' above the main class causes an error.
- [15:47] Adding '.' or '..' at the end of an import statement does nothing. No library suggestions are provided.
- [15:48] Typing '.' or '..' inside a class body, above the main method suggests adding class members such as a constructor or toString() method.
- [15:50] Selecting "Optimize Imports" through Command Completion removes all unused imports.
- [15:51] Inside a switch statement, Command Completion suggests adding 'case 10' for the variable 'u', because 'u' was previously assigned the value 10
inside a do-while loop.
- [15:53] If a String variable 's' is assigned null and '.' or '..' is typed on the next line after 's', Command Completion does not suggest adding a null check.
- [15:54] If printing a String whose value is null, '..' suggests explaining the existing warning.
- [15:56] If two if-statements exist, Command Completion suggests merging them.
- [15:57] If '..' is typed and the cursor is moved between the dots, so it reads '.|.', the suggestions change from the expected '..' output to the suggestions expected from a single '.'.
- [15:40] If an expression contains two variables and one of them does not exist, typing '.' suggests creating local variable to make the expression valid. 
- [15:45] Typing '.' or '..' next to '=' does not suggest converting it to '+=' or "-=", unlike inequality operators where Command Completion suggests changing to '>','<','>=','<='.

--------

## Results of testing

### Expected result
> Command Completion is activated using '.' and '..' in standard code contexts.
> Command Completion is not triggered inside string literals or comments.
### Results obtained
> Command Completion was successfully activated using '.' and '..' in all tested code contexts.
> Command Completion was not triggered inside string literals or comments, as expected.
> Context-aware suggestions were confirmed. For example, adding a default branch in switch statements, merging two if-statements 
> and suggesting case values based on previously assigned variables.
### Unexpected behavior
> Command Completion does not suggest a null check for a variable explicitly assigned null, 
> even though this is a clear potential issue.
### Questions
1. Should '..' suggest adding {} when a loop or if-statement has none?
2. Is the absence of a null check suggestion intentional?
3. Why doesn't Command Completion suggest converting '=' to '+=' or '-='?