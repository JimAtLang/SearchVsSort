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
        dataSize = 10000;
        int[] data = new int[dataSize];
        for(int i=0;i<dataSize;i++){
            data[i] = r.nextInt(1000000);
        }

        Sorter srt = new Sorter();
        srt.selectionSort(data);
        // for(int n:data){
        //     System.out.print(n + " ");
        // }
        // System.out.println(" ");

        Searcher sch = new Searcher();
        int position = sch.linearSearch(12348, data);
        Sorter st = new Sorter();
        st.selectionSort(data);
        // System.out.println("The value 12348 is at position " + position);
    }
}
