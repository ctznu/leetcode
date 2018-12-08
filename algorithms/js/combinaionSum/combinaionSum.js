/*
 * @Source: https://leetcode-cn.com/problems/combination-sum
 * @Author: Tian Zhuo
 * @Date: 2018-12-08 16:34:06
 */
/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function(candidates, target) {
    candidates.sort((a, b) => a - b);
    let result = [];
    let temp = [];
    let sum = 0;
    DFS(candidates, sum, 0, target, temp, result);
    return result;

};
var DFS = function(candidates, sum, level, target, temp, result) {
    if(sum > target) return;
    if(sum == target){
        result.push(temp.slice());
        return;
    }
    for(let i = level; i < candidates.length; i++) {
        sum += candidates[i];
        temp.push(candidates[i]);
        DFS(candidates, sum, i, target, temp, result);
        temp.pop();
        sum -= candidates[i];
    }
}

// solution 2 (optimized)
var combinationSum1 = function (candidates, target) {
    if (candidates.length === 0) return []
    let res = []
    candidates.sort((a, b) => {
      return a - b
    })
    backTrack(candidates, target, [], 0)
    return res
  
    function backTrack(nums, target, p, start) {
      if (target === 0)
        return res.push(p.slice())
      for (let i = start; i < nums.length && target >= nums[i]; i++) {
        p.push(nums[i])
        backTrack(nums, target - nums[i], p, i)
        p.pop()
      }
      return
    }
  };