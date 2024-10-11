public class Array {
    public static int[] getMinMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] min_max = { min, max };

        return min_max;
    }
    public static void main(String[] args) {
        int[] tomb = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] result = getMinMax(tomb);
        int[] result2 = Result.getMinMax2(tomb);
        
        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);
    }    
}
