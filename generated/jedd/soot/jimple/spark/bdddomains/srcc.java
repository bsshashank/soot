package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class srcc extends Attribute {
    public Numberer numberer() { return Scene.v().getContextNumberer(); }
    
    public static Attribute v() { return srcc.instance; }
    
    private static Attribute instance = new srcc();
    
    public srcc() { super(); }
}