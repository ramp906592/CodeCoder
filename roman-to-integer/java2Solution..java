class Solution { public int romanToInt(String s) { 
    int sum =0;
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);

        if(c =='I') sum += 1;
        if(c=='V') sum += 5;
        if(c=='X') sum += 10;
        if(c=='L') sum += 50;
        if(c=='C') sum += 100;
        if(c=='D') sum += 500;
        if(c=='M') sum += 1000;

        if(i>0){
            char prev = s.charAt(i-1);
            if((c =='V' ||c=='X' ) && prev == 'I') sum -= 2;
            if((c =='L' ||c=='C' ) && prev == 'X') sum -= 20;
            if((c =='D' ||c=='M' ) && prev == 'C') sum -= 200;
        }
     }
       return sum;
    }
 }