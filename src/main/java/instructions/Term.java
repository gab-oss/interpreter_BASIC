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
        } else {
            this.id = val;
        }

    }

    public Term(FunCall funCall) {

        this.funCall = funCall;

    }

    public Term(Len len) {

        this.len = len;

    }

    public Term(ArtmExpr artmExpr) {

        this.artmExpr = artmExpr;

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
