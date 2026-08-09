# Sales by Match

## Problem Statement

There is a large pile of socks that must be paired by color.

Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

---

## Function Signature

```java
int sockMerchant(int n, int[] ar)
```

- **Input**
  - `n` : Number of socks.
  - `ar` : Array representing the color of each sock.

- **Output**
  - Returns the total number of matching pairs.

---

## Input Format

- The first line contains an integer **n**, the number of socks.
- The second line contains **n** space-separated integers representing the colors of the socks.

---

## Constraints

- `1 ≤ n ≤ 100`
- `1 ≤ ar[i] ≤ 100`

---

## Examples

### Example 1

#### Input

```text
9
10 20 20 10 10 30 50 10 20
```

#### Output

```text
3
```

#### Explanation

| Color | Count | Pairs |
|------:|------:|------:|
| 10 | 4 | 2 |
| 20 | 3 | 1 |
| 30 | 1 | 0 |
| 50 | 1 | 0 |

Total pairs = **2 + 1 = 3**

---

### Example 2 (All Unique)

#### Input

```text
5
1 2 3 4 5
```

#### Output

```text
0
```

#### Explanation

Every sock has a different color, so no pairs can be formed.

---

### Example 3 (All Identical)

#### Input

```text
6
10 10 10 10 10 10
```

#### Output

```text
3
```

#### Explanation

There are six socks of the same color.

Number of pairs:

```
6 / 2 = 3
```

---

### Example 4

#### Input

```text
7
1 2 1 2 1 3 2
```

#### Output

```text
2
```

#### Explanation

Frequency of each color:

| Color | Count | Pairs |
|------:|------:|------:|
| 1 | 3 | 1 |
| 2 | 3 | 1 |
| 3 | 1 | 0 |

Total pairs = **2**

---

# Approach

## Key Observation

A pair is formed by **two socks of the same color**.

For every color:

```
pairs = frequency / 2
```

(using integer division)

The final answer is the sum of pairs for every distinct color.

---

## Algorithm

1. Count the frequency of every sock color using a HashMap (or frequency array).
2. For each color:
   - Compute `frequency / 2`.
   - Add it to the answer.
3. Return the total number of pairs.

---

## Time Complexity

```
O(n)
```

Each sock is processed once.

---

## Space Complexity

```
O(k)
```

where `k` is the number of distinct sock colors.

Using the given constraints (`ar[i] ≤ 100`), a frequency array of size `101` can also be used, resulting in **O(1)** auxiliary space.