class FindNumber extends FindOperator {
    int FindNumberLeft(String[] fortArray, int indexOfOperator) {
        int indexCount = 1;

        while (true) {
            if (indexOfOperator-indexCount >= 0 && fortArray[indexOfOperator - indexCount] == null) {
                indexCount++;
            } else {
                break;
            }
        }
        return indexOfOperator-indexCount;
    }

    protected int FindNumberRight(String[] fortArray, int indexOfOperator) {
        int indexCount = 1;

        while (true) {
            if (indexOfOperator+indexCount<=fortArray.length-1 && fortArray[indexOfOperator + indexCount] == null) {
                indexCount++;
            } else {
                break;
            }
        }
        return indexOfOperator+indexCount;
    }
}
