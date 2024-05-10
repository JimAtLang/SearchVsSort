import java.util.Arrays;
import java.util.Random;
public class Main {
    private Random r;
    int [] data;
    int dataSize;
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        r = new Random();
        dataSize = 100000000;
        int datamax = 10000000;
        int[] data = new int[dataSize];
        for(int i=0;i<dataSize;i++){
            data[i] = r.nextInt(1000000);
        }

        // Sorter srt = new Sorter();
        // srt.selectionSort(data);
        Arrays.sort(data);
        System.out.println("data sorted");
        // for(int n:data){
        //     System.out.print(n + " ");
        // }
        System.out.println(" ");
        Searcher sch = new Searcher();
        int searchTerm = r.nextInt(datamax);
        if(r.nextBoolean()){
            int stPos = r.nextInt(dataSize);
            searchTerm = data[stPos];
            System.out.println("searchTerm is " + searchTerm + " at position " + stPos + " in data");
        } else {
            System.out.println("searchTerm is random number  " + searchTerm);
        }
        System.out.println("searchTerm = " + searchTerm);
        System.out.println(sch.binarySearch(searchTerm, data));
    }
}
