/**
 * ========================================
 * 配列の最後の要素を返却する。
 * ========================================
 */

/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = (function () {
    return (0 === this.length) ? -1 : this[this.length - 1];
});

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */