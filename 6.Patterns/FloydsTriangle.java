class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;

        // outer loop (rows)
        for (int i = 1; i<=n; i++) {

            // inner loop (columns)
            for (int j = 1; j<=i; j++) {
                System.out.print(number+ " ");
                number++; //number = number + 1
            }
            System.out.println();
        }
    }
}
