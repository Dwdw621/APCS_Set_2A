/*
 * Dylan Wang
 * APCS
 * 09/28/2021
 * Problem Set 2-A
 */

class Calculator
{   
    public void display(){
        QuadPrint();
        SlopePrint();
        MidPrint();
        ArithPrint();
        GeoPrint();
    }

    
    
    //Quadratic Formula
    //ax^2 + bx + c
    double a = 1; 
    double b = 5; 
    double c = 6;

    double r1(double a, double b, double c){
        double r1 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        return r1;
    }

    double r2(double a, double b, double c){
        double r2 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        return r2;
    }
    
    void QuadPrint(){
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c
            + " are " + r1(a,b,c) + " and " + r2(a,b,c) + ".\n"); 
    }

    
    
    //Slope Formula
    //First point (ax, ay)
    double ax= 0;
    double ay= 0;

    //Second point (bx, by)
    double bx= 2;
    double by= 3;

    double m(double by,  double ay,  double bx,  double ax){  
        double m = (by-ay)/(bx-ax);
        return m;
    }
    
    void SlopePrint(){
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + ax + ", " + ay + ") and (" + bx + ", " + by + ") has a slope of " + m(by,ay,bx,ax)  + ".\n");
    }

    
    
    //Midpoint Formula
    //First point (cx, cy)
    double cx= 0;
    double cy= 0;

    //Second point (dx, dy)
    double dx= 2;
    double dy= 3;

    double mx(double ax, double bx){
        double mx = (ax+bx)/2; 
        return mx;
    }

    double my(double ay, double by){
        double my = (ay+by)/2;
        return my;
    }

    void MidPrint(){
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + cx + ", " + cy + ") and (" + dx + ", " + dy + ") is (" + mx(ax, bx) + ", " + my(ay,by) + ")"  + ".\n");
    }
    
    
    //Sum of Arithmetic Series
    double a1 = 1; //First term
    double d = 1; //Common difference between each term
    double an = 5; //Number of terms

    double SA (double a1, double d, double an){
        double SA = an/2*(2*a1+(an-1)*d);
        return SA;
    }

    void ArithPrint(){
        System.out.println("SUM OF ARITHMETIC SERIES");
        System.out.println("The sum of the first " + (int)an + " terms of an arithmetic series that starts with " + a1 
            + " and increases by " + d + " is " + SA(a1, d, an)  + ".\n");
    }

    
    
    //Sum of Geometric Series
    double g1 = 3; //First term
    double q = 2; //Common quotient between each term
    double gn = 3; //Number of terms

    double SG(double g1, double q, double gn){
        double SG = (g1*(1- Math.pow(q,gn)))/(1-q);
        return SG;
    }

    void GeoPrint(){
        System.out.println("SUM OF A FINITE ARITHMETIC SERIES");
        System.out.println("The sum of the first " + (int)gn + " terms of a finite geometric series that starts with " + g1 
            + " and increases by a rate of " + q + " is " + SG(g1, q, gn)  + ".\n");
    }
} 
