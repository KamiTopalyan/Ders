public class Arrays {
    public static void main(String[] args) {
        int[][] intArray;
        intArray = new int[5][5];
        intArray[0][1] = 10;
        intArray[1][1] = 20;
        intArray[2][1] = 10;
        intArray[3][1] = 30;
        intArray[4][1] = 80;

        intArray[0][2] = 15;
        intArray[1][2] = 50;
        intArray[2][2] = 60;
        intArray[3][2] = 70;
        intArray[4][2] = 10;

        intArray[0][1] = 20;
        for (int i = 0; i < intArray.length; i++) {
        System.out.println("Element at index " + i + " : " + intArray[i][1]);
        }
    }
}
