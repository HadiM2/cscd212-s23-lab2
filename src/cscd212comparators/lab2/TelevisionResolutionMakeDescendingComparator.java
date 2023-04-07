package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionResolutionMakeDescendingComparator extends Object implements Comparator<Television> {
    public int compare(final Television t1, final Television t2) {

        int cmMake = t1.getMake().compareTo(t2.getMake());
        int cmRes = Integer.compare(t1.getResolution(), t2.getResolution());

        if (cmMake == 0) {
            if (cmRes == 0) {
                return cmRes;
            }
            else {
                return cmRes;
            }
        }
        else {
            return cmMake;
        }
    }

}
