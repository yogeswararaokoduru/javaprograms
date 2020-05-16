public class JavaFirstProgram {
    public JavaFirstProgram() {
        /*constructor first stament would be super or this.
         *
         * */
        /*
         * 3 types of variables
         * i)local
         * ii)instance
         * iii)static/class variables
         * */
    }

    int i;
    char j;
    static int k;

    public static void main(String[] args) {
        System.out.println("my first program");

        JavaFirstProgram javaFirstProgram = new JavaFirstProgram();
        System.out.println(JavaFirstProgram.k);
    }
}
