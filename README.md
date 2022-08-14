### List
#### Method
 * Fast/Slow
 * Dummy Head
 * Left/Right
 * Iterative
 * Recursive
 * Cycle
 * Hashmap

|  Class | Method | Complexity |
|  ----  | ----   | ----       |
| 203. Remove Linked List Elements                    | Iterative                    | O(1)/O(1)       1|
| 237. Delete Node in a Linked List                   | Iterative                    | O(N)/O(1)       1|
| 21. Merge Two Sorted Lists                          | Iterative                    | O(N)/O(1)       1|
| 23. Merge k Sorted Lists                            | Recursive + Iterative        | O(N)/O(1)       1|
| 206. Reverse Linked List                            | Iterative/Recursive          | O(N)/O(1)       1|
| 92. Reverse Linked List II                          | Iterative + m + n            | O(N)/O(1)       1|
| 876. Middle of the Linked List                      | Fast/Slow                    | O(N)/O(1)       1|
| 141. Linked List Cycle                              | Fast/Slow                    | O(N)/O(1)       1|
| 142. Linked List Cycle II                           | Fast/Slow                    | O(N)/O(1)       1|
| 19. Remove Nth Node From End of List                | Fast/Slow                    | O(N)/O(1)       1|
| 143. Reorder List                                   | Fast/Slow + Reverse + Merge  | O(N)/O(1)       1|
| 83. Remove Duplicates from Sorted List              | Iterative                    | O(N)/O(1)       1|
| 82. Remove Duplicates from Sorted List II           | Dummy                        | O(N)/O(1)       1|
| 86. Partition List                                  | Left/Right + Dummy           | O(N)/O(1)       1|
| 234. Palindrome Linked List                         | Reverse + Compare            | O(N)/O(1)       1|
| 61. Rotate List                                     | Cycle + iterative            | O(N)/O(1)       1|
| 160. Intersection of Two Linked Lists               | Iterative + length           | O(N)/O(1)       1|
| 138. Copy List with Random Pointer                  | Hashmap                      | O(N)/O(N)       1|
| 328. Odd Even Linked List                           | Iterative                    | O(N)/O(N)       1|
| 24. Swap Nodes in Pairs                             | Dummy                        | O(N)/O(N)       1|
| 2. Add Two Numbers                                  | Iterative + Merge            | O(N)/O(N)       1|

### Tree
#### Method
 * DFS
 * BFS

|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| 144. Binary Tree Preorder Traversal                 | DFS                          | O(N)/O(1)       1|
| 94. Binary Tree Inorder Traversal                   | DFS                          | O(N)/O(1)       1|
| 145. Binary Tree Postorder Traversal                | DFS                          | O(N)/O(1)       1|
| 100. Same Tree                                      | Preorder                     | O(N)/O(1)       1|
| 101. Symmetric Tree                                 | Preorder                     | O(N)/O(1)       1|
| 226. Invert Binary Tree                             | Preorder                     | O(N)/O(1)       1|
| 98. Validate Binary Search Tree                     | Preorder                     | O(N)/O(1)       1|
| 199. Binary Tree Right Side View                    | Preorder                     | O(N)/O(1)       1|
| 404. Sum of Left Leaves                             | Preorder                     | O(N)/O(1)       1|
| 102. Binary Tree Level Order Traversal              | Preorder                     | O(N!)/O(N!)     1|
| 107. Binary Tree Level Order Traversal II           | Preorder + Reverse           | O(N!)/O(N!)     1|
| 103. Binary Tree Zigzag Level Order Traversal       | Preorder + Reverse           | O(N!)/O(N!)     1|
| 530. Minimum Absolute Difference in BST             | Inorder                      | O(N)/O(1)       1|
| 538. Convert BST to Greater Tree                    | Inorder                      | O(N)/O(1)       1|
| 110. Balanced Binary Tree                           | PostOrder                    | O(N)/O(1)       1|
| 104. Maximum Depth of Binary Tree                   | PostOrder                    | O(N)/O(1)       1|
| 111. Minimum Depth of Binary Tree                   | PostOrder                    | O(N)/O(1)       1|
| 257. Binary Tree Paths                              | PostOrder                    | O(N)/O(1)       1|
| 129. Sum Root to Leaf Numbers                       | PreOrder                     | O(N)/O(1)       1|
| 235. Lowest Common Ancestor of a Binary Search Tree | PostOrder                    | O(N)/O(1)       1|
| 236. Lowest Common Ancestor of a Binary Tree        | PostOrder                    | O(N)/O(1)       1|

### backtrack
* DFS

