package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class obj extends Attribute {
    public Numberer numberer() { return ((BDDPAG) Scene.v().getPointsToAnalysis()).getAllocNodeNumberer(); }
    
    public static Attribute v() { return obj.instance; }
    
    private static Attribute instance = new obj();
    
    public obj() { super(); }
}