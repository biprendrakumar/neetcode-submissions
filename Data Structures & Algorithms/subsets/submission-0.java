class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        sol(nums,0,list,res);
        return res;
    }
    public static void sol(int[] arr,int index,List<Integer> list,List<List<Integer>> res){
        if(index==arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        sol(arr,index+1,list,res);
        list.add(arr[index]);
        sol(arr,index+1,list,res);
        list.remove(list.size()-1);
    }
}
