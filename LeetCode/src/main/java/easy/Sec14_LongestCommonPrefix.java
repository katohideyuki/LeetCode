package easy;

import java.util.Arrays;

/**
 * 文字列の配列の中から最も長い共通プレフィックス文字列を検索する関数を作成。
 * 要素数、各要素の桁数は200以内、英字小文字
 */
public class Sec14_LongestCommonPrefix {

    /* 問題を履き違えてしまい、そこそこ時間を割いてしまったため、今回は解答のみ */
    public String longestCommonPrefix(String[] strs) {
        // 配列を昇順化(昇順にすることで、先頭と最後の要素のみを比較すれば良い）
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length -1];
        // 共通文字は何文字目までかをカウントする
        int idx = 0;
        // 1文字目から比較していき、共通文字であれば次の文字へ
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        // 共通文字分のみ切り取り返却する
        return s1.substring(0, idx);
    }
}
