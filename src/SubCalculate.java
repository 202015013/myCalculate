abstract class SubCalculate extends FindNumber {
    protected void add(String[] formulaArray) {}
    protected void sub(String[] formulaArray) {}
    protected void mul(String[] formulaArray) {}
    protected void dis(String[] formulaArray) {}

    protected void makeIndex(String[] formulaArray, String A) {

        int leftNumIndex;
        int rightNumIndex;

        leftNumIndex = super.findNumberLeft(formulaArray,super.findOpIndex(formulaArray,A));
        rightNumIndex = super.findNumberRight(formulaArray,super.findOpIndex(formulaArray,A));

        switch (A) {
            case "+":
                formulaArray[super.findOpIndex(formulaArray,A)] = String.valueOf(Double.parseDouble(formulaArray[leftNumIndex]) + Double.parseDouble(formulaArray[rightNumIndex]));
            case "-":
                formulaArray[super.findOpIndex(formulaArray,A)] = String.valueOf(Double.parseDouble(formulaArray[leftNumIndex]) - Double.parseDouble(formulaArray[rightNumIndex]));
            case "*":
                formulaArray[super.findOpIndex(formulaArray,A)] = String.valueOf(Double.parseDouble(formulaArray[leftNumIndex]) * Double.parseDouble(formulaArray[rightNumIndex]));
            case "/":
                formulaArray[super.findOpIndex(formulaArray,A)] = String.valueOf(Double.parseDouble(formulaArray[leftNumIndex]) / Double.parseDouble(formulaArray[rightNumIndex]));
                if (Double.parseDouble(formulaArray[rightNumIndex])==0) {
                    System.out.println("error (can't divide to 0)");
                    System.out.print("return only Infinity");
                }
        }

        formulaArray[leftNumIndex]=null;
        formulaArray[rightNumIndex]=null;
    }
}
