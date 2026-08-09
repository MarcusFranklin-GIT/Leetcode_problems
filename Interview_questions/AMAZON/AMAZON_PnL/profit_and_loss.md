# Maximum Number of Loss-Making Groups

## Problem Statement

A company records its monthly profit and loss in an integer array `revenue`, where:

- A **positive** integer represents a month's profit.
- A **negative** integer represents a month's loss.

For taxation purposes, the company wants to divide the revenue data into exactly **K contiguous groups** (subarrays).

A group is considered a **Loss Group** if the **sum of all its elements is negative**.

Your task is to determine the **maximum number of Loss Groups** that can be obtained after splitting the array into exactly `K` non-empty contiguous groups.

---

## Input

- An integer array `revenue` of length `N`.
- An integer `K`.

---

## Output

Return the **maximum number of groups whose sum is negative** after partitioning the array into exactly `K` contiguous groups.

---

## Constraints

- `1 <= N <= 300`
- `1 <= K <= N`
- `-10^5 <= revenue[i] <= 10^5`

---

## Notes

- Every group must contain **at least one element**.
- Groups must be **contiguous**.
- Every element must belong to **exactly one group**.
- The objective is **not** to maximize the total loss, but to maximize the **count of groups having a negative sum**.

---

## Example 1

### Input

```text
revenue = [2, -5, 1, -4, 3]
K = 3
```

### One Optimal Partition

```text
[2, -5] | [1, -4] | [3]

Group Sums:
-3
-3
3
```

### Output

```text
2
```

### Explanation

The first two groups have negative sums.

Maximum Loss Groups = **2**

---

## Example 2

### Input

```text
revenue = [-3, 2, -2, 5, -4]
K = 2
```

### One Optimal Partition

```text
[-3, 2, -2] | [5, -4]

Group Sums:
-3
1
```

### Output

```text
1
```

### Explanation

Only one group has a negative sum.

---

## Example 3

### Input

```text
revenue = [-1, -2, -3, -4]
K = 2
```

### One Optimal Partition

```text
[-1, -2] | [-3, -4]

Group Sums:
-3
-7
```

### Output

```text
2
```

### Explanation

Both groups have negative sums.

---

## Example 4

### Input

```text
revenue = [4, 5, -2, 1]
K = 2
```

### One Optimal Partition

```text
[4] | [5, -2, 1]

Group Sums:
4
4
```

### Output

```text
0
```

### Explanation

No partition can produce a negative-sum group.

---

## Example 5

### Input

```text
revenue = [-5, 6, -3, -2, 4]
K = 3
```

### One Optimal Partition

```text
[-5] | [6, -3, -2] | [4]

Group Sums:
-5
1
4
```

### Output

```text
1
```

### Explanation

Only the first group has a negative sum.

No partition into exactly three groups can produce more than one loss group.

---

# Approach

This is a classic **Partition Dynamic Programming** problem.

Let

```text
dp(i, k)
```

represent the **maximum number of negative-sum groups** that can be formed using the subarray starting from index `i` with exactly `k` groups remaining.

For every possible ending index of the current group:

1. Compute the group's sum.
2. If the sum is negative, contribute `1`.
3. Recursively solve the remaining array with `k - 1` groups.
4. Take the maximum over all possible partitions.

---

# DP State

```text
dp(index, groupsLeft)
```

where

- `index` = starting index of the current group.
- `groupsLeft` = number of groups still to be formed.

---

# Transition

For every valid ending index:

```text
currentSum = sum(index ... end)

gain = (currentSum < 0) ? 1 : 0

answer = max(
    answer,
    gain + dp(end + 1, groupsLeft - 1)
)
```

---

# Base Cases

- If `groupsLeft == 0`
  - Return `0` if all elements are used.
  - Otherwise, the partition is invalid.

- If no elements remain but groups are still required,
  return an invalid state.

---

# Complexity

Using prefix sums and memoization:

- **Time Complexity:** `O(N² × K)`
- **Space Complexity:** `O(N × K)`

---

# Tags

- Dynamic Programming
- Partition DP
- Memoization
- Prefix Sum
- Amazon OA
```