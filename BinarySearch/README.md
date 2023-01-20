
# Binary Search

Binary search is an efficient algorithm for finding an item from a **sorted** list of items. 

It works by repeatedly dividing in half the portion of the list that could contain the item, until you've narrowed down the possible locations to just one. The basic idea is to compare the middle element of the array with the target value, if the target value matches with middle element, we return the mid index. 

If the target value is less than the middle element, then the target value can only lie in left (lower) half sub-array after the middle element. 

If the target value is greater than the middle element, then the target value can only lie in right (greater) half sub-array before the middle element. 

We then apply the same strategy repeatedly on the half in which the target value lies, until the value is found or the search space is empty.
