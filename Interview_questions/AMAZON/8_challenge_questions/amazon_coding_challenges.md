# Amazon Coding Challenge - Problems & Test Cases

---

## Problem 1: Optimal Cloud Server Pairing

### Description

A cloud infrastructure team is designing a fault-tolerant system comprising n nodes. Each node has a storage capacity given by `capacity[i]`. The system requires that nodes be split into two equal groups: active nodes and their corresponding redundant nodes. For every active node A, its paired redundant node R must satisfy `capacity[R] ≥ capacity[A]`. The total effective throughput of the system equals the sum of capacities of all active nodes.

Given n nodes and their capacities, determine the maximum possible effective throughput achievable through optimal pairing.

### Function Signature

```
long maximumCapacity(int capacity[n])
```

**Returns:** `long int` — the maximum effective throughput

### Constraints

- 2 ≤ n ≤ 2 * 10⁵
- 1 ≤ capacity[i] ≤ 10⁹

### Sample Test Cases

**Sample Case 0:**
```
Input:  n = 4, capacity = [1, 2, 1, 2]
Output: 3
```
Explanation: Pair nodes with capacities [1, 2] as active, and [1, 2] as redundant. Since each redundant node's capacity meets or exceeds its paired active node, total throughput = 1 + 2 = 3.

**Sample Case 1:**
```
Input:  n = 3, capacity = [1, 2, 1]
Output: 1
```
Explanation: With an odd count, only one active-redundant pair is possible. The node with capacity 1 is active, paired with the node of capacity 2. Throughput = 1.

### Hidden Test Cases Summary

| TestCase | Difficulty | Description |
|----------|-----------|-------------|
| 2 | Easy | Choose active nodes with capacity 2, 3 |
| 3 | Easy | Small input (brute force passes) |
| 4 | Easy | Small input (brute force passes) |
| 5 | Medium | n = 2500 (brute force passes) |
| 6 | Medium | n = 2500, edge case with all values = 100 |
| 7 | Medium | Medium input (brute force passes) |
| 8 | Medium | n = 2500 (brute force passes) |
| 9 | Medium | n = 2500 (brute force passes) |
| 10 | Hard | n = 2e5, answer overflows 32-bit integer |
| 11 | Hard | n = 2e5, answer overflows 32-bit integer |
| 12 | Hard | n = 2e5, all values = 10⁹ |
| 13 | Hard | n = 2e5, answer overflows 32-bit integer |
| 14 | Hard | n = 2e5, answer overflows 32-bit integer |

---

## Problem 2: Parallel Task Scheduler

### Description

A distributed computing platform receives n tasks, each with a computational load specified by `taskLoad[i]`. The platform has m processing units, where each unit has a maximum handling capacity of `maxCapacity[j]`.

Scheduling rules:
- A processing unit completes a task in exactly 1 time unit provided `taskLoad ≤ maxCapacity`; otherwise, the unit cannot handle that task.
- Each unit handles at most one task per time unit.
- When a unit processes multiple tasks sequentially, a mandatory 1-time-unit idle gap separates consecutive tasks.
- Multiple units operate concurrently.

Determine the shortest total time to complete all tasks. Return -1 if any task exceeds every unit's capacity.

### Function Signature

```
int minimumExecutionTime(int taskLoad[n], int maxCapacity[m])
```

**Returns:** `int` — shortest completion time, or -1

### Constraints

- 1 ≤ n, m ≤ 2 × 10⁵
- 1 ≤ taskLoad[i], maxCapacity[j] ≤ 10⁹

### Sample Test Cases

**Sample Case 0:**
```
Input:  n = 3, taskLoad = [2, 5, 8], m = 3, maxCapacity = [6, 7, 4]
Output: -1
```
Explanation: The task with load 8 cannot be processed by any unit (max is 7).

**Sample Case 1:**
```
Input:  n = 5, taskLoad = [1, 2, 3, 4, 6], m = 3, maxCapacity = [4, 7, 4]
Output: 3
```
Explanation: Unit with capacity 7 handles tasks 1 and 6 (1 + idle + 1 = 3 units). Unit with capacity 4 handles tasks 2 and 4 (3 units). Another capacity-4 unit handles task 3 alone (1 unit). Everything finishes in 3 time units.

### Hidden Test Cases Summary

