package com.jsonlog.algorithms._069;

public class Solution {
    public int mySqrt(int x) {
        int l=1,r=x;
        while (l<=r) {
            int m=(l+r)/2;
            if (m>x/m) r=m-1;
            else l=m+1;
        }
        return r;
    }
}
