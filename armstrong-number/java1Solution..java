class Solution { 
public boolean isArmstrong(int n) {
     int temp = n;
     int count = String.valueOf(n).length();
     int res=  0;
     while(temp>0){
        int rem = temp%10;
        res += Math.pow(rem,count);
        temp = temp/10;
        
     }
     if(res==n) return true;
     return false;

  }
}