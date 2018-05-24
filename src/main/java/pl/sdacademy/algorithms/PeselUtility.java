package pl.sdacademy.algorithms;

public class PeselUtility {
    public boolean isValid(String pesel) {
        if (pesel.length() != 11) {
            return false;
        }
        int[] values = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int ctrSum = 0;
        for (int i = 0; i < 10; i++) {
            ctrSum += Integer.parseInt(pesel.substring(i, i + 1)) * values[i];
        }
        int ctrNum = Integer.parseInt(pesel.substring(10, 11));
        ctrSum %= 10;
        ctrSum = 10 - ctrSum;
        ctrSum %= 10;

        return (ctrSum == ctrNum);
    }


    public boolean isMale(String pesel) {
        if (isValid(pesel)) {
            int genderNum = Integer.parseInt(pesel.substring(9, 10));
            if (genderNum % 2 == 0) {
                return false;
            }else{
                return true;
            }
        }else {
            return false;
        }
    }
}
