public class SelectionSorting {
//print() method
private static void print(int[] a){
System.out.print("[");
for (int i = 0;i < a.length;i++) {
System.out.print(a[i]);
if (i < a.length-1) {
System.out.print(",");
}
}
System.out.print("]\n");

}
public static void selectionSort(int[] data){
int tmp,i,j;
for (i = 0;i < data.length;i++)
for (j = i+1;j < data.length;j++) {
//Swap
if (data[i] > data[j]) {
tmp = data[i];
data[i] = data[j];
data[j] = tmp;
}
}
}
public static void main(String[] args){
int[] data = {77,44,99,66,33,55,88,22};
System.out.println("Selection Sort");
print(data);
selectionSort(data);
print(data);
}
}