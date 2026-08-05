# Maximum Sum of Subarray with At Most `K` Length

## Problem Statement

Given an integer array `nums` containing both positive and negative numbers and an integer `k`, find the **maximum possible sum** of any **contiguous subarray** whose length is **at most `k`**.

A valid subarray can have any length from **1** to **k**.

Return the maximum subarray sum.

---

## Examples

### Example 1

**Input**

```text
nums = [1, -2, 3, 4, -5, 6]
k = 3
```

**Output**

```text
7
```

**Explanation**

Possible subarrays of length at most 3:

```text
[1]                 = 1
[1, -2]             = -1
[1, -2, 3]          = 2

[-2]                = -2
[-2, 3]             = 1
[-2, 3, 4]          = 5

[3]                 = 3
[3, 4]              = 7   ← Maximum
[3, 4, -5]          = 2

[4]                 = 4
[4, -5]             = -1
[4, -5, 6]          = 5

[-5]                = -5
[-5, 6]             = 1

[6]                 = 6
```

Hence, the answer is:

```text
7
```

---

### Example 2

**Input**

```text
nums = [-5, -2, -8, -1]
k = 2
```

**Output**

```text
-1
```

**Explanation**

All possible subarrays of length at most 2:

```text
[-5]      = -5
[-5,-2]   = -7
[-2]      = -2
[-2,-8]   = -10
[-8]      = -8
[-8,-1]   = -9
[-1]      = -1   ← Maximum
```

---

### Example 3

**Input**

```text
nums = [2, -1, 2, 3, -4]
k = 2
```

**Output**

```text
5
```

**Explanation**

Valid subarrays:

```text
[2]        = 2
[2,-1]     = 1

[-1]       = -1
[-1,2]     = 1

[2]        = 2
[2,3]      = 5   ← Maximum

[3]        = 3
[3,-4]     = -1

[-4]       = -4
```

---

### Example 4

**Input**

```text
nums = [4, -1, 2, 1]
k = 4
```

**Output**

```text
6
```

**Explanation**

Since `k = 4`, every subarray is allowed.

The maximum sum subarray is

```text
[4, -1, 2, 1]
```

whose sum is

```text
4 + (-1) + 2 + 1 = 6
```

---

## Constraints

```text
1 <= nums.length <= 100000
1 <= k <= nums.length

-100000 <= nums[i] <= 100000
```

---

## Expected Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## Hint

Instead of calculating every subarray, use:

- Prefix Sum
- Monotonic Deque

Maintain the **minimum prefix sum** within the last `k` indices.

For every position `i`:

```text
Maximum Sum Ending at i
=
Current Prefix Sum
-
Minimum Prefix Sum in the Previous k Positions
```

This allows the answer to be computed in linear time.

---

## Follow-up

Can you solve this in **O(n)** time using a **Prefix Sum + Monotonic Deque**?