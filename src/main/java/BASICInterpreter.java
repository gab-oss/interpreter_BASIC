public class BASICInterpreter {
    public static void main(String[] args) {
        String fileName = args[0] ;

        TokenPrinter tokenPrinter = new TokenPrinter(fileName);
        tokenPrinter.print();

        TreePrinter treePrinter = new TreePrinter(fileName);
        treePrinter.print();
    }
}