abstract class SubCalculate extends FindNumber {
    protected void add(String[] fortArray) {}
    protected void sub(String[] fortArray) {}
    protected void mul(String[] fortArray) {}
    protected void dis(String[] fortArray) {}

    protected void makeIndex(String[] fortArray, String A) {

        int leftNumIndex;
        int rightNumIndex;

        leftNumIndex = super.FindNumberLeft(fortArray,super.FindOpIndex(fortArray,A));
        rightNumIndex = super.FindNumberRight(fortArray,super.FindOpIndex(fortArray,A));

        switch (A) {
            case "+":
                fortArray[super.FindOpIndex(fortArray,A)]=String.valueOf(Double.parseDouble(fortArray[leftNumIndex])+Double.parseDouble(fortArray[rightNumIndex]));
            case "-":
                fortArray[super.FindOpIndex(fortArray,A)]=String.valueOf(Double.parseDouble(fortArray[leftNumIndex])-Double.parseDouble(fortArray[rightNumIndex]));
            case "*":
                fortArray[super.FindOpIndex(fortArray,A)]=String.valueOf(Double.parseDouble(fortArray[leftNumIndex])*Double.parseDouble(fortArray[rightNumIndex]));
            case "/":
                fortArray[super.FindOpIndex(fortArray,A)]=String.valueOf(Double.parseDouble(fortArray[leftNumIndex])/Double.parseDouble(fortArray[rightNumIndex]));
        }

        fortArray[leftNumIndex]=null;
        fortArray[rightNumIndex]=null;
    }
}
