//arithmetic operations
class AO extends Calculate {
    @Override
    protected void add(String[] formulaArray) {
        if (FindOp(formulaArray, "+") == true) {
            super.add(formulaArray);
            add(formulaArray);
        }
    }
    @Override
    protected void sub(String[] formulaArray) {
        if (FindOp(formulaArray, "-") == true) {
            super.sub(formulaArray);
            sub(formulaArray);
        }
    }
    @Override
    protected void mul(String[] formulaArray) {
        if (FindOp(formulaArray, "*") == true) {
            super.mul(formulaArray);
            mul(formulaArray);
        }
    }
    @Override
    protected void dis(String[] formulaArray) {
        if (FindOp(formulaArray, "/") == true) {
            super.dis(formulaArray);
            dis(formulaArray);
        }
    }
}
