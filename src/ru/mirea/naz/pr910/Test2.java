package ru.mirea.naz.pr910;

import static java.lang.Math.pow;

public class Test2 {
    int result=0;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void kSum(int s, int k){
        int sum=0;
        for(int i=1;i<pow(10,k);++i){
            int j=i;
            while(i!=0){
                sum+=i%10;
                i=i/10;
            }
            if(sum==s){
                result++;
            }
            sum=0;
            i=j;
        }
    }
    private int  permutation(String x , int length, int x1, int x0) {
        if(length==0){
            for(int i=0; i<x.length()-1;++i){
                if(x.charAt(i)=='0' && x.charAt(i+1)=='0' ){
                    return 0;
                }

            }
            result++;
            return 0;
        }
        if(x1!=0) {
            permutation(x + "1", length - 1, x1 - 1, x0);
        }
        if(x0!=0) {
            permutation(x + "0", length - 1, x1, x0 - 1);
        }
        return 0;
    }
    public int number(int n){
        if (n == 0){
            return 0;
        }else{
            number(n/10);
            System.out.println(n%10);
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("------------");
        Test2 n1=new Test2();
        int k=2,s=9;
        n1.kSum(s,k);
        System.out.println(n1.getResult());
        n1.setResult(0);
        System.out.println("------------");
        int x1=3,x0=3;
        n1.permutation("",x1+x0,x1,x0);
        System.out.println(n1.getResult());
        n1.setResult(0);
        System.out.println("------------");
        int n=3245;
        n1.number(n);
    }
}
