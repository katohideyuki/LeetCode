package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sec118_PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        // 返却用
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows && i < 30; i++) {
         // インナーリスト
            List<Integer> innerList = new ArrayList<>();

            for (int j = 0; j < i + 1; j++) {
                // 左端または右端の場合は必ず1となる
                if (j == 0 || i == j) {
                    innerList.add(1);
                } else {
                    // それ以外の場合、1段上の左、右側に配置されている値を取得し、合算する
                    int upperLeft = list.get(i - 1).get(j - 1);
                    int upperRight = list.get(i - 1).get(j);
                    innerList.add(upperLeft + upperRight);
                }
            }
         // インナーリストを返却用リストに格納
            list.add(innerList);
        }
        return list;
    }

    /* 他のひとの回答(先に格納先を作り後から値を修正していく) */
    public List<List<Integer>> generateOther(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        // 指定された回数分、先にリストを生成し、全ての要素に1を格納する。なるほどぉ〜
        for (int i = 0; i < numRows; ++i) {
            Integer[] temp = new Integer[i + 1];
            Arrays.fill(temp, 1); // 全ての要素の1を格納
            ans.add(Arrays.asList(temp));
        }

        // 事前に格納されている要素に対して値を修正していく
        for (int i = 2; i < numRows; ++i) {
            for (int j = 1; j < ans.get(i).size() - 1; ++j) {
                ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            }
        }
        return ans;
    }
}