| TestCase | Difficulty | Description |
|----------|-----------|-------------|
| 2 | Easy | n=8, mixed workload, selective eligibility filtering |
| 3 | Easy | n=1, single task/unit, immediate completion |
| 4 | Medium | n=100, task exceeds all capacities → immediate -1 |
| 5 | Medium | n=1000, m=1000, mid-scale random |
| 6 | Medium | n=10000, m=10000, medium-scale random |
| 7 | Medium | n=5000, m=5000, medium-scale random |
| 8 | Medium | n=10000, m=10000, sustained throughput |
| 9 | Hard | n=100000, m=100000, upper constraint limits |
| 10 | Hard | n=150000, m=150000, pushing time/memory limits |
| 11 | Hard | n=200000, m=200000, maximal-scale |
| 12 | Hard | n=200000, m=200000, adversarial mix |
| 13 | Hard | n=200000, m=200000, high variance |
| 14 | Hard | n=200000, m=200000, very large taskLoads |

---

## Problem 3: Prioritize Error Codes by Rarity

### Description

An automated testing pipeline generates error logs, where each entry is an integer error code. Repeated occurrences of the same code indicate the issue was triggered multiple times in a session.

To guide the debugging team, errors must be ranked by rarity:
- Errors that occur fewer times are ranked higher (appear earlier in the output).
- When two errors have identical occurrence counts, the one with the smaller numeric code takes precedence.

Produce the sorted sequence of all error codes following these priority rules.

### Function Signature

```
int[] sortBugReportFrequencies(int errors[n])
```

**Returns:** `int[n]` — error codes sorted by decreasing priority

### Constraints

- 1 ≤ n ≤ 2 * 10⁵
- 1 ≤ errors[i] ≤ 10⁶

### Sample Test Cases

**Sample Case 0:**
```
Input:  n = 5, errors = [3, 1, 2, 2, 4]
Output: [1, 3, 4, 2, 2]
```
Explanation: Codes 1, 3, 4 each appear once (sorted by value); code 2 appears twice.

**Sample Case 1:**
```
Input:  n = 10, errors = [8, 5, 5, 5, 5, 1, 1, 1, 4, 4]
Output: [8, 4, 4, 1, 1, 1, 5, 5, 5, 5]
```
Explanation: freq 1: [8]; freq 2: [4,4]; freq 3: [1,1,1]; freq 4: [5,5,5,5]

### Hidden Test Cases Summary

| TestCase | Difficulty | Description |
|----------|-----------|-------------|
| 2 | Easy | n=7, errors=[1,2,3,7,1,8,2], expected=[3,7,8,1,1,2,2] |
| 3 | Medium | n=1000, one code appears once, all others multiple times |
| 4 | Medium | n=1000, progressive frequency pattern (1 appears 1x, 2 appear 2x, etc.) |
| 5 | Medium | n=10000, two codes with freq 1 requiring tie-breaking |
| 6 | Medium | n=20000, multiple codes sharing same frequencies |
| 7 | Medium | n=30000, three codes with freq 1, rest appear more |
| 8 | Hard | n=100000, repetitive patterns with tie-breaking |
| 9 | Hard | n=100000, random frequency distribution |
| 10 | Hard | n=200000, fully randomized (stress test) |
| 11 | Hard | n=200000, minimum freq of 6, randomized order |
| 12 | Hard | n=199268, majority unique (freq=1) with subset repeated |
| 13 | Hard | n=199737, mostly unique with occasional duplications |
| 14 | Hard | n=199292, largely unique with scattered duplicates |

---

## Problem 4: Maximize Protected Inventory

### Description

A logistics operation distributes shipments across k vaults for safekeeping. You receive an array `shipments` of size n representing the quantity of goods in each shipment, and an even integer k representing the total number of vaults.

Storage rules:
- Each vault holds goods from exactly one shipment, but a single shipment may be divided across multiple vaults.
- Once stored, the k/2 vaults containing the most goods are deemed breached.
- Only the remaining k/2 vaults contribute to the protected count.

Determine the maximum total quantity of goods that can remain protected.

### Function Signature

```
int secureMaximumDeliveries(int shipments[n], int k)
```

**Returns:** `int` — the maximum protected quantity

### Constraints

- 1 ≤ n ≤ 1000
- 2 ≤ k ≤ 1000
- 0 ≤ shipments[i] ≤ 1000
- k is guaranteed to be even

### Sample Test Cases

**Sample Case 0:**
```
Input:  n = 1, shipments = [6], k = 2
Output: 3
```
Explanation: Divide the shipment of 6 equally into two vaults (3 each). One vault is breached, protected goods = 3.

**Sample Case 1:**
```
Input:  n = 6, shipments = [5, 5, 5, 5, 5, 5], k = 4
Output: 10
```
Explanation: Place 4 shipments into 4 vaults (5 each). Two are breached; protected = 5 + 5 = 10.

### Hidden Test Cases Summary

