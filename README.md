# Divide and Conquer Algorithms
Divide and Conquer is an algorithmic paradigm that works in three main steps:

**Divide** – Break a problem into smaller subproblems

**Conquer** – Solve the subproblems recursively

**Combine** – Merge the results to solve the original problem

This technique significantly improves efficiency for many computational problems.

## Algorithms Implemented

### Binary Search

* Searches for an element in a sorted array

* Repeatedly divides the search space in half

* Time Complexity: O(log n)

* Space Complexity: O(log n) (recursive)

### Merge Sort

* Stable sorting algorithm

* Divides array into halves, sorts them recursively, then merges

* Time Complexity: O(n log n)

* Space Complexity: O(n)

### Quick Sort

* Uses pivot partitioning strategy

* Efficient in practice for large datasets

* Average Time Complexity: O(n log n)

* Worst Case: O(n²)

* Space Complexity: O(log n)

##  Test Coverage

The project includes comprehensive JUnit 5 test cases covering:

*  Normal cases

*  Edge cases (empty array, single element)

*  Duplicate values

*  Negative numbers

*  Already sorted arrays

*  Reverse sorted arrays

*  Large input arrays

## How to Run the Project

**1. Clone Repository**

- clone the repo

- cd divide-and-conquer-algorithms

**2. Build Project**

- mvn clean install

**3. Run Tests**

- mvn test

- Or run tests directly using IntelliJ.