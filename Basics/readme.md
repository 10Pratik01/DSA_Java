<h1 align="center">🧩 String & Integer Operations - Method Overloading</h1> <p align="center"> A program that demonstrates <b>method overloading</b> by performing different operations on strings and integers. Learn to handle mixed input types, recursion, and type-specific operations in Python! </p>
<h2>🚀 Features</h2> <ul> <li>🔢 <strong>Integer Operations:</strong> Prime check, even/odd check, factorial for numbers less than 10</li> <li>🔤 <strong>String Operations:</strong> Length check (even/odd), palindrome detection</li> <li>⚡ <strong>Method Overloading:</strong> Different functions for strings and integers</li> <li>📥 <strong>Mixed Inputs:</strong> Process arrays containing both integers and strings</li> <li>🧠 <strong>Recursive Computation:</strong> Factorial calculation using recursion</li> </ul>
<h2>📋 Problem Description</h2>

You are tasked with creating a program that processes a list of inputs, where each input can either be an integer or a string.
The program should automatically choose the correct operation based on the type of input.

<h2>🔢 Operations on Integer Input</h2> 1. **Prime Check** Determine if the number is a **prime**. *Example:* `5` → prime, `6` → not prime

Even or Odd Check
Determine if the number is even or odd.
Example: 4 → even, 7 → odd

Factorial (if < 10)
Compute the factorial recursively if the number is less than 10.
Example: factorial(5) = 120

<h2>🔤 Operations on String Input</h2> 1. **Length Check** Determine if the number of letters in the string is **even** or **odd**. *Example:* `"hello"` → odd, `"even"` → even

Palindrome Check
Check if the string is a palindrome (reads the same forward and backward).
Example: "madam" → palindrome, "hello" → not palindrome

<h2>💻 Input Format</h2> * An array of **mixed inputs**: integers and strings. * The program should process each input according to its type.
<h2>📤 Output Format</h2> * For each input: * **Integer**: * Prime or not * Even or odd * Factorial (if < 10) * **String**: * Length even/odd * Palindrome check
<h2>📝 Function Signature</h2> ```python from typing import List, Union

def process_input(inputs: List[Union[int, str]]) -> None:
pass


*Optional helper functions for method overloading:*
```python
def process_integer(n: int) -> None:
    pass

def process_string(s: str) -> None:
    pass

<h2>📌 Examples</h2>

Example 1:

inputs = [5, "madam", 8, "hello", 9]
process_input(inputs)


Output:

5 is a prime number
5 is odd
Factorial of 5 is 120

madam has odd number of letters
madam is a palindrome

8 is even
8 is not prime
Factorial of 8 is 40320

hello has even number of letters
hello is not a palindrome

9 is odd
9 is not prime
Factorial of 9 is 362880


Example 2:

inputs = [3, "even", 7, "racecar", 2]
process_input(inputs)


Output:

3 is a prime number
3 is odd
Factorial of 3 is 6

even has even number of letters
even is not a palindrome

7 is a prime number
7 is odd
Factorial of 7 is 5040

racecar has odd number of letters
racecar is a palindrome

2 is a prime number
2 is even

<h2>⚖️ Constraints</h2> * 1 <= `len(inputs)` <= 100 * 1 <= integers <= 10^6 * Factorial computation: only for numbers less than 10 * Strings contain only alphabetical characters (no spaces or punctuation)
<h2>💡 Notes</h2> * Implement **method overloading** to handle different operations for strings and integers. * Use **recursion** for factorial computation. * Ensure proper type checking and clear output formatting.
<h2>🌟 Tips</h2> * Separate logic for integer and string operations into helper functions. * Optimize prime checking for numbers up to 10^6. * For palindrome check, ignore case differences.