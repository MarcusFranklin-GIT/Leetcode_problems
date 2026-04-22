# Matrix Cumulative Summation

## 🧩 Problem Statement

You are given a 2D matrix represented as a list of lists:

```
List<List<Integer>> a
```

with **R rows** and **C columns**.

Your task is to construct a new matrix `result` of the same size such that each element at position `(i, j)` contains the **sum of all elements from `(0,0)` to `(i,j)`** in the original matrix.

---

## 📌 Definition

```
result[i][j] = sum of all elements a[x][y] where 0 ≤ x ≤ i and 0 ≤ y ≤ j
```

---

## 📥 Input

- A 2D list `a` of size `R × C`

## 📤 Output

- A 2D list `result` of size `R × C` containing cumulative sums

---

## ⚙️ Function Signature

```java
public static List<List<Integer>> matrixSummation(List<List<Integer>> a)
```

---

## 📊 Test Cases

### Test Case 1

**Input:**
```
a = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
```

**Output:**
```
[
  [ 1,  3,  6],
  [ 5, 12, 21],
  [12, 27, 45]
]
```

---

### Test Case 2

**Input:**
```
a = [
  [5]
]
```

**Output:**
```
[
  [5]
]
```

---

### Test Case 3

**Input:**
```
a = [
  [1, 1],
  [1, 1]
]
```

**Output:**
```
[
  [1, 2],
  [2, 4]
]
```

---

### Test Case 4

**Input:**
```
a = [
  [2, 4, 6]
]
```

**Output:**
```
[
  [2, 6, 12]
]
```

---

### Test Case 5

**Input:**
```
a = [
  [3],
  [6],
  [9]
]
```

**Output:**
```
[
  [ 3],
  [ 9],
  [18]
]
```

---

## 🚧 Constraints

- `1 ≤ R, C ≤ 1000`
- `-10⁴ ≤ a[i][j] ≤ 10⁴`