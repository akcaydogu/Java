public class Triangle {
    void triangle() {
//        System.out.print("\t\t\t\t*\n\t\t\t*\t*\n\t\t*\t*\t*\n\t*\t*\t*\t*\n*\t*\t*\t*\t*\n");
        String triangle = "";
        for ( int i = 5; i > 0; i-- ) {
            for (int j = i; j > 0; j-- ) {
                triangle = triangle + "*\t";
            }
            System.out.println(triangle);
            triangle="";
        }
    }
}
