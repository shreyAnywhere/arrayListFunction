public class ArrayListFunction {

    int[] arr;
    int currSize = 0;
    int totalSize = 1;

    public ArrayListFunction(){
        arr = new int[1];
    }

    public void increaseSize(){
        int[] biggerArr = new int[2 * arr.length];

        for(int i=0;i<currSize;i++)
            biggerArr[i] = arr[i];
        arr = biggerArr;
        totalSize = totalSize * 2;
    }

    public void add(int e){
        if(currSize == totalSize)
            increaseSize();

        arr[currSize++] = e;
    }

    public void printArray() {
        for(int i=0;i<currSize;i++)
            System.out.print(arr[i] + " ");
    }
}
