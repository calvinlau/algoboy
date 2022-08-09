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
| Remove Duplicates from Sorted List II    | Iterative + Dummy            | O(N)/O(1)       1|
| Partition List                           | Left/Right + Dummy           | O(N)/O(1)       1|
| Palindrome Linked List                   | Reverse + Compare            | O(N)/O(1)       1|
| Rotate List                              | Cycle + iterative            | O(N)/O(1)       |
| Intersection of Two Linked Lists         | Iterative + length           | O(N)/O(1)       |
| Copy List with Random Pointer            | Hashmap                      | O(N)/O(N)       |
| Odd Even Linked List                     | Iterative                    | O(N)/O(N)       |
| Swap Nodes in Pairs                      | Iterative                    | O(N)/O(N)       |
| Add Two Numbers                          | Iterative + Merge            | O(N)/O(N)       |

### tree
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Binary Tree Preorder Traversal           | recursive                    | O(N)/O(1)       |
| Binary Tree Inorder Traversal            | recursive                    | O(N)/O(1)       |
| Binary Tree Postorder Traversal          | recursive                    | O(N)/O(1)       |
| Same Tree                                | Preorder                     | O(N)/O(1)       |
| Symmetric Tree                           | Preorder                     | O(N)/O(1)       |
| Validate Binary Search Tree              | Preorder                     | O(N)/O(1)       |
| Binary Tree Right Side View              | Preorder + swap              | O(N)/O(1)       |
| Binary Tree Level Order Traversal        | Preorder + level             | O(N!)/O(N!)     |
| Binary Tree Level Order Traversal        | Preorder + level             | O(N!)/O(N!)     |
| Binary Tree Level Order Traversal II     | Preorder + level + reverse   | O(N!)/O(N!)     |
| Binary Tree Zigzag Level Order Traversal | Preorder + level + reverse   | O(N!)/O(N!)     |
| Balanced Binary Tree                     | PostOrder + height gap       | O(N)/O(1)       |
| Maximum Depth of Binary Tree             | PostOrder + height           | O(N)/O(1)       |
| Minimum Depth of Binary Tree             | PostOrder + height           | O(N)/O(1)       |
| Binary Tree Paths                        | PostOrder                    | O(N)/O(1)       |
| Sum Root to Leaf Numbers                 | PostOrder                    | O(N)/O(1)       |
| LCA of a Binary Search Tree              | PostOrder                    | O(N)/O(1)       |
| Lowest Common Ancestor of a Binary Tree  | PostOrder                    | O(N)/O(1)       |

### backtrack
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Path Sum                                 | backtrack no leaf && val=sum | O(N!)/O(N!)     |
| Path Sum II                              | backtrack no leaf && val=sum | O(N!)/O(N!)     |
| Combination Sum                          | backtrack depth              | O(N!)/O(N!)     |
| Combination Sum II                       | backtrack unique             | O(N!)/O(N!)     |
| Combination Sum III                      | backtrack                    | O(N!)/O(N!)     |
| Subsets                                  | backtrack                    | O(N!)/O(N!)     |
| Subsets II                               | backtrack unique             | O(N!)/O(N!)     |
| Permutations                             | backtrack                    | O(N!)/O(N!)     |

### array
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Two Sum                                  | hashmap                      | O(N)/O(N)       |
| Two Sum II - Input array is sorted       | left/right                   | O(N)/O(N)       |
| 3Sum                                     | left/right                   | O(N)/O(N)       |
| 3Sum Closest                             | left/right                   | O(N)/O(N)       |
| 4Sum                                     | left/right                   | O(N)/O(N)       |
| Container With Most Water                | left/right                   | O(N)/O(N)       |
| Move Zeroes                              | left/right                   | O(N)/O(N)       |
| Remove Element                           | left/right                   | O(N)/O(N)       |
| Remove Duplicates from Sorted Array      | left/right                   | O(N)/O(N)       |
| Remove Duplicates from Sorted Array II   | left/right                   | O(N)/O(N)       |
| Pascal's Triangle                        | two layer for                | O(N)/O(N)       |
| Pascal's Triangle II                     | two layer for                | O(N)/O(N)       |
| Majority Element                         | left/right                   | O(N)/O(N)       |
| Majority Element II                      | left/right                   | O(N)/O(N)       |
| Rotate Image                             | 2D + swap                    | O(N^2)/O(1)     |
| Spiral Matrix                            | 2D --m, --n                  | O(N^2)/O(1)     |

### heap/stack
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Valid Parentheses                        | stack                        | O(N)/O(N)       |
| Min Stack                                | stack                        | O(N)/O(N)       |

### map
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Contains Duplicate                       | hashmap                      | O(N)/O(N)       |
| Contains Duplicate II                    | hashmap + gap k              | O(N)/O(N)       |
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