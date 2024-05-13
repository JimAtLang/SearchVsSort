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
    public int binarySearch(int searchTerm, int[] searchSpace){
        int steps = 0; // diagnostic only
        int min = 0; // first item
        int max = searchSpace.length -1; // last item
        while(min+1 < max){
            steps ++;
            int current = (min + max) / 2; // in Java int/int = int so it'll round down
            if(searchSpace[current] == searchTerm){
                System.out.println("The search took " + steps + " steps");
                return current; //current is the index where searchTerm is now
            } else if(searchSpace[current] > searchTerm){
                max = current; //searchTerm is left of current
            } else {
                min = current; // searchTerm is right of current
            }
        }
        System.out.println("The search took " + steps + " steps");
        return -1;
    }
}
