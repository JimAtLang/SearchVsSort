public class Searcher {
    int steps = 0;
    public int linearSearch(int searchTerm, int[] searchSpace){
        for(int i=0;i<searchSpace.length;i++){
            steps++;
            if(searchSpace[i] == searchTerm){
                System.out.println("The search method took "+ steps + " steps");
                return i;
            }
        }
        System.out.println("The search method took "+ steps + " steps");
        return -1;
    }
}
