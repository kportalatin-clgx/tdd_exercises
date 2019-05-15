# Kata String Calculator

 The following is a TDD Kata - an exercise in coding, refactoring and test-first, that you should apply daily for at least 15 minutes (I do 30).

 Before you start: 

  * Try not to read ahead.
  * Do one task at a time. The trick is to learn to work incrementally.
  * Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata

### Requirements

 1. Create a simple String calculator with following method:
 
    ```int add(string numbers)```

  *  The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example “” or    “1” or “1,2”

  * Start with the simplest test case of an empty string and move to 1 and two numbers

  * Remember to solve things as simply as possible so that you force yourself to write tests you did not think about

  * Remember to refactor after each passing test

 2. Allow ```add()``` to handle an unknown amount of numbers

 3. Allow ```add()``` to handle new lines between numbers (instead of commas), where:

    * input ok: ```1\n2,3``` (equals 6)

    * input NOT ok: ```1,\n``` (no need to prove it - just clarifying)

 4. Allow ```add()``` to support different delimiters:
  
    * To change delimiter, String contains a separate line: 
        
        ```//[delimiter]\n[numbers…]``` or ```//;\n1;2``` 
        
       Should return 3 when default delimiter is ```;```.

    * Make first line optional and all scenarios still supported.

    * Call ```add()``` with negative number. Result throws exception “Negatives not allowed” and the negative number passed.  If multiple negatives, show all in Exception message.

 ---
Stop here if you are a beginner. Continue if proceeding steps completed in < 30 minutes.
 ---

Implement ```add()``` as follows:

   * Ignore numbers > 1000, so that 2 + 1001  = 2 

   * Allow delimiters of any length with the following format:  
   
    ```//[delimiter]\n``` or ```//[***]\n1***2***3 (returns 6)```
    
   * Allow multiple delimiters as follows: 
   
   ```//[delim1][delim2]\n``` or ```//[*][%]\n1*2%3 (returns 6)```

   * Handle multiple delimiters with lengths longer than one char
