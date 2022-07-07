class FindNumber extends FindOperator {
    int FindNumberLeft(String[] formulaArray, int indexOfOperator) {
        int indexCount = 1;

        while (true) {
            if (indexOfOperator-indexCount >= 0 && formulaArray[indexOfOperator - indexCount] == null) {
                indexCount++;
            } else {
                break;
            }
        }
        return indexOfOperator-indexCount;
    }

    protected int FindNumberRight(String[] formulaArray, int indexOfOperator) {
        int indexCount = 1;

        while (true) {
            if (indexOfOperator+indexCount<=formulaArray.length-1 && formulaArray[indexOfOperator + indexCount] == null) {
                indexCount++;
            } else {
                break;
            }
        }
        return indexOfOperator+indexCount;
    }
}
