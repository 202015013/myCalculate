class Calculate extends SubCalculate {
    @Override
    protected void add(String[] fortArray) {
        makeIndex(fortArray,"+");
    }
    @Override
    protected void sub(String[] fortArray) {
        makeIndex(fortArray,"-");
    }
    @Override
    protected void mul(String[] fortArray) {
        makeIndex(fortArray,"*");
    }
    @Override
    protected void dis(String[] fortArray) {
        makeIndex(fortArray,"/");
    }
}
