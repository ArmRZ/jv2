public class BinarySearch {
public static void main(String[] args) {
int[] data = { 2, 4, 5, 7, 8, 9, 12, 14, 17, 19, 22, 25, 27, 28, 33, 37 };
//searching value
int value = 22;
//searching
int position = search(data, value);
System.out.println("Found " + value + " at position " + position);
}
public static int search(int[] data, int value) {
int l = 0, r = data.length;
while (l <= r) {
int m = (l + r)/ 2;
// Check if value is present at mid
if (data[m] == value)
return m;
// If value greater, ignore left half
if (data[m] < value)
l = m + 1;
// If value is smaller, ignore right half
else if(data[m] > value)
r = m - 1;
}
// if we reach here, then element was
// not present
return -1;
}
}