package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for(int i=1;i<list.length;i++);
        int i = 0;
        int temp=list[i];
        int k;
        for(k=i-1;k>=0 && list[k]>temp;k--){
            list[k+1]=list[k];
        }
        list[k+1]=temp;



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        boolean isSorted=false;
        for(int i=1;i<list.length && isSorted;i++) {
            isSorted=true;
            for(int k=0;i<list.length-1;k++) {
               if(list[k]>list[k+1]){
                   int temp=list[k];
                   list [k]=list[k];
                   list[k+1]=temp;
                   isSorted=false;
               }

            }
        }

        
        
        return list;
    }
    

    public int [] mergeSort(int [] array) {
        int[] list = array;
        //implement here
        if (list.length>1) {
            int midpoint = list.length / 2;
            int[] leftHalf = new int[midpoint];
            System.arraycopy(list, 0, leftHalf, 0, midpoint);
            mergeSort(leftHalf);

            int rightHalfLength = list.length - midpoint;
            int[] rightHalf = new int[rightHalfLength];
            System.arraycopy(list, midpoint, rightHalf, 0, rightHalfLength);
            mergeSort(rightHalf);



        }
        return list;

    }

        public void merge ( int[] left, int [] right, int [] fullList) {
        int i=0;
        int r=0;
        int f=0;
        while(1<left.length && r<right.length) {
            if (left[1] < right[r]) ;
            fullList[f++] = left[i++];

            fullList[f++] = right[r++];
        }
          while(1<left.length)
              fullList[f++]=left[i++];

          while(r<right.length)
              fullList[f++]=right[r++];


        }



    public int [] quickSort(int[] array, int i, int i1){
        int [] list = array;
        //implement here
        quickSort(list,0,list.length-1);
        
        

        return list;

    }







    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
