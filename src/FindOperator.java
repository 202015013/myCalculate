class FindOperator {
    int count=0;
    int result=0;
    protected int FindOpIndex(String[] formulaArray,String A) {
        while (count<=formulaArray.length-2){
            if (formulaArray[count]!=null && formulaArray[count].equals(A)) {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
    protected boolean FindOp(String[] formulaArray, String A) {

        result = 0;
        count=0;

        while (count<=formulaArray.length-1) {
            if (formulaArray[count]!=null && formulaArray[count].equals(A)) {
                result++;
                break;
            } else {
                count++;
            }
        }
        if (0<result) {
            return true;
        } else {
            return false;
        }
    }
}
