Here is the text of the problem from the page:

---

## Equal Stacks

You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height. You can change the height of a stack by removing and discarding its topmost cylinder any number of times.

Find the maximum possible height of the stacks such that all of the stacks are exactly the same height. This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they are all the same height, then return the height.

### Example

`h1 = [1, 2, 1, 1]`

`h2 = [1, 1, 2]`

`h3 = [1, 1]`

There are 4, 3, and 2 cylinders in the three stacks, with their heights in the three arrays. Remove the top 2 cylinders from `h1` (heights = [1, 2]) and `h2` (heights = [1, 1]) so that the three stacks all are 2 units tall. Return 2 as the answer.

*Note:* An empty stack is still a stack.

---

### Function Description

Complete the `equalStacks` function in the editor below.

`equalStacks` has the following parameters:

* `int h1[n1]`: the first array of heights
* `int h2[n2]`: the second array of heights
* `int h3[n3]`: the third array of heights

### Returns

* `int`: the height of the stacks when they are equalized

---

### Input Format

* The first line contains three space-separated integers, $n_1$, $n_2$, and $n_3$, the numbers of cylinders in stacks $h_1$, $h_2$, and $h_3$.
* The subsequent lines describe the respective heights of each cylinder in a stack from top to bottom:
* The second line contains $n_1$ space-separated integers, the cylinder heights in stack $h_1$. The first element is the top cylinder of the stack.
* The third line contains $n_2$ space-separated integers, the cylinder heights in stack $h_2$. The first element is the top cylinder of the stack.
* The fourth line contains $n_3$ space-separated integers, the cylinder heights in stack $h_3$. The first element is the top cylinder of the stack.



---

### Constraints

* $0 < n_1, n_2, n_3 \le 10^5$
* $0 < \text{height of any cylinder} \le 100$

---

### Sample Input

```text
5 3 4
3 2 1 1 1
4 3 2
1 1 4 1

```

### Sample Output

```text
5

```

---

### Explanation

Initially, the stacks look like this:

* $h_1 = [3, 2, 1, 1, 1]$ (total height = 8)
* $h_2 = [4, 3, 2]$ (total height = 9)
* $h_3 = [1, 1, 4, 1]$ (total height = 7)

To equalize their heights:

1. Remove the first cylinder from $h_1$ (height becomes 5) and $h_2$ (height becomes 5).
2. Remove the top two cylinders from stack $h_3$ (height becomes 5).

All three stacks now have a height of **5**, which is the value to return.