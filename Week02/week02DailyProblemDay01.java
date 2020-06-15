//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
// 示例 1:
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
//
//
// 示例 2:
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
//
//
// 说明:
//
// 所有输入只包含小写字母 a-z 。
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        class Solution {
            public String longestCommonPrefix(String[] strs) {
                //找到字符数组中最短的字符(遍历数组判断与该字符的相同的最小数)
                if (strs.length == 0) {
                    return "";
                } else if (strs.length == 1) {
                    return strs[0];
                }
                else {
                    for (int i = 0; i < strs.length; i++) {
                        if (strs[i].length() == 0) {
                            return "";
                        }
                    }
                    char first = strs[0].charAt(0);//定义第一个字符,但凡有一个与之不同就没有公共的前缀
                    int min = strs[0].length();//最小字符长度
                    int minindex = 0;//最小字符下标
                    for (int i = 0; i < strs.length; i++) {
                        if (strs[i].charAt(0) != first) {
                            return "";
                        }
                        if (strs[i].length() < min) {
                            min = strs[i].length();
                            minindex = i;
                        }
                    }
                    String db = strs[minindex];
                    int count = 0;
                    int minret = strs[minindex].length();
                    for (int i = 0; i < strs.length; i++) {
                        if (i == minindex) continue;//不用重复比
                        for (int j = 0; j < strs[minindex].length(); j++) {
                            if (strs[i].charAt(j) != db.charAt(j)) {
                                break;
                            } else {
                                count++;
                            }
                        }
                        if (count < minret) {
                            minret = count;
                        }
                        count = 0;
                    }
                    return (strs[minindex].substring(0,minret));
                }
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
