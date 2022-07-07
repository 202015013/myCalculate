class Calculate extends SubCalculate {
    @Override
    protected void add(String[] formulaArray) {
        makeIndex(formulaArray,"+");
    }
    @Override
    protected void sub(String[] formulaArray) {
        makeIndex(formulaArray,"-");
    }
    @Override
    protected void mul(String[] formulaArray) {
        makeIndex(formulaArray,"*");
    }
    @Override
    protected void dis(String[] formulaArray) {
        makeIndex(formulaArray,"/");
    }
}
