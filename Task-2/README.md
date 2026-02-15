# 🎓 Student Grade Calculator (Java)

A simple yet smart Java-based console application that calculates a student’s academic performance based on subject marks.
This project takes marks as input, computes total and percentage, assigns grades, and displays performance insights.

---

## 📌 Features

* Accepts marks for multiple subjects (out of 100)
* Calculates:

  * Total marks
  * Average percentage
* Generates:

  * Grade (A+, A, B, C, D, F)
  * Performance remark
  * Pass/Fail status
  * Division (Distinction / First Class / Second Class / Third Class)
* Input validation (0–100 marks only)
* Option to evaluate multiple students

---

## 🛠 Technologies Used

* Java
* Scanner class for input handling
* Conditional logic & ternary operators

---

## 📂 Project Structure

```
StudentGradeCalculator/
 ├── src/
 │    └── in/codesoft/tasks/
 │           └── StudentGradeCalculator.java
 ├── README.md
```

---

## ▶️ How to Run

1. Open project in Eclipse / VS Code / IntelliJ
2. Compile the program:

   ```
   javac StudentGradeCalculator.java
   ```
3. Run the program:

   ```
   java StudentGradeCalculator
   ```

---

## 💻 Sample Output

```
Enter number of subjects: 3
Enter marks for subject 1: 78
Enter marks for subject 2: 85
Enter marks for subject 3: 69

========== RESULT ==========
Total Marks        : 232
Average Percentage : 77.33%
Grade              : A
Remark             : Very Good
Status             : PASS
Division           : Distinction
```

---

## 🧠 Grade Criteria

| Percentage | Grade |
| ---------- | ----- |
| 90+        | A+    |
| 80–89      | A     |
| 70–79      | B     |
| 60–69      | C     |
| 50–59      | D     |
| Below 50   | F     |

---

## 📈 Performance Remark Logic

* 85%+ → Excellent Performance
* 70–84% → Very Good
* 55–69% → Good
* 40–54% → Needs Improvement
* Below 40 → Poor

---

## 🎯 Purpose of Project

This project was developed as part of an internship task to demonstrate:

* Java programming fundamentals
* User input handling
* Conditional logic
* Clean and structured result presentation

---

## 👨‍💻 Author

**Mahesh**
MCA Student
Java & SQL Learner
