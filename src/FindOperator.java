class FindOperator {
    int count=0;
    int result=0;
    protected int FindOpIndex(String[] fortArray,String A) {
        while (count<=fortArray.length-2){
            if (fortArray[count]!=null && fortArray[count].equals(A)) {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
    protected boolean FindOp(String[] fortArray, String A) {

        result = 0;
        count=0;

        while (count<=fortArray.length-1) {
            if (fortArray[count]!=null && fortArray[count].equals(A)) {
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
