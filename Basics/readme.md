# String and Integer Operations (Method Overloading)

## Problem Statement

You are given a list of mixed inputs, where each input is either an integer or a string. Perform the following operations depending on the type of input:

### For Integer Inputs:

1. Check if the number is **prime**.
2. Check if the number is **even** or **odd**.
3. Compute the **factorial** of the number.

### For String Inputs:

1. Determine the **length** of the string.
2. Check if the string is a **palindrome**.
   - Strings with **even length** are considered for palindrome check.
   - Strings with odd length are considered **not palindrome**.

**You must implement the program using method overloading to differentiate between string and integer operations.**

---

## Input Format

- The first line contains an integer `n` — the number of inputs.  
- The next `n` lines contain either a string or an integer.  

---

## Output Format

- **Integer Input:**
```text
[number] is valid number
Is the number prime ? [Yes/No]
Is number odd or even? The number is = [Odd/Even]
Factorial of number = [factorial]
```
- **String Input:**
```text
[string] is a valid String
The length of the string is : [length]
String is a Palindrome / String is not in palindrome
```

## Constraints

- `1 <= n <= 100` (number of inputs)
- `1 <= integer input <= 10^6`
- Strings contain **alphabetical characters only** (no spaces or punctuation)
- Factorial computation is valid for any integer input


## Examples

| Input | Output |
|-------|--------|
| 5<br>5<br>madam<br>8<br>hello<br>9 | 5 is valid number<br>Is the number prime ? Yes<br>Is number odd or even? The number is = Odd<br>Factorial of number = 120<br><br>madam is a valid String<br>The length of the string is : 5<br>String is not in palindrome<br><br>8 is valid number<br>Is the number prime ? No<br>Is number odd or even? The number is = Even<br>Factorial of number = 40320<br><br>hello is a valid String<br>The length of the string is : 5<br>String is not in palindrome<br><br>9 is valid number<br>Is the number prime ? No<br>Is number odd or even? The number is = Odd<br>Factorial of number = 362880 |
| 3<br>3<br>even<br>racecar | 3 is valid number<br>Is the number prime ? Yes<br>Is number odd or even? The number is = Odd<br>Factorial of number = 6<br><br>even is a valid String<br>The length of the string is : 4<br>String is not in palindrome<br><br>racecar is a valid String<br>The length of the string is : 7<br>String is not in palindrome |
