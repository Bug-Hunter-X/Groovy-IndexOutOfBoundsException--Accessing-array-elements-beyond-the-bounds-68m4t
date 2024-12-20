# Groovy IndexOutOfBoundsException Bug

This repository demonstrates a common error in Groovy: the `IndexOutOfBoundsException`.  This exception occurs when you try to access an element in a list or array using an index that is out of bounds.

**Bug:** The code attempts to access the element at index 5 in a list of size 5. Since the valid indices are 0-4, this results in the exception.

**Solution:** The solution corrects the index to be within the valid range.  Always ensure the index is less than the size of the list/array to avoid this error.

Feel free to contribute or open issues!