import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class TextDemo5 {

//    public static int myAtoi(String s) {
//        s = s.trim();//去掉多余的空格
//        char[] ch = s.toCharArray();
//        int index = 0,sign = 1;
//        if(s.length() == index) return 0;//判空
//        if(ch[0] == '+') index++;
//        if(ch[0] == '-'){
//            sign = -1;
//            index++;
//        }
//        int result = 0;
//        while(index < ch.length) {
//            if(ch[index] >= '0' && ch[index] <= '9') {
//                if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && (ch[index] - '0') > Integer.MAX_VALUE % 10)) {
//                    return Integer.MAX_VALUE;
//                }
//                if(result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && (ch[index] - '0') > -(Integer.MIN_VALUE % 10))) {
//                    return Integer.MIN_VALUE;
//                }
//                result = result * 10 + sign * (ch[index] - '0');
//            } else {
//                break;
//            }
//            index++;
//        }
//        return result;
//
//    }

    //最长子回文字符串（超出时间限制）
//    public static String longestPalindrome(String s) {
//        String result = "";
//        for(int i = 0; i < s.length() - 1; i++) {
//            for(int j = i + 1; j < s.length(); j++) {
//                String tmp = s.substring(i,j + 1);
//                if(isPalindrome(tmp)) {
//                    if(tmp.length() > result.length()) {
//                        result = tmp;
//                    }
//                }
//            }
//        }
//        if(result.equals("")) {
//            result += s.charAt(0);
//        }
//        return result;
//    }
//    public static boolean isPalindrome(String str) {
//        int l = 0,r = str.length() - 1;
//        while(l < r) {
//            if(str.charAt(l) != str.charAt(r)) return false;
//            l++;
//            r--;
//        }
//        return true;
//    }
//    static int i;

    //组队竞赛
//    public static int getMaxSum(int[] arr) {
//        Arrays.sort(arr);
//        int sum = 0;
//        int left = 0;
//        int right = arr.length - 1;
//        while(left < right) {
//            left++;
//            right--;
//            sum += arr[right--];
//        }
////        Deque<Integer> deque = new LinkedList<>();
////        for(int i = 0; i < arr.length; i++) {
////            deque.offer(arr[i]);
////        }
////        while(deque.size() != 0) {
////            deque.removeFirst();
////            deque.removeLast();
////            sum += deque.removeLast();
////        }
//        return sum;
//    }


    //输出删除后的字符串
//    public static String getDelStr(String s1,String s2){
//        String ret = "";
//        for(int i = 0; i < s1.length(); i++) {
//            char tmp = s1.charAt(i);
//            if(!s2.contains(tmp + "")) {
//                ret += tmp;
//            }
//        }
////        HashSet<Character> set = new HashSet<>();
////        for(int i = 0; i < s2.length(); i++) {
////            set.add(s2.charAt(i));
////        }
////        for(int i = 0; i < s1.length(); i++) {
////            char tmp = s1.charAt(i);
////            if(!set.contains(tmp)) {
////                ret += tmp;
////            }
////        }
//        return ret;
//    }
    public static void main(String[] args) {
//        int[] arr = {1,8,9,3,4,7};
//        System.out.println(getMaxSum(arr));
//        System.out.println(Math.round(11.5));
//        System.out.println(Math.round(-11.5));
//        System.out.println(i);
//        Deque<Integer> deque = new LinkedList<>();
//        deque.offer()
//        HashSet<Integer> set = new HashSet<>();
//        set.add()
    }
//        String s = "ccc";
//        System.out.println(longestPalindrome(s));
//        String s = "-91283472332";
//        System.out.println(myAtoi(s));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//    }
}
