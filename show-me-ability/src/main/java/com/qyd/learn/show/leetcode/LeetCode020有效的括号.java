package com.qyd.learn.show.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/23 10:07
 * @Description:给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode020有效的括号 {
    static class Solution {
        public boolean isValid(String s) {
            boolean is=true;

            if(s.length()==0){
                return is;
            }
            if(s.length()%2!=0){
                return false;
            }
            Map<Character,Character> info=new HashMap<>();
            info.put('(',')');
            info.put('{','}');
            info.put('[',']');
            int mid=s.length()/2;
            Stack<Character> stack=new Stack<>();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(info.containsKey(c)){
                    stack.push(c);
                }else{
                    if(stack.size()>0){
                        Character pop = stack.pop();
                        if(c!=info.get(pop)){
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
            }


            return stack.size()>0?false:true;

        }
    }
}
