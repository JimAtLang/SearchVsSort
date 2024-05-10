public class Searcher {
    public int linearSearch(int searchTerm, int[] searchSpace){
        for(int i=0;i<searchSpace.length;i++){
            if(searchSpace[i] == searchTerm){
                return i;
            }
        }
        return -1;
    }
    public int binarySearch(int searchTerm, int[] searchSpace){
        int steps = 0;
        int min = 0;
        int max = searchSpace.length-1;
        while(min+1<max){
            int current = (min+max)/2;
            steps++;
            if(searchSpace[current] == searchTerm){
                System.out.println("took " + steps + " steps");
                return current;
            }
            else if(searchSpace[current]>searchTerm){
                max = current;
            } else {
                min = current;
            }
        }
        System.out.println("took " + steps + " steps");
        return -1;
    }
}
