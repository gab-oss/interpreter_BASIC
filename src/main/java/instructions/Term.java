package instructions;

public class Term implements Instruction {

    Integer number;
    String id;
    FunCall funCall;
    Len len;
    ArtmExpr artmExpr;

    public Term(String val, boolean isNumber) {

        if (isNumber) {
            this.number = Integer.parseInt(val);
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

      if (number != null) {
          return number;
      }
      if (id != null) {
          Integer i = (Integer)interpreter.getVar(id);
          if (i == null) {
              throw new RuntimeException("Integer variable not assigned");
          }
          return i;
      }
      if (funCall != null) {
          Integer callResult = (Integer)funCall.execute(interpreter);
//          try {
//              Integer.parseInt(callResult);
//          } catch(NumberFormatException e) {
//              throw new RuntimeException("String used in arithmetic expression");
//          } catch(NullPointerException e) {
//              throw new RuntimeException("String used in arithmetic expression");
//          }

          return callResult;
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
