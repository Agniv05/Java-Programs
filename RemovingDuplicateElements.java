import java.util.Arrays;
public class RemovingDuplicateElements {
   static void unique_array(int[] unique_array){
        //Printing all the elements of the array
        System.out.println("Original Array : ");
        System.out.println("_________________");
        for (int i = 0; i < unique_array.length; i++){
            System.out.print(unique_array[i]+"\t");
        }
        
        //calculating the length of the unique_array
        int no_unique_elements = unique_array.length;
        
        //Comparing each element with all other elements
        for (int i = 0; i < no_unique_elements; i++){
            for (int j = i+1; j < no_unique_elements; j++){
                //If any two elements are found equal
                if(unique_array[i] == unique_array[j]){
                    //Replace duplicate element with last unique element
                    unique_array[j] = unique_array[no_unique_elements-1];
                    no_unique_elements--;
                    j--;
                }
            }
        }
        
        //Copying only unique elements of unique_array into array1
        int[] array1 = Arrays.copyOf(unique_array, no_unique_elements);
        //Printing arrayWithoutDuplicates
        System.out.println();
        System.out.println("Array with unique values : ");
        System.out.println("___________________________");
        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i]+"\t");
        }
        System.out.println();
        System.out.println("---------------------------");
       
       
        System.out.println();
        System.out.println("Array with unique values : ");
        System.out.println("___________________________");
        for (int i = 0; i < no_unique_elements; i++){
            System.out.print(unique_array[i]+"\t");
        }
        System.out.println();
        System.out.println("---------------------------");
    }
    
    public static void main(String[] args)
    {       
        //unique_array(new int[] {0, 3, -2, 4, 3, 2});
        int a[]= {0, 3, -2, 4, 3, 2};
        int b[]={10, 22, 10, 20, 11, 22};
        //unique_array(new int[] {10, 22, 10, 20, 11, 22});
        unique_array(a);
        unique_array(b);
        
      }   
}