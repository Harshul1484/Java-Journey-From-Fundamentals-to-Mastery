class halfpyramidnum {
    public static void main(String[] args) {
        int n = 5;

        // outer loop (rows)
        for (int i = 1; i<= n; i++) {

            // inner loop (columns)
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
