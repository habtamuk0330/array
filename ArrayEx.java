public class ArrayEx {
    public static void main(String[] args) {
        // 1. Declare and instantiate an integer array with space for three elements
        int[] scores = new int[3];

        // 2. Initialize the array with scores
        scores[0] = 85;
        scores[1] = 90;
        scores[2] = 78;

        // 3 & 4. Display each score on a separate line, using length to control the loop
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
