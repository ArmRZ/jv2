public class InsertionSorting {
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
//swap() method
private static void swap(int[] a, int i, int j){
int key = a[i];
j = i - 1;
while (j >= 0 && a[j] > key) {
a[j + 1] = a[j];
j = j - 1;
}
a[j + 1] = key;
}
//bubbleSort() method
public static void insertionSort(int[] data){
int n = data.length;
for (int i = 1; i < n; ++i) {
int key = data[i];
int j = i - 1;
while (j >= 0 && data[j] > key) {
data[j + 1] = data[j];
j = j - 1;
}
data[j + 1] = key;
}
}
public static void main(String[] args){
int[] a = {77,44,99,66,33,55,88,22};
System.out.println("Insertion Sort");
print(a);
insertionSort(a);
print(a);
}}