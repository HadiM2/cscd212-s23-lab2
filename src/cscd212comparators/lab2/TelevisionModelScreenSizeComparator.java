package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionModelScreenSizeComparator extends Object implements Comparator<Television> {
    public int compare(final Television t1, final Television t2) {

        if (t1 == null || t2 == null) {
            throw new IllegalArgumentException("null parameter in TelevisionModelScreenSizeComparator");
        }
        int cmModel = t1.getModel().compareTo(t2.getModel());
        int cmScreenSize = t1.getScreenSize() - t2.getScreenSize();
        //^this works,this doesn't in this case: int cmScreenSize = Integer.compare(t1.getScreenSize, t2.getScreenSize);

        if (cmModel == 0) {
            if (cmScreenSize == 0) {
                return cmScreenSize;
            }
            else {
                return cmScreenSize;
            }
        }
        else {
            return cmModel;
        }
    }
}
