// Source : https://leetcode-cn.com/problems/integer-to-roman/
// Author : Tian Zhuo
// Date   : 2018-11-26

// 输入: 1994
// 输出: "MCMXCIV"
// 解释: M = 1000, CM = 900, XC = 90, IV = 4.

/**
 * @param {number} num
 * @return {string}
 */
var intToRoman = function(num) {
    let map = {1: 'I', 5: 'V', 10: 'X', 50: 'L', 100: 'C', 500: 'D', 1000: 'M'}
    let arr = [1000, 500, 100, 50, 10, 5, 1]
    let m = 0
    let j = 0
    let res = ''
    while(j < arr.length){
        if((''+num)[0] == '9'){
            let l = (''+num).length
            res = res + map[10 ** (l - 1)] + map[10 ** l]
            num = num % (10 ** (l - 1))
        }else if((''+num)[0] == '4'){
            let l = (''+num).length
            res = res + map[10 ** (l - 1)] + map[5 * 10 ** (l - 1)]
            num = num % (4 * 10 ** (l - 1))
        }else{
            m = ~~(num / arr[j])
            num = num % arr[j]
            for(let i = 0; i < m; i++){
                res = res + map[arr[j]]
            }
        }
        j++;
    }
    return res;
};

/**
 * @param {number} num
 * @return {string}
 */
let intToRoman1 = function(num) {
    let M = ['', 'M', 'MM', 'MMM'];
    let C = ['', 'C', 'CC', 'CCC', 'CD', 'D', 'DC', 'DCC', 'DCCC', 'CM'];
    let X = ['', 'X', 'XX', 'XXX', 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC'];
    let I = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX'];
    return M[~~(num / 1000)] + C[~~((num % 1000) / 100)] + X[~~((num % 100) / 10)] + I[~~((num % 10))];
};

/**
 * @param {number} num
 * @return {string}
 */
var intToRoman2 = function(num) {
    var value=[1,4,5,9,10,40,50,90,100,400,500,900,1000];
    var roman= ["I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"];
    var s="";
    for(var i=value.length-1;i>=0;i--){
        while(num>=value[i]){
            s+=roman[i];
            num-=value[i];
        }
    }
    return s;
    
};