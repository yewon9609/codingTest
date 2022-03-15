package codingTest;

import java.util.Stack;

//괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
//
//"()()" 또는 "(())()" 는 올바른 괄호입니다.
//")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
//'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
//
//제한사항
//문자열 s의 길이 : 100,000 이하의 자연수
//문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
//입출력 예
//s	answer
//"()()"	true
//"(())()"	true
//")()("	false
//"(()("	false
public class P7 {

	  boolean solution(String s) {
//		  int length = s.length() -1;
//          int count = 0;
//          if (s.charAt(0) == ')' || s.charAt(length) == '(') {return false;}
//          for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '(') {
//                count++; // ( 을 찾으면 카운트 +
//             }
//             if (s.charAt(i) == ')') {
//                count--; // ) 을 찾으면 카운트 - 
//             }
//             if (count < 0) {return false;} // 괄호 닫힘이 괄호 열림보다 먼저 나옴 
//          }
//          if (count == 0){return true;}
//          return false;
		  
		  
	        boolean answer = true;
	        int countA = 0;
	        int countB = 0;

	        for (int i = 0; i < s.length(); i++) {
	        	if (s.charAt(i) == '(') {
	        	countA++;
	        	}else {
	        		countB++;
	        	}
	        	if(countB>countA) {
	        		//for 문안에서 B는 A보다 크면 안됨 클 경우 false리턴
	        		return false;
	        	}
	        }	

	        	
	        if(countA==countB) {
	        	answer =true; 
	        	if(s.charAt(0)==')' || s.charAt(s.length()-1)=='(')  {
	        		answer = false;
	        	}
	        }else if(countA!=countB) {
	        	answer =false;
	        }

	        return answer;
	    }
	  
	  
	  
	  
	  
	
	  boolean solution2(String s) {
	        boolean answer = true;
	        Stack<Character> stack = new Stack<Character>();

	        for(int i=0; i<s.length(); i++){
	                if(s.charAt(i) == '(')  // 현재 (가 들어갈 자리면 스택에 넣는다.
	                    stack.push('(');
	                else{
	                    if(stack.isEmpty()) // 현재 )가 들어갈 자리인데 스택이 비어있을경우 -> false
	                        return false;
	                    else
	                        stack.pop();    // 현재 )가 들어갈 상태에서 스택에 괄호('(')가 있는경우 -> pop
	                }
	        }
	        answer = (stack.isEmpty()) ? true : false;
	        return answer;
	    }
	  
	  
	  boolean solution3(String s) {
	      boolean answer = true;
	      Stack<Character> stack = new Stack<>();
	      
	      for (int i = 0; i < s.length(); i++) {
	         char cha = s.charAt(i);
	         
	         if (cha == ')') {
	            if (stack.isEmpty()) {
	               return false;
	            }else {
	            stack.pop();
	            }
	         } else {
	            stack.push('(');
	            

	            
	            }
	         }
	      answer = (stack.isEmpty()) ? true : false;
	      return answer ;
	   }


	  
	  
	public static void main(String[] args) {
		P7 p7= new P7();
		System.out.println(p7.solution3("(()("));
		
	}
}
