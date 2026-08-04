# Shortest Path in an Undirected Weighted Graph

## Problem Description
You are given an undirected weighted graph with `n` vertices numbered from `1` to `n` and `m` edges. Each edge is represented by three integers `u`, `v`, and `w`, indicating an edge between vertices `u` and `v` with weight `w`.

Given a source vertex `s` and a destination vertex `t`, find the length of the shortest path from `s` to `t`. If there is no path between them, print `-1`.

---

## Input & Output Format

### Input Format
* The first line contains two integers `n` and `m` (representing the number of vertices and edges).
* The next `m` lines each contain three integers: `u`, `v`, and `w` representing an undirected edge of weight `w` between `u` and `v`.
* The last line contains two integers: `s` and `t` representing the source and destination vertices.

### Output Format
* Print a single integer representing the length of the shortest path from `s` to `t`, or `-1` if `t` is unreachable.

---

## Input Constraints
* $1 \le n \le 2 \times 10^5$
* $0 \le m \le 3 \times 10^5$
* $1 \le u, v \le n$
* $0 \le w \le 10^9$
* $1 \le s, t \le n$

### Notes
1. **Graph Nature:** Following the problem description constraints, the graph is processed as **undirected** (bidirectional pathways), despite directional arrows in sample reference diagrams.
2. Multiple edges between the same pair of vertices may exist.
3. Self-loops may be ignored.
4. If the source and destination are the same, the answer is `0`.

---

## Examples

### Example 1
#### Graph Reference Visual
Below is the structural layout of the sample graph:

<img src="https://github.com/MarcusFranklin-GIT/Leetcode_problems/blob/main/Multicoreware/Graph_SP.png" alt="Sample Graph Layout" width="50%" />

#### Input
```text
5 8
2 1 3
1 3 6
1 4 3
3 4 2
4 3 1
4 2 1
5 2 4
5 4 2
5 3
```

#### Output
````
3
````


### Example 2
#### Simple Unreachable Case

#### Input
```text
4 2
1 2 5
3 4 7
1 4
```

#### Output
```text
-1
```