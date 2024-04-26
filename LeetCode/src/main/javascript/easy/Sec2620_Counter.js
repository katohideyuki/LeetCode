/**
 * 整数nを指定すると、カウンター関数を返します。
 * このカウンタ関数は最初にnを返し、その後呼び出されるたびに前の値より1を加えた値を返します
 * (n、n + 1、n + 2 など)。
 */

/**
 * @param {number} n 値
 * @return {Function} counter 初回以外はインクリメントした値
 */
const createCounter = function(n) {
    let counter = n;
    return function() {
        return counter++;
    };
};

/** 
 * const counter = createCounter(10)
 * console.log(counter()); // 10
 * console.log(counter()); // 11
 * console.log(counter()); // 12
 */

/**
 * 他の人の解答
 * クロージャ内で引数を参照していれば、明示的に外側の関数内で引数を変数に代入しておく必要なかった。
 * でも明示的に引数を変数に格納していた方が、見やすい？どうだろう。。
 * @param {*} n
 * @return {*} 
 */
var createCounter_good = function(n) {
    return function() {
        return n++;
    };
};