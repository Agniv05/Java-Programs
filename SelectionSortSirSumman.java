public class SelectionSortSirSumman
{
   public static void main(String args[])
   {
      int array[] = {100, 20, 250, 306, 96, 57};
      int size = array.length;
      for (int i = 0 ;i< size-1; i++)
      {
         int min = i;
         for (int j = i+1; j<size; j++)
         {
            if (array[j] < array[min])
            {
                min = j;
            }
         }
         int temp = array[min];
         array[min] = array[i];
         array[i] = temp;
      }
      for (int i = 0 ;i< size; i++)
      {
         System.out.print(" "+array[i]);
      }
   }  
}