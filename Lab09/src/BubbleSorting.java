public class BubbleSorting {
//print() method
private static void print(int[] a){
for (int i = 0; i < a.length; i++) {
System.out.print(a[i]+" ");
}
System.out.println(" ");
}
//bubbleSort() method
public static void bubbleSort(int[] a, int i, int j){
int n = a.length;
for (i = 0; i < n-1; i++)
for (j = 0; j < n-i-1; j++)
if (a[j] > a[j+1])
{
// swap arr[j+1] and arr[j]
int temp = a[j];
a[j] = a[j+1];
a[j+1] = temp;
}
}
public static void main(String[] args){
int[] a = {77,44,99,66,33,55,88,22};
System.out.println("Bubble Sort");
print(a);
bubbleSort(a, 0, 0);
print(a);
}
}




