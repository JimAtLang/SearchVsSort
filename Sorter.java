public class Sorter {
    public void selectionSort(int[] data){
        for(int i=0;i<data.length;i++){
            int smallestIndex = i;
            for(int j = i+1; j<data.length; j++){
                if(data[smallestIndex]>data[j]){
                    smallestIndex = j;
                }
            }
            int temp = data[smallestIndex];
            data[smallestIndex] = data[j];
            data[j] = temp;
        }
    }
}
