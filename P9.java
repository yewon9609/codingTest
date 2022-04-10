package codingTest;

import java.util.Arrays;

//1478 → "one4seveneight"
//234567 → "23four5six7"
//10203 → "1zerotwozero3"
//이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
//
//참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
//
//숫자	영단어
//0	zero
//1	one
//2	two
//3	three
//4	four
//5	five
//6	six
//7	seven
//8	eight
//9	nine
//제한사항
//1 ≤ s의 길이 ≤ 50
//s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
//return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.
//입출력 예 설명
//입출력 예 #1
//
//문제 예시와 같습니다.
//입출력 예 #2
//
//문제 예시와 같습니다.
//입출력 예 #3
//
//"three"는 3, "six"는 6, "seven"은 7에 대응되기 때문에 정답은 입출력 예 #2와 같은 234567이 됩니다.
//입출력 예 #2와 #3과 같이 같은 정답을 가리키는 문자열이 여러 가지가 나올 수 있습니다.
//입출력 예 #4
//
//s에는 영단어로 바뀐 부분이 없습니다.

//입출력 예
//s								result
//"one4seveneight"		1478
//"23four5six7"				234567
//"2three45sixseven"		234567
//"123"							123
public class P9 {
	
	//그냥 배열에서 indexof메소드 사용하고싶을 때 
	//Arrays.asList(배열이름).indexof
	//int->String으로 변환할 떄 : String.valueof()를 쓴다. 
	
	public int solution(String s) {
        int answer = 0;
        String[] numEng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

       
        for (int i = 0; i < numEng.length; i++) {
        	if(s.contains(numEng[i])) {
//        		String.valueOf(i)
        		s=s.replaceAll(numEng[i],String.valueOf(Arrays.asList(numEng).indexOf(numEng[i])));
        		
        	}
        
		}
        answer=Integer.parseInt(s);
    
        
        return answer;
    }

	
	public static void main(String[] args) {
		P9 p9 =new P9();
		String s ="one4seveneight";
		System.out.println(p9.solution(s));
	

	
	
	}	

}
