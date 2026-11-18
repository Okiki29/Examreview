# OOP Coding Test — Review and Reflection

## 1. My Original Examination Grade

### Task 1 — /40
**My mark:**
10/40

**Why I awarded this mark:**
I awarded this mark because I didn't really finish this part of the code. 
but i was able to complete some parts of the workshop.java by creating the
private fields and also adding constructors.

### Task 2 — /40
**My mark:**
0/40

**Why I awarded this mark:**
I gave this mark because I didn't get to this point of the coding test.
So in the main it ask how many attempts to process and loops that many times,
also reading studentID each time. If the HashSet has reached capacity it prints workshop full
and it prints accepted when id is added.

### Task 3 — /20
**My mark:**
0/20 

**Why I awarded this mark:**
I gave this mark because i didnt get to this point of the coding test.
I added a blank id check in Workshop.java so blackIDs are rejected before touching the HashSet.

**Total self-assessed grade:** /100

10/100
## 2. Corrections and Improvements

Describe two or three important problems you identified
in your original code. Explain what you changed and
why it works now.

I won't say I had to change much because I didn't really do much in the coding test.
In Workshop it has workshopName, its capacity, and a HashSet of registered studentID. its register()
method decides what happens to each attempt: a blank ID is rejected,
an ID already in the set is a duplicate, an ID that arrives once the set has reached capacity
gets “workshop full”, and anything else is accepted and added. Because a HashSet can’t hold the same value twice,
it prevents double registration automatically.

The Main reads the workshop name and capacity with Scanner, then ask how many attempts to process.
It loops that many times, reads an ID each time, and calls register() to show the result.
It counts accepted and rejected attempts as it goes and at the end prints them out.

## 3. Reflection

**What did you understand during the examination
but struggle to implement?** 
I understood how to add constructors and loops but i found hard to really implement in the code
i also didn't really understand the HashSet.

**What was the most important thing you learned
from correcting your code?**
The most important thing i learned is that small mistakes in the order of condition
can give wrong outputs even when the code compiles and runs.

**What would you do differently in your next
coding test?**
What i would do differently is i will have to prepare more for the test and when doing the test
learn to take everything step by step to prevent mistakes.

---

## Review lab assessment and mark recovery

The **review lab** is graded separately out of 20 marks:

| Review criterion | Maximum marks |
|---|---:|
| Original self-assessment and supporting evidence | 4 |
| Explanation of mistakes and Java concepts | 6 |
| Corrections and improvements | 4 |
| Testing and demonstration | 4 |
| Reflection | 2 |
| **TOTAL** | **20** |

You can recover **up to 30% of the marks you lost** in the original examination. The actual amount depends on your review lab grade. Your lecturer's examination grade, **not your self-awarded mark**, is used in the calculation.

**Marks recovered = (100 − original exam mark) × 0.30 × (review lab mark ÷ 20)**

**Revised exam mark = original exam mark + marks recovered**

For example, an original examination mark of 40/100 and a review lab mark of 16/20 would recover 14.4 marks, giving a revised result of **54.4/100**.

The aim is to show that you understand your mistakes and can explain your improvements. Simply copying a working solution does not demonstrate this understanding.

