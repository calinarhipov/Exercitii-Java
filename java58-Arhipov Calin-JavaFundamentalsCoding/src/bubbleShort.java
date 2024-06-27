import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class bubbleShort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 34, 23, 33, 12, 90, 45, 23, 22};

        printArray(new int[][]{array});

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
        }
        printArray(new int[][]{array});
        System.out.println("int i");
    }
}