| TestCase | Difficulty | Description |
|----------|-----------|-------------|
| 2 | Easy | Array size 4, k=6, small values |
| 3 | Easy | Array size 1, k=2, same values |
| 4 | Medium | Array size 67, k=68, small values |
| 5 | Medium | Array size 149, k=246, small values |
| 6 | Medium | Array size 63, k=72, large values |
| 7 | Medium | Array size 109, k=148, large values |
| 8 | Medium | Array size 134, k=638, large values |
| 9 | Medium | Array size 995, k=792, large values |
| 10 | Hard | n=1000(max), k=1000(max), same values (minimum) |
| 11 | Hard | n=1000(max), k=1000(max), same values (maximum) |
| 12 | Hard | n=1000(max), k=622, large values |
| 13 | Hard | n=1000(max), k=1000(max), large values |
| 14 | Hard | n=1000(max), k=1000, large values |

---

## Problem 5: Circular Depot Routing

### Description

A logistics network has m depots arranged in a circular layout, where depot 1 is adjacent to depot m. A courier can travel to either neighboring depot; the travel cost between depot i and its clockwise neighbor is given by `travelCost[i]`.

The courier starts at depot 1 and must visit a sequence of depots specified in `destinations` (size n), in the given order. For each consecutive pair of depots, the courier takes the shorter of the two possible routes (clockwise or counterclockwise).

Compute the minimum total travel cost to visit all depots in the specified sequence.

**Note:** 1-based indexing. `travelCost[i]` represents the cost from depot i to depot i+1 (clockwise); `travelCost[m]` wraps around from depot m to depot 1.

### Function Signature

```
long computeMinDeliveryTime(int destinations[n], int travelCost[m])
```

**Returns:** `long` — the minimum total travel cost

### Constraints

- 1 ≤ n ≤ 2 * 10⁵
- 1 ≤ destinations[i] ≤ m
- 1 ≤ m ≤ 5000
- 1 ≤ travelCost[i] ≤ 10⁶

### Sample Test Cases

**Sample Case 0:**
```
Input:  n = 4, destinations = [2, 3, 3, 1], m = 3, travelCost = [3, 2, 1]
Output: 6
```
Explanation: Depot1→2 (cost 3) + Depot2→3 (cost 2) + Depot3→3 (0) + Depot3→1 (cost 1) = 6

**Sample Case 1:**
```
Input:  n = 3, destinations = [1, 2, 1], m = 2, travelCost = [1, 2]
Output: 3
```
Explanation: Depot1→1 (0) + Depot1→2 (cost 1) + Depot2→1 (cost 2) = 3

### Hidden Test Cases Summary

| TestCase | Difficulty | Description |
|----------|-----------|-------------|
| 2 | Easy | n=4, brute force passes |
| 3 | Easy | n=7, brute force passes |
| 4 | Easy | n=10, brute force passes |
| 5 | Easy | n=100, brute force passes |
| 6 | Easy | n=1000, brute force passes |
| 7 | Medium | n=10000, brute force passes |
| 8 | Medium | n=2000, brute force passes |
| 9 | Hard | n=180000, overflow edge case (optimal only) |
| 10 | Hard | n=200000, overflow edge case (optimal only) |
| 11 | Hard | n=200000, overflow edge case (optimal only) |
| 12 | Hard | n=200000, overflow edge case (optimal only) |
| 13 | Hard | n=200000, overflow edge case (optimal only) |
| 14 | Hard | n=200000, overflow edge case (optimal only) |

---

## Problem 6: Stable Fleet Arrangements

### Description

A fleet of n autonomous agents operates in a shared environment. Each agent can be either **Idle** or **Active**. Every agent i has a cooperation requirement `threshold[i]` that dictates its stability:

- Agent i is **unstable** if it is Active but fewer than `threshold[i]` other agents are also Active.
- Agent i is **unstable** if it is Idle but `threshold[i]` or more agents are Active.

A fleet arrangement is stable only when every agent is free from instability. Count the total number of distinct stable arrangements.

### Function Signature

```
int getValidConfigurations(int threshold[n])
```

**Returns:** `int` — the number of stable arrangements

### Constraints

- 2 ≤ n ≤ 2 * 10⁵
- 0 ≤ threshold[i] ≤ n − 1

### Sample Test Cases

**Sample Case 0:**
```
Input:  n = 5, threshold = [3, 0, 0, 3, 3]
Output: 2
```
Explanation: Two stable arrangements exist: agents at indices 1 and 2 Active, or all agents Active.

**Sample Case 1:**
```
Input:  n = 7, threshold = [0, 1, 2, 3, 4, 5, 6]
Output: 1
```
Explanation: The only stable arrangement is having all agents Active.

### Hidden Test Cases Summary

