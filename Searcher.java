public class Searcher {
    public int linearSearch(int searchTerm, int[] searchSpace){
        for(int i=0;i<searchSpace.length;i++){
            if(searchSpace[i] == searchTerm){
                return i;
            }
        }
        return -1;
    }
}
