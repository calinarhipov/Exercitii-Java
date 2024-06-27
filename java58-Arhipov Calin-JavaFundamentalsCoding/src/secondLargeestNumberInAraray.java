public class secondLargeestNumberInAraray {
    public static void main(String[] args) {
        int[] array = new int[]{21, 34, 2, 4, 5, 2, 455};

        int min = array[0];
        int min2;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; //in variabila min se regaseste elem. minime prin care a trecut forul
            }
        }
        System.out.println("THIS IS THE MINIMUM ELEMENT" + min);
    }
}

