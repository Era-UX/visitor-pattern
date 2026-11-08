# File System Visitor Pattern

This project implements the Visitor behavioral design pattern (Option A from the assignment) using a simulated file system. It demonstrates how to add new operations to an existing object structure without modifying the element classes.

## Components
*   **Elements**: `FsFile`, `FsDirectory` (implementing `FsNode`).
*   **Visitors**: `SizeCalculatorVisitor` (calculates total size in bytes), `SearchVisitor` (finds files by extension).
*   **Traversal**: `FsWalker` manages the recursive Double Dispatch traversal.

## How to Run
1. Put all `.java` files directly into your `src` directory.
2. Compile the files.
3. Run the `Main` class.
4. The console will output the total size of the sample directory tree and a list of found `.java` files.