|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| 78. Subsets                                         | DFS                          | O(N!)/O(N!)     1|
| 90. Subsets II                                      | DFS unique                   | O(N!)/O(N!)     1|
| 112. Path Sum                                       | DFS no leaf && val=sum       | O(N!)/O(N!)     1|
| 113. Path Sum II                                    | DFS no leaf && val=sum       | O(N!)/O(N!)     1|
| 77. backtrack.Combinations                                    | DFS depth                    | O(N!)/O(N!)     1|
| 39. Combination Sum                                 | DFS depth                    | O(N!)/O(N!)     1|
| 40. Combination Sum II                              | DFS unique                   | O(N!)/O(N!)     1|
| 216. Combination Sum III                            | DFS                          | O(N!)/O(N!)     1|
| 46. Permutations                                    | DFS                          | O(N!)/O(N!)     1|
| 47. Permutations II                                 | DFS unique                   | O(N!)/O(N!)     1|

### array
#### Method
* Left/right
* Two pointer
* Hashmap
* ArrayList
* Count Index

|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| 1. Two Sum                                          | hashmap                      | O(N)/O(N)       1|
| 167. Two Sum II - Input array is sorted             | left/right                   | O(N)/O(N)       1|
| 170. Two Sum III - data structure design            | hashmap                      | O(N)/O(N)       1|
| 15. 3Sum                                            | left/right                   | O(NlogN)/O(N)   1|
| 16. 3Sum Closest                                    | left/right                   | O(NlogN)/O(N)   1|
| 259. 3Sum Smaller                                   | left/right                   | O(NlogN)/O(N)   1|
| 18. 4Sum                                            | left/right                   | O(NlogN)/O(N)   1|
| 283. Move Zeroes                                    | two pointer                  | O(N)/O(N)       1|
| 27. Remove Element                                  | two pointer                  | O(N)/O(N)       1|
| 26. Remove Duplicates from Sorted Array             | two pointer                  | O(N)/O(N)       1|
| 80. Remove Duplicates from Sorted Array II          | two pointer                  | O(N)/O(N)       1|
| 118. Pascal's Triangle                              | two arrayList                | O(N)/O(N)       1|
| 119. Pascal's Triangle II                           | two arrayList                | O(N)/O(N)       1|
| 169. Majority Element                               | Count Index                  | O(N)/O(N)       1|
| 229. Majority Element II                            | Count Index                  | O(N)/O(N)       1|
| Rotate Image                                        | 2D + swap                    | O(N^2)/O(1)     |
| Spiral Matrix                                       | 2D --m, --n                  | O(N^2)/O(1)     |
| Container With Most Water                           | left/right                   | O(N)/O(N)       |

### heap/stack
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| 20. Valid Parentheses                               | stack                        | O(N)/O(N)       1|
| 155. Min Stack                                      | two stack                    | O(N)/O(N)       1|

### map
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| 217. Contains Duplicate                             | hashmap                      | O(N)/O(N)       1|
| 219. Contains Duplicate II                          | hashmap + gap k              | O(N)/O(N)       1|
| 146. LRU Cache                                      | LinkedHashMap                | O(N)/O(N)       1|

### search
#### Method
* mid = left + (right - left) / 2

|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| 704. Binary Search                                  | mid                          | O(N)/O(N)       1|
| 35. Search Insert Position                          | mid                          | O(N)/O(N)       1|
| 278. First Bad Version                              | mid                          | O(N)/O(N)       1|
| 153. Find Minimum in Rotated Sorted Array           | mid                          | O(N)/O(N)       1|
| 154. Find Minimum in Rotated Sorted Array II        | mid                          | O(N)/O(N)       1|
| Search for a Range                                  | range=left+right             | O(N)/O(N)       |
| Search a 2D Matrix                                  | mid / width, mid % width     | O(N)/O(N)       |
| Find Peak Element                                   | left                         | O(N)/O(N)       |
| Sqrt(x)                                             | right                        | O(N)/O(N)       |
| 33. Search in Rotated Sorted Array                  | right                        | O(N)/O(N)       |
| 81. Search in Rotated Sorted Array II               | right                        | O(N)/O(N)       |

### dp
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Maximum Subarray                         | max sum                      | O(N)/O(N)       |
| Best Time to Buy and Sell Stock          | find min, calc gap           | O(N)/O(N)       |
| Best Time to Buy and Sell Stock II       | find all gap                 | O(N)/O(N)       |

### sorting

### graph

### dc

https://codetop.cc/
https://github.com/afatcoder/LeetcodeTop/blob/master/bytedance/backend.md