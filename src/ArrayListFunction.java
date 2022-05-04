public class ArrayListFunction {

    int[] arr;
    int currSize = 0;
    int totalSize = 1;

    public ArrayListFunction(){
        arr = new int[1];
    }

    public void increaseSize(){
        int[] biggerArr = new int[2 * arr.length];

        if (currSize >= 0) System.arraycopy(arr, 0, biggerArr, 0, currSize);
        arr = biggerArr;
        totalSize = totalSize * 2;
    }

    public void add(int e){
        if(currSize == totalSize)
            increaseSize();

        arr[currSize++] = e;
    }

    public void remove(int index){

        try{
            if(index >= currSize) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of your array's current size.");
            }
        }catch (Exception e){
            System.out.println(e);
            return;
        }

        if (currSize - 1 - index >= 0) System.arraycopy(arr, index + 1, arr, index, currSize - 1 - index);
        currSize--;
    }

    public void printArray() {
        for(int i=0;i<currSize;i++)
            System.out.print(arr[i] + " ");
    }

    @Override
    public String toString(){
        String finalString = "";
        for(int i=0;i<currSize;i++)
            finalString += arr[i];

        return finalString;
    }
}
