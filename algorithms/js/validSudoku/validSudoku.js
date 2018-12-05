/*
 * @Source: https://leetcode-cn.com/problems/valid-sudoku/
 * @Author: Tian Zhuo
 * @Date: 2018-12-05 20:24:49
 */
// [
//     ["5","3",".",".","7",".",".",".","."],
//     ["6",".",".","1","9","5",".",".","."],
//     [".","9","8",".",".",".",".","6","."],
//     ["8",".",".",".","6",".",".",".","3"],
//     ["4",".",".","8",".","3",".",".","1"],
//     ["7",".",".",".","2",".",".",".","6"],
//     [".","6",".",".",".",".","2","8","."],
//     [".",".",".","4","1","9",".",".","5"],
//     [".",".",".",".","8",".",".","7","9"]
//   ]
/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function(board) {
    const len = board.length;
    for (let i = 0; i < len; i++) {
        let temp = '';
        for (let j = 0; j < len; j++) {
            if(temp.indexOf(board[i][j]) > -1) return false;
            if(board[i][j] !== '.') temp += board[i][j];
        }
    }
    for (let i = 0; i < len; i++) {
        let temp = '';
        for (let j = 0; j < len; j++) {
            if(temp.indexOf(board[j][i]) > -1) return false;
            if(board[j][i] !== '.') temp += board[j][i];
        }
    }
    const iBoard = [
        ['00', '01', '02', '10', '11', '12', '20', '21', '22'],
        ['03', '04', '05', '13', '14', '15', '23', '24', '25'],
        ['06', '07', '08', '16', '17', '18', '26', '27', '28'],
        ['30', '31', '32', '40', '41', '42', '50', '51', '52'],
        ['33', '34', '35', '43', '44', '45', '53', '54', '55'],
        ['36', '37', '38', '46', '47', '48', '56', '57', '58'],
        ['60', '61', '62', '70', '71', '72', '80', '81', '82'],
        ['63', '64', '65', '73', '74', '75', '83', '84', '85'],
        ['66', '67', '68', '76', '77', '78', '86', '87', '88']
    ];
    for (let i = 0; i < len; i++) {
        let temp = '';
        for (let j = 0; j < len; j++) {
            let m = +iBoard[i][j][0];
            let n = +iBoard[i][j][1];
            if(temp.indexOf(board[m][n]) > -1) return false;
            if(board[m][n] !== '.') temp += board[m][n];
        }
    }
    return true;
};

/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku1 = function (board) {
    debugger
    var set = {};
    for (var i = 1; i <= 9; i++) set[i] = [];

    for (var i = 0; i < 9; i++) {
        for (var j = 0; j < 9; j++) {
            var s = board[i][j];
            if (Number(s)) {
                // refers to sudoku cell index
                var index = ~~(i / 3) * 3 + ~~(j / 3);
                for (var k = 0; k < set[s].length; k++) {
                    if (i == set[s][k][0] || j == set[s][k][1] || index == set[s][k][2])
                        return false;
                }
                set[s].push([i, j, index]);
            }
        }
    }
    return true;
};
