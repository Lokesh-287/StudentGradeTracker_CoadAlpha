# Student Grade Tracker

### Author Information
- **Name**: Lokesh Krishna R
- **Company**: CodeAlpha
- **ID**: CA/O3/42169
- **Domain**: Java Programming
- **Duration**: October 1 to 30

---

## Table of Contents
- [Features](#features)
- [How to Run](#how-to-run)
- [Code Explanation](#code-explanation)
- [Example Output](#example-output)
- [Contributing](#contributing)
- [License](#license)

## Features

- Accepts the number of students as input.
- Takes individual student marks and ensures that the input is valid (non-negative).
- Calculates the following statistics:
  - Average score
  - Highest score
  - Lowest score
- Provides a summary of the grade statistics.

## How to Run

1. Make sure you have Java installed on your machine. You can verify this by typing `java -version` in your terminal.
2. Clone this repository or download the source code.
3. Compile the program using the following command:
   ```bash
   javac StudentGradeTracker.java
   ```
4. Run the program using:
   ```bash
   java StudentGradeTracker
   ```

## Code Explanation

The program consists of several main components:

### 1. User Input
The program prompts the user to enter the number of students and then asks for each student's mark. If the mark is invalid (less than 0), it prompts the user again.

```java
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of Student:");
int NumOfStudent = in.nextInt();
```

### 2. Validation
Each student's mark is validated to ensure it is a non-negative value.

```java
while (true) {
    int inputgrade = in.nextInt();
    if (inputgrade >= 0) {
        grade[i] = inputgrade;
        break;
    } else {
        System.out.println("Please enter a valid mark.");
    }
}
```

### 3. Calculations
The program has three main functions:
- **`Average`**: Computes the average score of all students.
- **`high`**: Determines the highest score among the students.
- **`low`**: Determines the lowest score among the students.

```java
private static double Average(int[] grade) { ... }
private static int high(int[] grade) { ... }
private static int low(int[] grade) { ... }
```

### 4. Output
Finally, the program displays the grade statistics: average, highest, and lowest scores.

```java
System.out.printf("Average Score: %.2f\n", avg);
System.out.println("Highest Score: " + high);
System.out.println("Lowest Score: " + low);
```

## Example Output

```
Enter the number of Student:
3
Enter the Mark of Student 1 :
85
Enter the Mark of Student 2 :
90
Enter the Mark of Student 3 :
78

Grade Statistics:
Average Score  : 84.33
Highest Score  : 90
Lowest Score   : 78
```

## Contributing

If you'd like to contribute to this project, feel free to submit a pull request or open an issue.

## License

This project is open-source and available under the [MIT License](LICENSE).
```

This updated `README.md` now includes your author information at the top.
