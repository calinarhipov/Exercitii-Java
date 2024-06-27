public class minElementOfArray {
    public static void main(String[] args) {
        int array[] = new int[]{32, 45, 55, 23, 2, 6, 100};
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("Min value is:" + minValue);
        System.out.println("Min index is:" + minIndex);
    }
}
