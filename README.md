# HackerRank 3rd Semester Problem-Solving Portfolio

## 1. HackerRank Profile

**Public HackerRank Profile:**  
[View my HackerRank Profile](https://www.hackerrank.com/profile/chiranthtv2007)

## 2. Repository Description

This repository contains five HackerRank problem-solving solutions implemented in Java. The solutions demonstrate fundamental programming concepts, problem-solving techniques, Java collections, conditional logic, array manipulation, string processing, and frequency counting. All five solutions were successfully accepted on HackerRank.

## 3. Accepted HackerRank Submissions

| No. | Problem | Status | Solution |
|---|---|---|---|
| 1 | Diagonal Difference | **Accepted** | [View Solution](./01-Diagonal-Difference/solution.java) |
| 2 | Dynamic Array | **Accepted** | [View Solution](./02-Dynamic-Array/solution.java) |
| 3 | Time Conversion | **Accepted** | [View Solution](./03-Time-Conversion/solution.java) |
| 4 | Compare the Triplets | **Accepted** | [View Solution](./04-Compare-the-Triplets/solution.java) |
| 5 | Sparse Arrays | **Accepted** | [View Solution](./05-Sparse-Arrays/solution.java) |

### Accepted Submission Evidence

#### Diagonal Difference — Accepted

**Screenshot of Accepted HackerRank submission:**

<img width="1535" height="912" alt="01_Diagonal_Difference_Accepted" src="https://github.com/user-attachments/assets/595641bc-0505-44f3-8bd2-b73a05d89d3d" />

#### Dynamic Array — Accepted

**Screenshot of Accepted HackerRank submission:**

<img width="1535" height="912" alt="02_Dynamic_Array_Accepted" src="https://github.com/user-attachments/assets/b1e7bdfb-fe53-4de0-9dfc-6dfe871182f1" />

#### Time Conversion — Accepted

**Screenshot of Accepted HackerRank submission:**

<img width="1535" height="907" alt="03_Time_Conversion_Accepted" src="https://github.com/user-attachments/assets/f00a87c6-48c5-4026-afca-69534cb9dd7c" />

#### Compare the Triplets — Accepted

**Screenshot of Accepted HackerRank submission:**

<img width="1535" height="910" alt="04_Compare_the_Triplets_Accepted" src="https://github.com/user-attachments/assets/2e644749-a807-4270-93e2-07b63320aca0" />

#### Sparse Arrays — Accepted

**Screenshot of Accepted HackerRank submission:**

<img width="1535" height="910" alt="05_Sparse_Arrays_Accepted" src="https://github.com/user-attachments/assets/b4084e8e-51bd-454a-b2b9-f17c07d720b1" />

## 4. HackerRank Badge Evidence

### Problem Solving Badge

**Screenshot of HackerRank Problem Solving badge:**

<img width="1535" height="909" alt="HackerRank_Problem_Solving_3_Star_Badge" src="https://github.com/user-attachments/assets/7fc0629a-1524-4e25-8bbc-c49ef4812831" />

## 5. Time and Space Complexity

| Problem | Time Complexity | Space Complexity |
|---|---|---|
| Diagonal Difference | O(N) | O(1) |
| Dynamic Array | O(N + Q) | O(N) |
| Time Conversion | O(1) | O(1) |
| Compare the Triplets | O(1) | O(1) |
| Sparse Arrays | O(N + Q) | O(N) |

**N** represents the relevant input size and **Q** represents the number of queries.

## 6. Problem-Solving Approaches

### 1. Diagonal Difference

Traverse the square matrix and calculate the sum of the primary diagonal and secondary diagonal. Return the absolute difference between the two diagonal sums.

### 2. Dynamic Array

Create `n` empty sequences and process each query. The required sequence is selected using `(x ^ lastAnswer) % n`. Type 1 queries add values to the selected sequence, while Type 2 queries retrieve a value and update `lastAnswer`.

### 3. Time Conversion

Extract the hour and AM/PM period from the given time. Handle the special cases of 12 AM and 12 PM, and convert the time into 24-hour format.

### 4. Compare the Triplets

Compare Alice's and Bob's three ratings element by element. A point is added to the participant with the higher rating. Equal ratings do not add a point.

### 5. Sparse Arrays

Use a `HashMap` to store the frequency of each string in the input list. Each query is then looked up in the map to obtain its occurrence count.
