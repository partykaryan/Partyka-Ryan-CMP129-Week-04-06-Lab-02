public class SortingBenchmarks {

public static void main(String[] args) {
    
//Integer Array created to store 20 values   
int integer [] = { 23, 37, 16, 81, 94, 54, 11, 73, 41,
 33, 6, 19, 26, 98, 38, 42, 63, 61, 59, 70 };
    
int copy [] = new int [integer.length];

//for loop to copy elements of integer array 
for (int i = 0; i < integer.length; i++){
copy[i] = integer[i];
}

//passing copy array into bubbleSort method
int count = 0;
count = bubbleSort(copy);

int exchangeCount = 0;
exchangeCount = selectionSort(copy);

System.out.println("Bubble Sort Results");
System.out.println("Sorted Array: ");
System.out.println("Number of Exchanges: " + count);

System.out.println();

System.out.println("Selection Sort Results");
System.out.println("Sorted Array: ");
System.out.println("Number of Exchanges: " + exchangeCount);
}//end of main method


//Return methods for BubbleSort and SelectionSort
public static int bubbleSort(int [] copy){
int count = 0;

for (int i = 0; i < copy.length; i++){
    for (int j = 0; j < copy.length - 1; j++){
    
    if (copy[j] < copy[j+1]){
         int temp = copy[j];
         copy[j] = copy[j+1];
         copy[j+1] = temp;
    
    count++;
    }   
  }
}
return count;
}//end of return method for bubbleSort

public static int selectionSort(int [] copy){
int exchangeCount = 0;

for (int i = 0; i < copy.length; i++){
    for (int j = 0; j < copy.length - 1; j++){
    
    if (copy [j] > copy[j+1]){
        int temp = copy[j];
        copy [j+1] = copy [j];
        copy [j+1] = temp;
    }
 }
  exchangeCount++;
}
return exchangeCount;
}//end of SelectionSort return method

}//end of public class
