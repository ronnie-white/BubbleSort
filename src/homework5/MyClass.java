package homework5;
public class MyClass { 
static void bubbleSort(int[] arr) { 
int n = arr.length; 
int temp = 0; 
for(int i=0; i < n; i++){ 
for(int j=1; j < (n-i); j++){ 
if(arr[j-1] > arr[j]){ 
//swap elements 
temp = arr[j-1]; 
arr[j-1] = arr[j]; 
arr[j] = temp; 
} 

} 
} 

} 
public static void main(String[] args) { 
int arr[] ={37,609,365,20,45,32,5}; 
//array before bubble sort
System.out.println("Array Before Bubble Sort"); 
for(int i=0; i < arr.length; i++){ 
System.out.print(arr[i] + " "); 
} 
