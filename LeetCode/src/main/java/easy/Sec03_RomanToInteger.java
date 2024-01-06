package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * ローマ数字「I:1, V:5, X:10, L:50, C:100, D:500, M:1000」で表現される
 *  I を V (5) と X (10) の前に配置して 4 と 9 を作ることができます。
 *  X を L (50) と C (100) の前に置くと、40 と 90 になります。
 *  C を D (500) と M (1000) の前に置くと、400 と 900 になります。
 *
 *  制約
 *  引数の長さは1〜15文字まで
 *  引数は「I」、「V」、「X」、「L」、「C」、「D」、「M」のみ
 *  引数は数字に変換すると「1〜3999」まで
 *
 */
public class Sec03_RomanToInteger {

    // テストコードの書き方を忘れないようprivateにしているだけで、publicで良い。
    private int romanToInt(String s) {
        int target = 0; // 計算対象のローマ数字の値
        int nextTarget = 0; // 計算対象の次に格納されているローマ数字の値
        int result = 0; // 計算結果

        // 引数を順に取り出す
        for (int i = 0; i < s.length(); i++) {
            // 計算対象のローマ数字の値を取得
            target = ROMAN_INTEGER.valueOf(s.substring(i, i + 1)).getVal();

            // 末尾の文字かつループが繰り返されている場合、1つ前の文字より小さいことが保証されているため加算
            if (i == s.length() - 1) {
                result += target;
                continue;
            }

            // 次のローマ数字の値を取得
            nextTarget = ROMAN_INTEGER.valueOf(s.substring(i + 1, i + 2)).getVal();
            // 計算対象のローマ数字の値が、次に格納されているローマ数字の値よりも大きい場合、減算を行った上で加算
            if (target < nextTarget) {
                // 次のローマ数字の値 - 計算対象のローマ数字の値 = 加算する値
                result += nextTarget - target;
                // 次のローマ数字の値も含めて計算を行っているため、カウントをインクリメントし、次の次の文字からループを再開
                i++;
            } else {
                // 計算対象のローマ数字の値が、次に格納されているローマ数字の値よりも小さい場合、加算
                result += target;
            }
        }
        // 計算結果を返却
        return result;
    }

    /**
     * ローマ数字を表現する
     * 無理にenumにしない方が良かったか。。
     */
    enum ROMAN_INTEGER {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        // ローマ数字を数字に変換した値
        private int val;

        ROMAN_INTEGER(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    /** 他のひとの回答（15桁までとか、ローマ数字以外を許容しないなどの制約は無視して良かった） */
    public int romanToIntOther(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            // 末尾以外で、現在の値より次に格納されている値の方が大きい場合、現在の値を減算
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                // それ以外は加算
                ans += m.get(s.charAt(i));
            }
        }
        return ans;
    }
}
