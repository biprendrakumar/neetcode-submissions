class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int r=matrix.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            
            if(matrix[mid][0]<target){
                l=mid+1;
            }
            else if(matrix[mid][0]>target){
                r=mid-1;
            }
            else{
                return true;
            }
        }
        if(r < 0 || r >= matrix.length){
            return false;
        }
        int left=0;
        int right=matrix[r].length-1;
        while(left<=right){
            int m=left+(right-left)/2;
            if(matrix[r][m]==target){
                return true;
            }
            else if(matrix[r][m]>target){
                right=m-1;
            }
            else{
                left=m+1;
            }
        }
        return false;

    }
}
