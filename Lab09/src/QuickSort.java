public class QuickSort {
//print() method
private static void print(int[] a){
System.out.print("[");
for (int i = 0;i < a.length;i++) {
System.out.print(a[i]);
if (i < a.length-1) {
System.out.print(",");
}
}
System.out.print("]");
System.out.println();
}
private static void qSort(int[] a, int low, int high) {
if (low < high)
{
// pi is partitioning index, arr[p]
// is now at right place
int pi = partition(a, low, high);
// Separately sort elements before
// partition and after partition
qSort(a, low, pi - 1);
qSort(a, pi + 1, high);
}
}
private static int partition(int[] a, int low, int high) {
// pivot
int pivot = a[high];
// Index of smaller element and
// indicates the right position
// of pivot found so far
int i = (low - 1);
for(int j = low; j <= high - 1; j++)
{
// If current element is smaller
// than the pivot
if (a[j] < pivot)
{
// Increment index of
// smaller element
i++;
swap(a, i, j);
}
}
swap(a, i + 1, high);

return (i + 1);
}
/* The main function that implements QuickSort
arr[] --> Array to be sorted,
low --> Starting index,
high --> Ending index
*/
public static void swap(int[] a, int i, int j) {
int temp = a[i];
a[i] = a[j];
a[j] = temp;
}
public static void main(String[] args){
int[] data = {77,44,99,66,33,55,88,22};
System.out.println("Quick Sort");
print(data);
qSort(data, 0, data.length- 1);
print(data);
}
}