package soot.jimple.spark.bdddomains;

import jedd.*;

public class H2 extends PhysicalDomain {
    public int bits() { return 16; }
    
    public static PhysicalDomain v() { return H2.instance; }
    
    private static PhysicalDomain instance = new H2();
    
    public H2() { super(); }
}