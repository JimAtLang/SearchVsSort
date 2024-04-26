public class Searcher {
    public int binarySearch(int searchTerm, int[] searchSpace){
        for(int i=0;i<searchSpace.length;i++){
            if(searchSpace[i] == searchTerm){
                return i;
            }
        }
        return -1;
    }
}
