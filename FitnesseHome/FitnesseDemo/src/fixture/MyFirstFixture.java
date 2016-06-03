package fixture;

import math.MyMath;
import fit.ColumnFixture;

public class MyFirstFixture extends ColumnFixture {
    
    public int a;
    public int b;
    
    public int add() {
        int result;
        result = MyMath.sum(a,b);
        return result;
    }
    
    public float average() {
        float result;
        result = MyMath.average(a,b);
        return result;
    }
}
