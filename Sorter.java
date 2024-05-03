public class Sorter {
    public void selectionSort(int[] data){
        int steps = 0; // makes the variable where we count the steps
        for(int i=0;i<data.length;i++){
            int smallestIndex = i;
            for(int j = i+1; j<data.length; j++){
                steps++; // counts the number of loops that run
                if(data[smallestIndex]>data[j]){
                    smallestIndex = j;
                }
            }
            int temp = data[smallestIndex];
            data[smallestIndex] = data[i];
            data[i] = temp;
            // tells me how many loops ran
        }
        System.out.println("The sort method took " + steps + " steps");

    }
}
