# Session 04: Read-only files
## Info
- Test name: Read-only files
- Date: 05/05/2026
- Tester: Mila Jovic
- Duration: 20min
- OS: Windows 11

## Charter
> Testing the Command Completion functionality on read-only files.
## Scope of testing
- How Command Completion works in user-created files that are subsequently set to read-only.
- How does Command Completion works with read-only files such as external library sources.
## Session flow
1. I created one file called PersonReadOnly.java and set it to be read-only.
2. I tested Command Completion in this file using '.' and  '..'.
3. Opened a String class, which is read-only by default.
4. Tested '.' and '..' inside the String class.

----

## Notes during testing
- [14:50] I created a class called PersonReadOnly.
- [14:51] Set the class as read-only using the lock icon in the bottom right corner.
- [14:57] Attempted to type '.' or '..' anywhere in the code. Each time, a pop-up appeared asking
whether to remove read-only status or not.
- [15:04] Opened the String class, which is read-only by default.
- [15:05] No suggestions are provided next to the package declaration at the top of the file.
- [15:06] Typing '.'  in the import section only suggests "Go to declaration"
- [15:10] Typing '.' next to a method name only suggests "Show Usages" and "Copy Reference". No suggestions that 
modify the code appeared.
- [15:10] Typing '.' next to a method name suggests "Show Usage" and "Copy Reference", while typing ".." in the same place
provides no suggestions. Typing a third dot "..." gives the same suggestions as ".", and the fourth dot "...." gives the same as
"..". After a certain number of dots, no more dots can be added and Command Completion closes.

----

## Results of testing

### Expected result
> Only actions that do not modify the code are suggested.
### Results obtained
> Only actions that do not modify the code are suggested.
### Unexpected behavior
> Command Completion does not activate in user-created files that have been set to read-only, even though
> the "Enable command completion for read-only files " option is enabled in Settings.
> Command Completion only works in files that are read-only by default (e.g. String class).
### Questions
1. Is "Enable Command Completion for read-only" files supposed to work only for files that are read-only by
default?
2. Is the behavior of alternating suggestions with each additional
   dot (., .., ..., ....) intentional?