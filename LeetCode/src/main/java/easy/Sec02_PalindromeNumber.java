package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * 整数xを指定すると、xが回文整数の場合にtrueを返却する。
 * 整数は、前方と後方を同じように読み取る場合、回文。
 * つまり、前から読んでも後ろから読んでも同じになればtrue。
 */
public class Sec02_PalindromeNumber {
public static void main(String[] args) {
	System.out.println(new Sec02_PalindromeNumber().otherIsPalindrome(12321));

}
	/** 回答 */
	public boolean isPalindrome(int x) {
		// 負の値であれば回文はあり得ないので、早期リターン
		if (0 > x)
			return false;

		var list = new ArrayList<>();
		// 1桁目から値を取得してリストに追加する(逆順)
		for (int num = x; 0 < num; num /= 10) {
			list.add(num % 10);
		}

		// 逆順で追加したリストを正順に直したリストをつくる
		var list2 = list.stream().collect(Collectors.toList());
		Collections.reverse(list2);

		// リストを比較して結果を返却する　※回文であればtrue
		return (list.equals(list2));
	}

	/**  ベストプラクティス */
	public boolean bestIsPalindrome(int x) {
		int num2 = 0;
		int num3 = x;

		while (x > 0) {
			num2 = num2 * 10 + x % 10;	// 現時点の余りを10倍して、次に余りをプラス ※最終的に引数の逆順の値になる
			x /= 10;					// 1桁目を切り捨てた値が格納される ※最終的に0になる
		}

		// 回文であればtrue
		if (num2 == num3)
			return true;

		return false;
	}

	/** 素直に文字列に変換して判定する */
	public boolean otherIsPalindrome(int x) {
		String a = String.valueOf(x);							// 文字列に変換
		String b = new StringBuilder(a).reverse().toString();	// 文字列を逆順にする

		// 回文であればtrue
		if (a.equals(b))
			return true;

		return false;
	}
}
/**
 * 処理スピードは早くも遅くもないが、メモリを使い過ぎている...
 * - 処理速度 : 28ms
 * - メモリ   : 49.1MB
 *
 * 素直に文字列に変換した方が結果がよい
 */