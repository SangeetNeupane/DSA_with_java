# DSA_with_java
BIM 
Searching operation scans an existing list to learn whether a number is in it. We implement this
operation with the Boolean method isInList().
-The method uses a temporary variable tmp.
-List starting from the head node
-The number stored in each is compared to the number being sought.
-Otherwise, tmp is updated to tmp.next.
-After reaching the last node and executing tmp=tmp.next, tmp becomes null which indicates
number is not in the list
- If tmp is not null number is found and isInList() is returns true, Otherwise isInList() returns
false.

