# Mandragora Forest

## Problem Statement

Garnet must travel through a forest filled with dangerous mandragoras.

Initially,

- Health (`S`) = **1**
- Experience (`P`) = **0**

For every mandragora, Garnet has two choices:

1. **Eat the mandragora**
   - Health increases by **1**
   - The mandragora disappears.
   - No experience is gained.

2. **Battle the mandragora**
   - Experience gained = **Current Health × Mandragora Health**
   - The mandragora disappears.

Each mandragora can only be used once (either eaten or battled).

Your task is to determine the **maximum experience points** Garnet can obtain.

---

## Function Signature

```java
long mandragora(List<Integer> H)
```

- **Input:** List of mandragora health values.
- **Output:** Maximum experience that can be earned.

---

## Input Format

- First line contains an integer **T**, the number of test cases.

For each test case:

- First line contains an integer **N**, the number of mandragoras.
- Second line contains **N** space-separated integers representing their health values.

---

## Constraints

- `1 ≤ T ≤ 100`
- `1 ≤ N ≤ 10^5`
- `1 ≤ H[i] ≤ 10^7`
- Sum of `N` over all test cases does not exceed `10^5`

---

## Examples

### Example 1

#### Input

```text
1
3
3 2 2
```

#### Output

```text
10
```

#### Explanation

Initial Health = 1

- Eat 2 → Health = 2
- Battle 3 → Experience = 2 × 3 = 6
- Battle 2 → Experience = 2 × 2 = 4

Total Experience = **10**

---

### Example 2

#### Input

```text
1
4
1 2 3 4
```

#### Output

```text
18
```

#### Explanation

Sort the health values:

`[1, 2, 3, 4]`

- Eat 1 → Health = 2
- Battle 2, 3, 4

Experience

= 2 × (2 + 3 + 4)

= **18**

---

### Example 3

#### Input

```text
1
5
5 5 5 5 5
```

#### Output

```text
40
```

#### Explanation

Best strategy:

- Eat one mandragora → Health = 2
- Battle the remaining four.

Experience

= 2 × (5 + 5 + 5 + 5)

= **40**

---

### Example 4

#### Input

```text
1
1
100
```

#### Output

```text
100
```

#### Explanation

There is only one mandragora.

Battling it immediately gives

`1 × 100 = 100`

Eating it would leave nothing to battle.

---

# Approach

## Key Observation

Every mandragora that is eaten should be one with the **smallest health value**.

Why?

- Eating does **not** give experience.
- Battling larger health values gives more experience.
- Therefore, if we decide to eat `k` mandragoras, they should always be the smallest `k` values.

---

## Algorithm

1. Sort the array.
2. Compute the total sum of all health values.
3. Assume we eat the first `k` smallest mandragoras.
4. Remaining health sum is

```
remainingSum = totalSum - prefixSum
```

5. Current health becomes

```
health = k + 1
```

6. Experience becomes

```
experience = health × remainingSum
```

7. Try every possible value of `k` and keep the maximum.

---

## Time Complexity

- Sorting: **O(N log N)**
- Traversal: **O(N)**

Overall:

```
O(N log N)
```

---

## Space Complexity

```
O(1)
```

(ignoring the space used by sorting)