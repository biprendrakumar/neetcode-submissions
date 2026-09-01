

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);

        List<Integer> list = new ArrayList<>();

        sol(candidates, target, 0, list, res);

        return res;
    }

    public static void sol(int[] arr, int t, int idx,
                           List<Integer> list,
                           List<List<Integer>> res) {

        if (t == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i < arr.length; i++) {

            // Skip duplicates
            if (i > idx && arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] > t) {
                break;
            }

            // Take
            list.add(arr[i]);

            // i + 1 because every element can be used only once
            sol(arr, t - arr[i], i + 1, list, res);

            // Backtrack
            list.remove(list.size() - 1);
        }
    }
}