| TestCase | Difficulty | Description |
|----------|-----------|-------------|
| 2 | Easy | 8 agents, 3 stable arrangements |
| 3 | Easy | 2 agents, 1 stable arrangement |
| 4 | Easy | 50 agents, 6 stable arrangements |
| 5 | Medium | 1320 agents, 26 stable arrangements |
| 6 | Medium | 1377 agents, 32 stable arrangements |
| 7 | Medium | 1618 agents, 28 stable arrangements |
| 8 | Medium | 1042 agents, 3 stable arrangements |
| 9 | Medium | 1320 agents, 26 stable arrangements |
| 10 | Hard | 178475 agents, 326 stable arrangements |
| 11 | Hard | 130163 agents, 78 stable arrangements |
| 12 | Hard | 200000 agents, 29 stable arrangements |
| 13 | Hard | 200000 agents, 534 stable arrangements |
| 14 | Hard | 200000 agents, 190 stable arrangements |

---

## Problem 7: Optimal Pattern for Data Recovery

### Description

A distributed storage cluster has lost certain data blocks represented by the string `lostData`. To reconstruct these blocks, the system chooses a pattern string of length `patternLength` and copies it repeatedly, appending each copy to a recovery buffer until every character in the buffer appears at least as many times as it does in `lostData`.

Identify the pattern that minimizes the number of copy operations needed. Among all patterns tied for the minimum, return the lexicographically smallest. If no valid pattern of the given length can recover the data, return "-1".

### Function Signature

```
string getSmallestBaseSegment(int patternLength, string lostData)
```

**Returns:** `string` — the optimal pattern, or "-1" if impossible

### Constraints

- 1 ≤ patternLength ≤ 2 * 10⁵
- 1 ≤ |lostData| ≤ 2 * 10⁵
- lostData contains only lowercase English letters 'a' to 'z'

### Sample Test Cases

**Sample Case 0:**
```
Input:  patternLength = 4, lostData = "abacbca"
Output: "aabc"
```
Explanation: Characters: 'a'×3, 'b'×2, 'c'×2. Pattern "aabc" requires only 2 copies. Alternatives like "abbc" or "abcc" require 3.

**Sample Case 1:**
```
Input:  patternLength = 3, lostData = "aabaabba"
Output: "aab"
```
Explanation: Characters: 'a'×5, 'b'×3. Pattern "aab" needs 3 copies; "abb" would need 5.

### Hidden Test Cases Summary

| TestCase | Difficulty | Description |
|----------|-----------|-------------|
| 2 | Easy | n=3, repeated characters |
| 3 | Easy | 5 characters, unique chars handling |
| 4 | Easy | Single character in lostData |
| 5 | Medium | 100 chars of repeating 'j' |
| 6 | Medium | 8500 chars of repeating 'j' |
| 7 | Medium | lostData size 10000, patternLength 941 |
| 8 | Medium | lostData size 16000, patternLength 20000 |
| 9 | Medium | lostData size 10000, patternLength 15000 |
| 10 | Hard | lostData size 115000, patternLength 20000 |
| 11 | Hard | lostData 137200, patternLength 25 |
| 12 | Hard | lostData 175000, patternLength 200000 |
| 13 | Hard | lostData = patternLength = 200000 |
| 14 | Hard | Entire data missing (200000 chars) |

---

## Problem 8: Refund Decision Engine (Code Repo / Bug Fix)

### Description

Repair a malfunctioning refund decision engine for an online marketplace. The engine evaluates refund requests through a three-phase pipeline:

**Phase 1: Product Policy Validation**
- If the product category is absent or marked non-refundable → REJECT with reason `CATEGORY_NON_RETURNABLE`
- If `days_since_purchase` exceeds the category's permitted refund window → REJECT with reason `RETURN_WINDOW_EXPIRED`

**Phase 2: Trust Score Computation**
- Aggregate `return_history_count` across all transitively linked accounts
- Apply scoring rules (match each attribute to its configured range, accumulate points)
- Clamp the final score to [0, 100]

**Phase 3: Verdict Assignment**
- Score 0–49 → `AUTO_APPROVE` (no reason field)
- Score 50–74 → `MANUAL_REVIEW` with reason `MEDIUM_RISK_SCORE`
- Score 75–100 → `REJECT` with reason `HIGH_RISK_SCORE`

### Test Cases

| Test Case | Status | Score |
|-----------|--------|-------|
| test_returnable_category_passes_to_scoring | — | 12.5 |
| test_return_window_expired | — | 12.5 |
| test_linked_account_aggregation_primary | — | 12.5 |
| test_transitive_link_aggregation | — | 12.5 |
| test_high_risk_reject_with_reason | — | 12.5 |
| test_risk_score_clamped_to_100 | — | 12.5 |

---
