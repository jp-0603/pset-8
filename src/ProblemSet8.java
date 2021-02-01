import java.util.Arrays;
import java.util.List;

public class ProblemSet8 {

    public boolean common(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return false;
        } else {
            if ((a[a.length-1] == b[b.length-1]) || (a[0] == b[0])) {
                return true;
            } else {
                return false;
            }
        }
    }

    public int[] middleMan(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length % 2 != 1 || b.length % 2 != 1) {
            return null;
        } else {
            int[] answer = new int[] {a[a.length/2], b[b.length/2]};
            return answer;
        }
    }

    public int[] bigger(int[] a, int[] b) {
        int sum1 = 0;
        int sum2 = 0;

        if (a == null || b == null) {
            return null;
        } else {
            for (int i = 0; i < a.length; i++) {
                sum1 += a[i];
            }
            for (int k = 0; k < b.length; k++) {
                sum2 += b[k];
            } if (sum1 >= sum2) {
                return a;
            } else {
                return b;
            }
        }
    }

    public int[] doubleMiddle(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length % 2 != 0 || b.length % 2 != 0) {
            return null;
        } else {
            int[] result = new int[] {a[a.length/2-1], a[a.length/2], b[b.length/2-1], b[b.length/2]};
            return result;
        }
    }

    public int[] swapMe(int[] a) {
        if (a == null) {
            return null;
        } else {
            int n = a[a.length-1];
            a[a.length-1] = a[0];
            a[0] = n;
            return a;
        }
    }

    public int[] threeProng(int[] a) {
        if (a == null || a.length == 0 || a.length % 2 != 1) {
            return null;
        } else {
            int[] result = new int[] {a[0], a[a.length/2], a[a.length-1]};
            return result;
        }
    }

    public int headHoncho(int[] a) {
        if (a == null || a.length == 0) {
            return -1;
        } else {
            int biggest = 0;
            for (int k = 0; k < a.length; k++) {
                if (a[k] < 0) {
                    return -1;
                } else if (a[k] > biggest) {
                    biggest = a[k];
                }
            }
            return biggest;
        }
    }

    public boolean tippingPoint(int[] a, int threshold) { 
        if (a == null) {
            return false;
        } else {
            int arraySum = 0;
            for (int j = 0; j < a.length; j++) {
                arraySum += a[j];
            } if (arraySum > threshold) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static String halfway(int[] a) {
        int sum1 = 0;
        int sum2 = 0;

        if (a == null || a.length == 0 || a.length % 2 != 0) {
            return null;
        }

        for (int i = 0; i < a.length/2; i++) {
            sum1 += a[i];
        }

        for (int j = (a.length/2); j < a.length; j++) {
            sum2 += a[j];
        } if (sum1 > sum2) {
            return "LEFT";
        } else {
            return "RIGHT";
        }
    }

    public int[] sequential(int[] a, int[] b) {
        if (a == null || b == null || (a.length + b.length < 3)) {
            return null;
        } else {
            int length = a.length;
            int[] result = new int[3];
            int remaining = 3 - length;
            for (int i = 0; i < length; i++) {
                result[i] = a[i];
            } if (remaining > 0) {
                for (int k = 0; k < remaining; k++) {
                    result[k + length] = b[k];
                }
            }
            return result;
        }
    }
}