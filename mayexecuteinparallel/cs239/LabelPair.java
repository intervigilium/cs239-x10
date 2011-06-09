package cs239;

import syntaxtree.*;
import java.util.*;

public class LabelPair {

    public INode left;
    public INode right;

    public LabelPair(INode l, INode r) {
        left = l;
        right = r;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (o instanceof LabelPair) {
                LabelPair l = (LabelPair) o;
                return left.equals(l.left) && right.equals(l.right) ||
                    left.equals(l.right) && right.equals(l.left);
            }
        }
        return false;
    }
}
