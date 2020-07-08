//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
// 示例 1:
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
//
//
// 示例 2:
//
// 输入: s = "rat", t = "car"
//输出: false
//
// 说明:
//你可以假设字符串只包含小写字母。
//
// 进阶:
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
// Related Topics 排序 哈希表


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
//   ---------------方法1
//        if (s.length() != t.length()) return false;
//        int[] ret = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            ret[s.charAt(i) - 'a']++;//a就是数组的0位,后面的字母减去a就是具体的数组下标,给每个出现的字母计数
//            ret[t.charAt(i) - 'a']--;
//        }
//        for (int i = 0; i < 26; i++) {
//            if (ret[i] != 0) {
//                return false;
//            }
//        }
//        return true;
        //---------------方法2
        if (s.length() != t.length()) return false;
        char[] one = s.toCharArray();
        char[] two = t.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        return Arrays.equals(one,two);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
