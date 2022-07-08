package ru.ac.uniyar.mf.summer;

public class fraction {
    private int m, n;
    fraction(){
        m = 0;
        n = 1;
    }
    fraction(int _m, int _n){
        m = _m;
        n = _n;
    }
    public int getM() {return m;}
    public int getN() {return n;}

    public void setM(int m) { this.m = m; }

    public void setN(int n) { this.n = n; }

    public fraction addition(fraction num1, fraction num2){
        fraction ans = new fraction();
        ans.m = num1.m * num2.n + num1.n * num2.m;
        ans.n = num2.n * num2.n;
        return ans;
    }
    public fraction subtraction(fraction num1, fraction num2){
        fraction ans = new fraction();
        ans.m = num1.m * num2.n - num1.n * num2.m;
        ans.n = num2.n * num2.n;
        return ans;
    }
    public fraction multiplication(fraction num1, fraction num2){
        fraction ans = new fraction();
        ans.m = num1.m * num2.m;
        ans.n = num1.n * num2.n;
        return ans;
    }
    public fraction division(fraction num1, fraction num2){
        fraction ans = new fraction();
        ans.m = num1.m * num2.n;
        ans.n = num1.n * num2.m;
        return ans;
    }
    public void fraction_reduction(fraction num){
        int g_c_d = gcd(num.n, num.m);
        num.m = num.m / g_c_d;
        num.n = num.n / g_c_d;
    }
    public void negative_fraction(fraction num){
        if (num.n < 0){
            num.m = num.m * (-1);
            num.n = num.n * (-1);
        }
    }
    public static int gcd(int num1, int num2){
        if (num2 == 0)
            return num1;
        return gcd(num2, num1 % num2);
    }
}
