# Find the Running Median

The median is the middle value of a sorted data set.

- If the set has an odd number of elements, the median is the middle element.
- If the set has an even number of elements, the median is the average of the two middle elements.

For each integer that arrives in the stream:

1. Add it to the current list.
2. Sort the list.
3. Find the median of the updated list.
4. Print the median on a new line.

The output must be displayed as a decimal number with one digit after the decimal point, such as 5.0 or 4.5.

## Example

| Sorted list | Median |
| --- | --- |
| [7] | 7.0 |
| [3, 7] | 5.0 |
| [3, 5, 7] | 5.0 |
| [2, 3, 5, 7] | 4.0 |

## Function Description

Complete the `runningMedian` function.

### Parameters

- `int a[n]`: an array of integers

### Returns

- `float[n]`: the median after each insertion

> Note: format the print statement so the values appear correctly with one decimal place.

## Input Format

- The first line contains an integer `n`, the number of values in the stream.
- Each of the next `n` lines contains one integer to insert.

## Constraints

- `1 <= n <= 10^5`
- `0 <= a[i] <= 10^5`

---

## Sample Input

```text
STDIN   Function
-----   --------
6       a[] size n = 6
12      a = [12, 4, 5, 3, 8, 7]
4
5
3
8
7
```

## Sample Output

```text
12.0
8.0
5.0
4.5
5.0
6.0
```

## Explanation

Starting with 6 integers, we print the median after each insertion:

1. `[12]` → median = `12.0`
2. `[12, 4]` → sorted: `[4, 12]` → median = `(4 + 12) / 2 = 8.0`
3. `[12, 4, 5]` → sorted: `[4, 5, 12]` → median = `5.0`
4. `[12, 4, 5, 3]` → sorted: `[3, 4, 5, 12]` → median = `(4 + 5) / 2 = 4.5`
5. `[12, 4, 5, 3, 8]` → sorted: `[3, 4, 5, 8, 12]` → median = `5.0`
6. `[12, 4, 5, 3, 8, 7]` → sorted: `[3, 4, 5, 7, 8, 12]` → median = `(5 + 7) / 2 = 6.0`

```