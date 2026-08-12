# Subarrays Containing the Most Frequent Element

**Company:** Workday — Online Assessment / Round 1

## Problem Statement

You are given a list of `n` integers.

1. Find the frequency of every distinct number in the list.
2. Determine the **most frequent number**:
   - If a single number has the highest frequency, that number is the answer.
   - If multiple numbers tie for the highest frequency, the **larger number** among them is chosen.
3. Count the number of subarrays that contain **at least one occurrence** of this most frequent number.

## Input Format

```
n            - size of the list
arr[0..n-1]  - list of integers
```

## Output Format

```
A single integer - the number of subarrays containing at least one occurrence
                    of the most frequent number
```

## Constraints

```
1 <= n <= 10^5
1 <= arr[i] <= 10^9
```

## Sample Test Case 1

**Input**
```
n = 10
arr = [6, 3, 6, 8, 3, 6, 8, 3, 6, 8]
```

**Explanation**
```
Frequency: 6 -> 4, 3 -> 3, 8 -> 3
Most frequent number = 6 (highest frequency, no tie)
```

**Output**
```
47
```

## Sample Test Case 2

**Input**
```
n = 11
arr = [9, 9, 4, 4, 9, 4, 9, 4, 9, 4, 9]
```

**Explanation**
```
Frequency: 9 -> 6, 4 -> 5
Most frequent number = 9 (highest frequency, no tie)
```

**Output**
```
60
```

## Sample Test Case 3

**Input**
```
n = 11
arr = [2, 5, 5, 2, 7, 7, 2, 5, 7, 2, 5]
```

**Explanation**
```
Frequency: 2 -> 4, 5 -> 4, 7 -> 3
Tie between 2 and 5 (both frequency 4) -> larger number 5 is chosen
Most frequent number = 5
```

**Output**
```
52
```