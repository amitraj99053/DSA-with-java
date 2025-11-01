# AI Agent Instructions for DSA-with-java

This repository contains Java implementations of Data Structures and Algorithms (DSA), coding problems, and programming patterns. Follow these guidelines when working with this codebase:

## Project Structure

The codebase is organized into distinct categories:
- `Array/` & `Array 2D/` - Array manipulation problems
- `Basic Sorting Algorithms/` - Implementation of sorting algorithms
- `Basics/` - Fundamental Java programming concepts
- `Function/` - Function/method implementations and examples
- `Pattern printing/` - Various pattern printing problems
- `LeetCode Qn/` - LeetCode problem solutions
- `GFG Practice/` - GeeksForGeeks problem solutions
- `TCS CodeVita/` - TCS CodeVita competition problems

## Code Conventions

1. **File Naming**:
   - Class files use PascalCase matching class name (e.g., `ArrayQn1.java`, `Pattern3.java`)
   - Problem-specific files include question number (e.g., `leetCodeQn6.java`, `Function9.java`)

2. **Input Handling**:
   ```java
   Scanner in = new Scanner(System.in);
   // ... use scanner
   in.close(); // Always close Scanner when done
   ```

3. **Pattern Printing**:
   - Include pattern visualization in comments
   - Use nested loops with clear variable names (`i` for rows, `j` for columns)
   - Example in `Pattern5.java`, `Pattern9.java`

4. **Problem Solutions**:
   - Include problem description in comments
   - Use meaningful method names describing the solution
   - Break down complex logic into helper methods
   - Example: See `Array/Qn1.java` for duplicate number tracking

## Common Utilities

1. **Math Operations**:
   - Use `Math` class methods for mathematical operations
   - Example implementations in `Function23.java` and `mathClass.java`

2. **Array Operations**:
   - Use `Arrays` utility class for array manipulations
   - Example: `Arrays.toString()` for printing arrays

## Testing & Debugging

1. Each problem solution includes a `main` method with test cases
2. Use descriptive print statements for debugging
3. Include example inputs/outputs in comments

## Problem Categories Reference

Key example files for common patterns:
- Basic Array: `Array/ArrayQn1.java`
- 2D Arrays: `Array 2D/Matrices.java`
- Pattern Printing: `Pattern printing/Pattern4.java` (hollow rectangle)
- Math Problems: `Function/Function9.java` (factorial)
- Sorting: See `Basic Sorting Algorithms/` directory

## Development Workflow

1. Choose appropriate directory based on problem type
2. Follow existing naming conventions
3. Include problem description in comments
4. Implement solution with proper input handling
5. Add test cases in main method
6. Test with multiple inputs before finalizing