class ChangeFortToArray extends AO {

    protected String[] StrToArrayChange(String fort) {
        String[] fortArray = new String[fort.length()];

        int lengthCount=0;
        int fortArrayIndex=0;
        String tempNum = null;
        String tempNum2 = null;

        while (lengthCount<fort.length()){
            if (fort.charAt(lengthCount)=='+' || fort.charAt(lengthCount)=='-' || fort.charAt(lengthCount)=='*' || fort.charAt(lengthCount)=='/') {
                fortArray[fortArrayIndex]= tempNum2;
                tempNum=null;
                tempNum2=null;
                fortArrayIndex++;

                fortArray[fortArrayIndex] = String.valueOf(fort.charAt(lengthCount));
                fortArrayIndex++;
                lengthCount++;
                } else if (tempNum!=null) {
                tempNum2=tempNum+String.valueOf(fort.charAt(lengthCount));
                tempNum=tempNum2;
                fortArray[fortArrayIndex]= tempNum2;
                lengthCount++;
            } else {
                tempNum=String.valueOf(fort.charAt(lengthCount));
                tempNum2=tempNum;
                fortArray[fortArrayIndex]= tempNum2;
                lengthCount++;
            }
        }
        return fortArray;
    }
}
