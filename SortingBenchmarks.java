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
int bubbleExchanges = bubbleSort(integer);

int selectionExchanges = selectionSort(copy);

System.out.println("Bubble Sort Results");
System.out.print("Sorted Array: ");
for (int i = 0; i < integer.length; i++)
  System.out.print(integer[i] + " ");
System.out.println();
System.out.println("Number of Exchanges: " + bubbleExchanges);
System.out.println();

System.out.println("Selection Sort Results");
System.out.print("Sorted Array: ");
for (int i = 0; i < copy.length; i++)
  System.out.print(copy[i] + " ");
System.out.println();
System.out.println("Number of Exchanges: " + selectionExchanges);
System.out.println();


if (bubbleExchanges < selectionExchanges){
  System.out.println("Bubble sort made fewer exchanges.");
} else if (bubbleExchanges > selectionExchanges){
  System.out.println("Selection sort made fewer exchanges.");
} else {
  System.out.println("Both Algorithms performed the exact same number of exchanges.");
}
}//end of main method

//Return methods for BubbleSort and SelectionSort
public static int bubbleSort(int [] integer){
int count = 0;

for (int i = 0; i < integer.length - 1; i++){
    for (int j = 0; j < integer.length - 1; j++){
    
    if (integer[j] > integer[j+1]){
         int temp = integer[j];
         integer[j] = integer[j+1];
         integer[j+1] = temp;
         
         count++;
    }   
  }
}
return count;
}//end of return method for bubbleSort

public static int selectionSort(int [] copy){
int exchangeCount = 0;


for (int i = 0; i < copy.length - 1; i++){
  int min = i;
    for (int j = i + 1; j < copy.length; j++){
    
    if (copy[j] < copy[min]){
       min = j;
    }
    if (min != i){
    int temp = copy[i];
    copy[i] = copy[min];
    copy[min] = temp;
    
    exchangeCount++;    
    }
  }
}
return exchangeCount;
}//end of SelectionSort return method

}//end of public class
