### list
#### Method
 * fast/slow
 * left/right
 * iterative
 * recursive
 * cycle
 * hashmap

|  Class | Method | Complexity |
|  ----  | ----   | ----       |
| Remove Linked List Elements              | iterative                    | O(1)/O(1)       |
| Delete Node in a Linked List             | iterative                    | O(N)/O(1)       |
| Merge Two Sorted Lists                   | iterative                    | O(N)/O(1)       |
| Reverse Linked List                      | iterative/recursive          | O(N)/O(1)       |
| Reverse Linked List II                   | iterative                    | O(N)/O(1)       |
| Middle of the Linked List                | fast/slow                    | O(N)/O(1)       |
| Linked List Cycle                        | fast/slow                    | O(N)/O(1)       |
| Linked List Cycle II                     | fast/slow                    | O(N)/O(1)       |
| Remove Nth Node From End of List         | fast/slow                    | O(N)/O(1)       |
| Reorder List                             | fast/slow + reverse + merge  | O(N)/O(1)       |
| Remove Duplicates from Sorted List       | iterative                    | O(N)/O(1)       |
| Remove Duplicates from Sorted List II    | iterative                    | O(N)/O(1)       |
| Partition List                           | left/right                   | O(N)/O(1)       |
| Palindrome Linked List                   | reverse + compare            | O(N)/O(1)       |
| Rotate List                              | Cycle + iterative            | O(N)/O(1)       |
| Intersection of Two Linked Lists         | iterative + length           | O(N)/O(1)       |
| Copy List with Random Pointer            | hashmap                      | O(N)/O(N)       |
| Odd Even Linked List                     | iterative                    | O(N)/O(N)       |
| Swap Nodes in Pairs                      | iterative                    | O(N)/O(N)       |
| Add Two Numbers                          | iterative + merge            | O(N)/O(N)       |

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
| LCA of a Binary Search Tree              | PostOrder                    | O(N)/O(1)       |
| Lowest Common Ancestor of a Binary Tree  | PostOrder                    | O(N)/O(1)       |
| Sum Root to Leaf Numbers                 | PostOrder                    | O(N)/O(1)       |

### backtrack
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Path Sum                                 | backtrack                    | O(N!)/O(N!)     |
| Path Sum  II                             | backtrack                    | O(N!)/O(N!)     |
| Combination Sum                          | backtrack                    | O(N!)/O(N!)     |
| Combination Sum II                       | backtrack                    | O(N!)/O(N!)     |
| Combination Sum III                      | backtrack                    | O(N!)/O(N!)     |
| Subsets                                  | backtrack                    | O(N!)/O(N!)     |
| Subsets II                               | backtrack                    | O(N!)/O(N!)     |
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
| Pascal's Triangle                        | left/right                   | O(N)/O(N)       |
| Pascal's Triangle II                     | left/right                   | O(N)/O(N)       |
| Majority Element                         | left/right                   | O(N)/O(N)       |
| Majority Element II                      | left/right                   | O(N)/O(N)       |
| Rotate Image                             | 2D + swap                    | O(N^2)/O(1)     |

### heap/stack
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Valid Parentheses                        | stack                        | O(N)/O(N)       |

### map
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Contains Duplicate                       | hashmap                      | O(N)/O(N)       |
| Contains Duplicate II                    | left/right                   | O(N)/O(N)       |
| LRU Cache                                | hashmap                      | O(N)/O(N)       |

### search
|  Class | Method | Complexity | 
|  ----  | ----   | ----       | 
| Binary Search                            | hashmap                      | O(N)/O(N)       |
| Search Insert Position                   | hashmap                      | O(N)/O(N)       |
| First Bad Version                        | hashmap                      | O(N)/O(N)       |
| Search for a Range                       | hashmap                      | O(N)/O(N)       |
| Search a 2D Matrix                       | hashmap                      | O(N)/O(N)       |
| Find Minimum in Rotated Sorted Array     | hashmap                      | O(N)/O(N)       |

### sorting

### graph

### dc

### dp

https://codetop.cc/
https://github.com/afatcoder/LeetcodeTop/blob/master/bytedance/backend.md