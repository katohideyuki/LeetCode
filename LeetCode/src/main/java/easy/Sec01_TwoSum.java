package easy;

import java.util.HashMap;

/**
 * [問題]
 * 整数 nums の配列と整数ターゲットを指定すると、合計がターゲットになるような
 * 2 つの数値のインデックスを返します。各入力には正確に 1 つのソリューションが
 * あり、同じ要素を 2 回使用しないと想定することができます。任意の順序で回答を
 * 返すことができます。
 */
public class Sec01_TwoSum {
    /**
     * - 2つのnums配列から順に値を取得する。
     * - 繰り返しのカウンタ = index番号とする。
     * - index番号が違い、さらに2つのnums配列から取り出した値の合計値が
     *   targetと同じ値であれば、その取得した要素のindex番号を要素として
     *   持った配列を返却する
     * - 該当しなければ空の配列を返却
     */
    public int[] twoSum(int[] nums, int target) {
        // 2つの配列から値を取得し、値を判定する
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (!(i == j) && nums[i] + nums[j] == target) {
                    // 答えとなる配列を返却
                    return new int[] { i, j };
                }
            }
        }
        // 該当しなければ空の配列を返却
        return new int[0];
    }

    /**
     * 他のひとの回答
     * - target - nums[i]でi番目の要素とtargetとの差分がMapの中にあるかどうか判断。
     * - なければi番目の要素とindexをmapに格納。
     * - あればmapからindexを取り出して返却。
     */
    public int[] otherSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (index.containsKey(temp)) {
                res[0] = index.get(temp);
                res[1] = i;
                break;
            } else {
                index.put(nums[i], i);
            }
        }
        return res;
    }

    /**
     * 自分の回答を改善
     * 総当たりの組み合わせで、全ての要素を見る必要はない。
     * また、自分の要素を組み合わせから除外するのに i == jをする必要なく
     * i + 1 を行い、「取り出した要素」と「取り出した要素の次の要素」を確
     * 認するで十分。
     */
    public int[] improveTwoSum(int[] nums, int target) {
        // 2つの配列から値を取得し、値を判定する
        for (int i = 0; i < nums.length; i++) {
        	// i == j は無駄なステップであり、iの次の要素と組み合わせればOK
            for (int j = i + 1; j < nums.length; j++) {
            	System.out.printf("i : %s, j : %s%n", i, j);
                if (nums[i] + nums[j] == target) {
                    // 答えとなる配列を返却
                    return new int[] { i, j };
                }
            }
        }
        // 該当しなければ空の配列を返却
        return new int[0];
    }
}
