Here is the text for the **Crossword Puzzle** problem:

---

## Crossword Puzzle

A Crossword grid is provided to you, along with a set of words (or names of places) which need to be filled into the grid. Cells are marked either `+` or `-`. Cells marked with a `-` are to be filled with the word list.

The following shows an example crossword from the input grid and the list of words to fit:

### Input

```text
++++++++++
+------+++
+++-++++++
+++-++++++
+++-----++
+++-++-+++
++++++-+++
++++++-+++
++++++-+++
++++++++++
POLAND;LHASA;SPAIN;INDIA

```

### Output

```text
++++++++++
+POLAND+++
+++H++++++
+++A++++++
+++SPAIN++
+++A++N+++
++++++D+++
++++++I+++
++++++A+++
++++++++++

```

---

### Function Description

Complete the `crosswordPuzzle` function in the editor below. It should return an array of strings, each representing a row of the finished puzzle.

`crosswordPuzzle` has the following parameter(s):

* **crossword**: an array of strings of length 10 representing the empty grid
* **words**: a string consisting of semicolon-delimited strings to fit into

---

### Input Format

* Each of the first 10 lines represents 10 characters, `crossword[i]`.
* The last line contains a string consisting of semicolon-delimited words to fit.

---

### Output Format

Position the words appropriately in the grid, then return your array of strings for printing.

---

### Sample Input 0

```text
+-++++++++
+-++++++++
+-++++++++
+-----++++
+-+++-++++
+-+++-++++
+++++-++++
++------++
+++++-++++
+++++-++++
LONDON;DELHI;ICELAND;ANKARA

```

### Sample Output 0

```text
+L++++++++
+O++++++++
+N++++++++
+DELHI++++
+O+++C++++
+N+++E++++
+++++L++++
++ANKARA++
+++++N++++
+++++D++++

```

---

### Sample Input 1

```text
+-++++++++
+-++++++++
+-------++
+-++++++++
+-++++++++
+------+++
+-+++-++++
+++++-++++
+++++-++++
++++++++++
AGRA;NORWAY;ENGLAND;GWALIOR

```

### Sample Output 1

```text
+E++++++++
+N++++++++
+GWALIOR++
+L++++++++
+A++++++++
+NORWAY+++
+D+++G++++
+++++R++++
+++++A++++
++++++++++

```

---

### Sample Input 2

```text
++++++-+++
++------++
++++++-+++
++++++-+++
+++------+
++++++-+-+
++++++-+-+
++++++++-+
++++++++-+
++++++++-+
ICELAND;MEXICO;PANAMA;ALMATY

```

### Sample Output 2

```text
++++++I+++
++MEXICO++
++++++E+++
++++++L+++
+++PANAMA+
++++++N+L+
++++++D+M+
++++++++A+
++++++++T+
++++++++Y+

```