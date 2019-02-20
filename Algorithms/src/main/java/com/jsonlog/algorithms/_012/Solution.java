package com.jsonlog.algorithms._012;

public class Solution {
    public String intToRoman(int num) {
        String str = "";
        String [] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int [] value = {1000,900,500,400, 100, 90,  50, 40,  10, 9,   5,  4,   1};
        for(int i=0;num!=0;i++){
            while(num >= value[i]){
                num -= value[i];
                str += symbol[i];
            }
        }
        return str;
    }
    /*
        string M[] = {"", "M", "MM", "MMM"};//千
    string C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};//百
    string X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};//十
    string I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};//个
    return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
     */
}
