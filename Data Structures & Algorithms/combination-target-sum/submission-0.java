class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        sol(nums,target,0,list,res);
        return res;
    }
    public static void sol(int[] arr,int t,int index,List<Integer> list,List<List<Integer>> res){
        if(t==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(t<0 || index==arr.length){
            return;
        }
        list.add(arr[index]);
        sol(arr,t-arr[index],index,list,res);
        list.remove(list.size()-1);
        sol(arr,t,index+1,list,res);
    }
}
