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
| Remove Linked List Elements              | Iterative                    | O(1)/O(1)       1|
| Delete Node in a Linked List             | Iterative                    | O(N)/O(1)       1|
| Merge Two Sorted Lists                   | Iterative                    | O(N)/O(1)       1|
| Merge k Sorted Lists                     | Recursive + Iterative        | O(N)/O(1)       1|
| Reverse Linked List                      | Iterative/Recursive          | O(N)/O(1)       1|
| Reverse Linked List II                   | Iterative + m + n            | O(N)/O(1)       1|
| Middle of the Linked List                | Fast/Slow                    | O(N)/O(1)       1|
| Linked List Cycle                        | Fast/Slow                    | O(N)/O(1)       1|
| Linked List Cycle II                     | Fast/Slow                    | O(N)/O(1)       1|
| Remove Nth Node From End of List         | Fast/Slow                    | O(N)/O(1)       1|
| Reorder List                             | Fast/Slow + Reverse + Merge  | O(N)/O(1)       1|
| Remove Duplicates from Sorted List       | Iterative                    | O(N)/O(1)       1|
| Remove Duplicates from Sorted List II    | Dummy                        | O(N)/O(1)       1|
| Partition List                           | Left/Right + Dummy           | O(N)/O(1)       1|
| Palindrome Linked List                   | Reverse + Compare            | O(N)/O(1)       1|
| Rotate List                              | Cycle + iterative            | O(N)/O(1)       1|
| Intersection of Two Linked Lists         | Iterative + length           | O(N)/O(1)       1|
| Copy List with Random Pointer            | Hashmap                      | O(N)/O(N)       1|
| Odd Even Linked List                     | Iterative                    | O(N)/O(N)       1|
| Swap Nodes in Pairs                      | Dummy                        | O(N)/O(N)       1|
| Add Two Numbers                          | Iterative + Merge            | O(N)/O(N)       1|

### Tree
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Binary Tree Preorder Traversal           | Recursive                    | O(N)/O(1)       1|
| Binary Tree Inorder Traversal            | Recursive                    | O(N)/O(1)       1|
| Binary Tree Postorder Traversal          | Recursive                    | O(N)/O(1)       1|
| Convert BST to Greater Tree              | Inorder                      | O(N)/O(1)       1|
| Same Tree                                | Preorder                     | O(N)/O(1)       1|
| Symmetric Tree                           | Preorder                     | O(N)/O(1)       1|
| Validate Binary Search Tree              | Preorder                     | O(N)/O(1)       1|
| Binary Tree Right Side View              | Preorder                     | O(N)/O(1)       1|
| Binary Tree Level Order Traversal        | Preorder                     | O(N!)/O(N!)     1|
| Binary Tree Level Order Traversal II     | Preorder + Reverse           | O(N!)/O(N!)     1|
| Binary Tree Zigzag Level Order Traversal | Preorder + Reverse           | O(N!)/O(N!)     1|
| Balanced Binary Tree                     | PostOrder                    | O(N)/O(1)       1|
| Maximum Depth of Binary Tree             | PostOrder                    | O(N)/O(1)       1|
| Minimum Depth of Binary Tree             | PostOrder                    | O(N)/O(1)       1|
| Binary Tree Paths                        | PostOrder                    | O(N)/O(1)       1|
| Sum Root to Leaf Numbers                 | PreOrder                     | O(N)/O(1)       1|
| LCA of a Binary Search Tree              | Divide and conquer           | O(N)/O(1)       1|
| Lowest Common Ancestor of a Binary Tree  | PostOrder                    | O(N)/O(1)       1|

### backtrack
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Subsets                                  | backtrack                    | O(N!)/O(N!)     1|
| Subsets II                               | backtrack unique             | O(N!)/O(N!)     1|
| Path Sum                                 | backtrack no leaf && val=sum | O(N!)/O(N!)     1|
| Path Sum II                              | backtrack no leaf && val=sum | O(N!)/O(N!)     1|
| Combination Sum                          | backtrack depth              | O(N!)/O(N!)     1|
| Combination Sum II                       | backtrack unique             | O(N!)/O(N!)     1|
| Combination Sum III                      | backtrack                    | O(N!)/O(N!)     1|
| Permutations                             | backtrack                    | O(N!)/O(N!)     1|
| Permutations II                          | backtrack unique             | O(N!)/O(N!)     1|

### array
#### Method
* Left/right
* Two pointer
* Hashmap
* ArrayList
* Count Index

|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Two Sum                                  | hashmap                      | O(N)/O(N)       1|
| Two Sum II - Input array is sorted       | left/right                   | O(N)/O(N)       1|
| Two Sum III - data structure design      | hashmap                      | O(N)/O(N)       1|
| 3Sum                                     | left/right                   | O(NlogN)/O(N)   1|
| 3Sum Closest                             | left/right                   | O(NlogN)/O(N)   1|
| 3Sum Smaller                             | left/right                   | O(NlogN)/O(N)   1|
| 4Sum                                     | left/right                   | O(NlogN)/O(N)   1|
| Move Zeroes                              | two pointer                  | O(N)/O(N)       1|
| Remove Element                           | two pointer                  | O(N)/O(N)       1|
| Remove Duplicates from Sorted Array      | two pointer                  | O(N)/O(N)       1|
| Remove Duplicates from Sorted Array II   | two pointer                  | O(N)/O(N)       1|
| Pascal's Triangle                        | two arrayList                | O(N)/O(N)       1|
| Pascal's Triangle II                     | two arrayList                | O(N)/O(N)       1|
| Majority Element                         | Count Index                  | O(N)/O(N)       1|
| Majority Element II                      | Count Index                  | O(N)/O(N)       1|
| Rotate Image                             | 2D + swap                    | O(N^2)/O(1)     |
| Spiral Matrix                            | 2D --m, --n                  | O(N^2)/O(1)     |
| Container With Most Water                | left/right                   | O(N)/O(N)       |

### heap/stack
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Valid Parentheses                        | stack                        | O(N)/O(N)       |
| Min Stack                                | stack                        | O(N)/O(N)       |

### map
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Contains Duplicate                       | hashmap                      | O(N)/O(N)       1|
| Contains Duplicate II                    | hashmap + gap k              | O(N)/O(N)       1|
| LRU Cache                                | linked hashmap               | O(N)/O(N)       |

### search
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Binary Search                            | mid = (left+right/2)         | O(N)/O(N)       |
| Search Insert Position                   | left                         | O(N)/O(N)       |
| First Bad Version                        | left                         | O(N)/O(N)       |
| Search for a Range                       | range=left+right             | O(N)/O(N)       |
| Search a 2D Matrix                       | mid / width, mid % width     | O(N)/O(N)       |
| Find Minimum in Rotated Sorted Array     | left                         | O(N)/O(N)       |
| Find Peak Element                        | left                         | O(N)/O(N)       |
| Sqrt(x)                                  | right                        | O(N)/O(N)       |

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