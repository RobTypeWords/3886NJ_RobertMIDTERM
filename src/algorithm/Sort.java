package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * []Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();      //start time
        int [] list = array;

        for(int j=0; j<array.length-1; j++){                //for outer
            int min = j;
            for(int i=j+1; i<array.length; i++) {           //for inner
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];              //swap here
            array[min] = array[j];              //swap here
            array[j] = temp;                    //swap here
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;     //check execution time
        this.executionTime = executionTime;
        return list;
    }




    public int[] insertionSort(int [] array){                   //Done
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int j;
        int i;
        int temp;
        int size = list.length;
        for(i=1;i<size;i++){
            temp =list[i];
            j=i;
            while (j>0 && list[j-1]>temp){
                list[j]=list[j-1];
                j--;
            }
            list[j]=temp;
        }
        for (i=0;i<list.length;i++){
            System.out.println(list[i]+"");
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){              // DONE
        int [] list = array;
        //implement here
        int temp =0;
        int size = list.length;
        for (int a=0; a < size; a++){
            for (int b=1; b < size-a; b++){
                    if (list[b-1] > list[b]){
                        temp= list[b-1];
                        list[b-1] =list[b];
                        list[b] = temp;
                    }
            }
        }
                final long starTime = System.currentTimeMillis();
                final long endTime = System.currentTimeMillis();
                final long executionTime = endTime - starTime;
                this.executionTime = executionTime;

                return list;
            }


             public int [] mergeSort(int [] array, int Left, int Right){ //Done
            final long startTime = System.currentTimeMillis();
               int [] list = array;
               if (Left <= Right){
                   int Middle = (Left + Right)/2;
                   mergeSort(list, Left,Right);
                   mergeSort(list, Middle +1,Right);
               }
                 final long endTime = System.currentTimeMillis();
                 final long executionTime =endTime-startTime;
                 this.executionTime = executionTime;
             return list;
            }





            public int [] quickSort(int [] array, int L, int R){        //Done
             int [] list = array;
            //implement here

                if(L <= R){
                    quickSort(list, L,R);
                    quickSort(list, 1,R );
                }
            return list;
            }

            public int [] heapSort(int [] array){
              int [] Listt = array;
            //implement here
                final long startTime = System.currentTimeMillis();

                //implement here
                Sort sorter =new Sort();
               // sorter.sort(Listt);                              //EROOR
                //sorter.printArray(Listt);                        //ERROR
                int a, b;
                final long endTime = System.currentTimeMillis();
                final long executionTime = endTime-startTime;
                this.executionTime = executionTime;
                return Listt;



            return Listt;
            }


            public int [] bucketSort(int [] array){             //DONE!!
              int [] list = array;
                final long startTime =System.currentTimeMillis();
            //implement here
                int maxValue =0;
                int[]a = new int[maxValue+1];
                int[] sortedArray = new int[array.length];
                for(int i=0;i<array.length;i++){
                    a[array[i]]++;
                }
                int b =0;
                for(int i=0;i<a.length;i++)
                    for (int j=0;j<a[i];j++)
                        sortedArray[b++] =i;
                final long endtime =System.currentTimeMillis();
                final long executionTime = endtime -startTime;
                this.executionTime = executionTime;



            return list;
            }

            public int[] shellSort ( int[] array){
                int[] list = array;
                //implement here

                                                                 // ??????????

                return list;
            }

            public static void printSortedArray ( int[] array){
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            }

        }