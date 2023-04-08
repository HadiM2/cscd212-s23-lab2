package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionScreenSizeComparator extends Object implements Comparator<Television> {
    @Override
    public int compare(final Television t1, final Television t2) {

        if (t1 == null || t2 == null) {
            throw new IllegalArgumentException("null parameter in TelevisionScreenSizeComparator");
        }
        int cmScreenSize = t1.getScreenSize() - t2.getScreenSize();
        //^this works,this doesn't in this case: int cmScreenSize = Integer.compare(t1.getScreenSize, t2.getScreenSize);

        if (cmScreenSize == 0) {
            return cmScreenSize;
        }
        else {
            return cmScreenSize;
        }
        //cmScreenSize == 0 ? return cmScreenSize : return cmScreenSize;

    }
}
