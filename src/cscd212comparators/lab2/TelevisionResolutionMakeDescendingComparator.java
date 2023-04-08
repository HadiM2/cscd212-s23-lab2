package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionResolutionMakeDescendingComparator extends Object implements Comparator<Television> {
    public int compare(final Television t1, final Television t2) {

        if (t1 == null || t2 == null) {
            throw new IllegalArgumentException("null parameter in TelevisionResolutionMakeDescendingComparator");
        }
        int cmMake = t2.getMake().compareTo(t1.getMake());
        int cmRes = t2.getResolution() - t1.getResolution();
        //^ works, this doesn't in this case: int cmRes = Integer.compare(t2.getResolution(), t1.getResolution());

        if (cmRes == 0) {
            if (cmMake == 0) {
                return cmMake;
            }
            else {
                return cmMake;
            }
        }
        else {
            return cmRes;
        }
    }


}
