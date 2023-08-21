class invertedhalfpyramid {
    public static void main(String[] args) {
        int n = 4;

        // outer loop (rows)
        for (int i = n; i >=1; i--) {

            // inner loop (columns)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
