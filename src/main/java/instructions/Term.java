package instructions;

import org.antlr.v4.runtime.tree.TerminalNode;

public class Term implements Instruction {

    String number;
    String id;
    FunCall funCall;
    Len len;
    ArtmExpr artmExpr;

    public Term(String val, boolean isNumber) {

        if (isNumber) {
            this.number = val;
            System.out.println("Term created with number");
        } else {
            this.id = val;
            System.out.println("Term created with id");
        }

    }

    public Term(FunCall funCall) {

        this.funCall = funCall;
        System.out.println("Term created with FunCall");

    }

    public Term(Len len) {

        this.len = len;
        System.out.println("Term created with Len");

    }

    public Term(ArtmExpr artmExpr) {

        this.artmExpr = artmExpr;
        System.out.println("Term created with ArtmExpr");

    }

    @Override
    public Object execute(Interpreter interpreter) {


//        String number;
//        String id;
//        FunCall funCall;
//        Len len;
//        ArtmExpr artmExpr;

      if (number != null) {
          return number;
      }
      if (id != null) {
          return id;
      }
      if (funCall != null) {
          return funCall.execute(interpreter);
      }
      if (len != null) {
          return len.execute(interpreter);
      }
      if (artmExpr != null) {
          return artmExpr.execute(interpreter);
      }
      return null;
    }
}
