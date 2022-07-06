//arithmetic operations
class AO extends Calculate {
    @Override
    protected void add(String[] fortArray) {
        if (FindOp(fortArray, "+") == true) {
            super.add(fortArray);
            add(fortArray);
        }
    }
    @Override
    protected void sub(String[] fortArray) {
        if (FindOp(fortArray, "-") == true) {
            super.sub(fortArray);
            sub(fortArray);
        }
    }
    @Override
    protected void mul(String[] fortArray) {
        if (FindOp(fortArray, "*") == true) {
            super.mul(fortArray);
            mul(fortArray);
        }
    }
    @Override
    protected void dis(String[] fortArray) {
        if (FindOp(fortArray, "/") == true) {
            super.dis(fortArray);
            dis(fortArray);
        }
    }
}
