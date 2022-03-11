package codingTest;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
입출력 예	
participant																					completion											return
["leo", "kiki", "eden"]															["eden", "kiki"]											"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]				["josipa", "filipa", "marina", "nikola"]				"vinko"
["mislav", "stanko", "mislav", "ana"]								["stanko", "ana", "mislav"]					"mislav"
입출력 예 설명
예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.

*/
public class P1 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // String = 참여자 명단 , Integer=카운트 세려고 만듦
        HashMap<String, Integer> map = new HashMap<>();
        
        //참여자 명단(participant)을 해쉬맵의 키로 넣기 
        for (String str : participant) {
        	//map.get(key값) =value값을 불러오는 메소드 
			Integer count = map.get(str);
			
			if(count==null) {		//count가 0이라면 값이 들어가있지 않은거니까 값을 넣는다.
				map.put(str, 1);
			}else {		//이미 들어가 있는 값이라면 카운트 증가
				map.put(str, count+1);
			}
		}
     
        //완주한 선수들(completino)을 해쉬맵의 키로넣기 (해쉬맵키의 중복은 수정) 
        for (String str : completion) {
        	//카운트를 하나씩 없애준다.
        	//(=중복이 아닌 선수들의 카운트를 0으로 만들기위해,
        	// 즉, 완주를 못한 선수들은 카운트 1이고, 중복이름의 선수들은 무조건 카운트가 1이상일것임.)
        	map.put(str, map.get(str)-1);
        }
        
        //key값과 value값을 꺼내기 위해 iterator사용 
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()) {
        	Map.Entry<String, Integer> iter2 = iter.next();
        	//카운트가 1이상이라면 answer 에 key값(중복된선수의 이름 or 완주못한 선수이름)을 넣는다. 
        	if(iter2.getValue()>0) {	
        		answer+=iter2.getKey();
        	}
        	
        }
        
        
   
        return answer;
    }
	
	/*     for (String key : map.keySet()) {
			if(map.get(key)>1) {
				answer+=key;
			}
		}*/
     
        
	/*	HashSet<String> hash=new HashSet<String>();
        for (int i= 0; i < participant.length; i++) {
        	hash.add(participant[i]);
		}
        for (int i = 0; i < completion.length; i++) {
			hash.remove(completion[i]);
		}
        
        Iterator<String> iter = hash.iterator();

        while(iter.hasNext()) {
        	answer+=iter.next();
        }
        
        */
	

	public static void main(String[] args) {
		P1 p = new P1();
		String[] participant= {"mislav", "stanko", "mislav", "ana"};
		String[] completion= {"stanko", "ana", "mislav"};
		System.out.println(p.solution(participant, completion));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
