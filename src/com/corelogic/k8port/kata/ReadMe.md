# Kata String Calculator

 The following is a TDD Kata - an exercise in coding, refactoring and test-first, that you should apply daily for at least 15 minutes (I do 30).

 Before you start: 

  * Try not to read ahead.
  * Do one task at a time. The trick is to learn to work incrementally.
  * Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata

### Requirements

 1. Create a simple String calculator with following method:
 
    ```int add(string numbers)```
    
    * Accept 0, 1 or 2 numbers, and return sum (empty string returns 0, e.g. “” or “1” or “1,2”)
    * Start with simplest test case of empty string and progress to 1 and 2 numbers 
    * Solve as simply as possible so as to force yourself think differently and write more efficient tests
    * Refactor after each passing requirement

 2. Allow ```add()``` to handle an unknown amount of numbers

 3. Allow ```add()``` to handle new lines instead of commas between numbers so that:

    * input ok - ```1\n2,3 (equals 6)```

    * input NOT ok - ```1,\n (no need to prove - just clarifying)```

 4. Allow ```add()``` to support different delimiters so that:
  
    * To change delimiter, String contains a separate line 
        
        ```//[delimiter]\n[numbers…]``` or ```//;\n1;2``` 
        
       and returns 3 when default delimiter is ```;```

    * First line is optional and all preceding scenarios still supported

    * ```add()``` can be called with a negative number _n_, but throws following exception: 
      
      ```Negatives not allowed:  n```  
     
      If multiple negatives passed, show all in Exception message

 ---
Stop here if you are a beginner.  Continue if proceeding steps completed in < 30 minutes.
 ---

Implement ```add()``` as follows:

   * Ignore numbers > 1000, so that 2 + 1001  = 2 

   * Allow delimiters of any length with the following format:  
   
     ```//[delimiter]\n``` or ```//[***]\n1***2***3 (returns 6)```
    
   * Allow multiple delimiters as follows: 
   
     ```//[delim1][delim2]\n``` or ```//[*][%]\n1*2%3 (returns 6)```

   * Handle multiple delimiters with lengths longer than one char
