package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class kind extends Attribute {
    public Numberer numberer() { return soot.jimple.toolkits.callgraph.KindNumberer.v(); }
    
    public static Attribute v() { return kind.instance; }
    
    private static Attribute instance = new kind();
    
    public kind() { super(); }
}