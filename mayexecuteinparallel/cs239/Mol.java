package cs239;

import syntaxtree.*;
import java.util.*;

public class Mol {
    public HashSet<LabelPair> m;
    public HashSet<INode> o;
    public HashSet<INode> l;

    public Mol() {
        this.m = new HashSet<LabelPair>();
        this.o = new HashSet<INode>();
        this.l = new HashSet<INode>();
    }

    public Mol(HashSet<LabelPair> m, HashSet<INode> o, HashSet<INode> l) {
        this.m = m;
        this.o = o;
        this.l = l;
    }
}
