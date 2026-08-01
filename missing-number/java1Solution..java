class Solution { public int missingNumber(int[] arr) { 
    int n = arr.length;
    int sum = n*(n+1)/2;
    int ans=  0;
    for(int i=0;i<n;i++){
        ans += arr[i];
    }
    return sum-ans;
    }
}