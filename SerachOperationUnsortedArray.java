package ArrayDataStructure;

public class SerachOperationUnsortedArray {

	  static int findElement(int arr[], int lengthofarray, int key) {
		  for(int i=0; i<lengthofarray; i++) 
			  if(arr[i]==key) 
				  return i;
			  
				  return -1;
			 
		  
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] arr = {23,45,34,32,3};
   
   int key = 3;
   
   int lengthofarray = arr.length;
   
   int position = findElement(arr, lengthofarray, key);
   
   if(position==-1) {
	   System.out.println("not find the element");
   }
   else {
	   System.out.println("fount the element "+position);
   }
   
   
	

}}
