package leetcode.easy.arrays;

public class InsertingAtTheStartOfAnArray {
        // First, we will have to create space for a new element.
// We do that by shifting each element one index to the right.
// This will firstly move the element at index 3, then 2, then 1, then finally 0.
// We need to go backwards to avoid overwriting any elements.
    //TODO   for (int i = 3; i >= 0; i--) {
    //TODO     intArray[i + 1] = intArray[i];
    //TODO   }

// Now that we have created space for the new element,
// we can insert it at the beginning.
    //TODO   intArray[0] = 20;
}
