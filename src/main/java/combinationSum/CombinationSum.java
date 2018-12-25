/*
 * @Source: https://leetcode-cn.com/problems/combination-sum/
 * @Author: Tian Zhuo
 * @Date: 2018-12-25 13:08:45
 */
package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length == 0) return Collections.emptyList();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(res, candidates, target, new ArrayList<>(), 0);
        return res;
    }
    private void backTrack(List<List<Integer>> res, int[] nums, int target, List<Integer> p, int start){
        if(target == 0){
            res.add(new ArrayList<>(p));
            return;
        }
        for(int i = start; i < nums.length && target >= nums[i]; i++) {
            p.add(nums[i]);
            backTrack(res, nums, target - nums[i], p, i);
            p.remove(p.size() - 1);
        }
        return;
    }
}