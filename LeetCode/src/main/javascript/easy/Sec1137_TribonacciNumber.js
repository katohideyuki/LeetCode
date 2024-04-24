/**
 * ========================================
 * トリボナッチ数列 Tn は次のように定義されます。
 * n >= 0 の場合、T0 = 0、T1 = 1、T2 = 1、および Tn+3 = Tn + Tn+1 + Tn+2。
 * n が与えられると、Tn の値を返します。
 * ========================================
 */

/**
 * 指定したトリナボッチ数列のn番目の項を取得する(意味あっているか？)
 * 冷静に考えれば配列にする必要なかった...
 * @param {*} n 項の位置？
 * @returns Tnの値？
/** @type {*} */
const tribonacci = ((n) => {
    // トリナボッチ数列リストの初期値
    let array = [0,1,1];

    // リストに初期値として要素が3つ格納されているため、カウントアップは2から開始する
    for (let i = 2; i < n; i++) {
        let num = array[i-2] + array[i-1] + array[i];
        array.push(num);
    }
    return array[n];
});

/**
 * 他の人の解答
 * @param {number} n
 * @return {number}
 */
const tribonacci_good = function (n) {
    if (n < 2) return n;
    if (n == 2) return 1;

    let t0 = 0;
    let t1 = 1;
    let t2 = 1;
    for (let i = 3; i < n + 1; i++) {
        t = t0 + t1 + t2;
        t0 = t1;
        t1 = t2;
        t2 = t;
    }

    return t;
};