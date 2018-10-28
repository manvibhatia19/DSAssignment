Insertion sort. Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

If the data is already sorted, Insertion Sort is the best choice for you as it will complete its operation in linear time.

Logic of Insertion sort:

for i -> 1 to input.length
j=i
while(j>0 && input[j]>input[j-1])
if(input[j]<input[j-1])
exchange(input[j],input[j-1],input)
j=j-1
end while
end for

In above case, loop will end just by doing a linear comparison at step 