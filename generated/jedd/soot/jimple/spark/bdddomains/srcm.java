package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class srcm extends Attribute {
    public Numberer numberer() { return Scene.v().getMethodNumberer(); }
    
    public static Attribute v() { return srcm.instance; }
    
    private static Attribute instance = new srcm();
    
    public srcm() { super(); }
}