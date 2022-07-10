class ChangeFormulaToArray extends AO {
    protected String[] changeStrToArray(String formula) {
        String[] formulaArray = new String[formula.length()];

        int lengthCount = 0;
        int formulaArrayIndex = 0;
        String tempNum = null;
        String tempNum2 = null;

        while (lengthCount < formula.length()) {
            if (formula.charAt(lengthCount) == '+' || formula.charAt(lengthCount) == '-' || formula.charAt(lengthCount) == '*' || formula.charAt(lengthCount) == '/') {
                formulaArray[formulaArrayIndex] = tempNum2;
                tempNum = null;
                tempNum2 = null;
                formulaArrayIndex++;

                formulaArray[formulaArrayIndex] = String.valueOf(formula.charAt(lengthCount));
                formulaArrayIndex++;
                lengthCount++;
            } else if (tempNum != null) {
                tempNum2 = tempNum + String.valueOf(formula.charAt(lengthCount));
                tempNum = tempNum2;
                formulaArray[formulaArrayIndex] = tempNum2;
                lengthCount++;
            } else {
                tempNum = String.valueOf(formula.charAt(lengthCount));
                tempNum2 = tempNum;
                formulaArray[formulaArrayIndex] = tempNum2;
                lengthCount++;
            }
        }
        return formulaArray;
    }
}
