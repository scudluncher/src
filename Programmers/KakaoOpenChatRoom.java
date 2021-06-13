import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class KakaoOpenChatRoom {
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        String [] testData = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        solution.solution(testData);
    }


    // https://programmers.co.kr/learn/courses/30/lessons/42888
        }
        
        
        class Solution {
            public String[] solution(String[] record) {
               
                    // String[] answer = {};
                    List<String> answerList = new ArrayList<String>();
                    List<String> recordList = Arrays.asList(record); //save
        
                    List<Record> recordCodeList = new ArrayList<Record>();
        
                    for(String recordElement : recordList){
                        if(recordElement.startsWith("Enter") || recordElement.startsWith("Leave")){
                            String[] sliced = recordElement.split(" ");
                            Record rec = new Record(sliced[1],sliced[0]);
                            recordCodeList.add(rec);
                        }
                      
                    }
                    
        
        
                    HashMap<String, UserInfo> userNickMap = new HashMap<String,UserInfo>();
                    //record 뒤집기
                    // Arrays.sort(record,Collections.reverseOrder());  // 이거 아니야
                    Collections.reverse(recordList);
                    record = recordList.toArray(new String[recordCodeList.size()]);

                    // Integer[] array2 = new Integer[] { 10, 45, 1, 3, 100, -10, 200, 5};
                    //  System.out.println("기존배열 : " + Arrays.toString(array2));
                    //   Arrays.sort(array2); 
                    //   System.out.println("sort : " + Arrays.toString(array2)); 
                    //   List<Integer> list = Arrays.asList(array2); Collections.reverse(list); 
                    //   array2 = list.toArray(new Integer[list.size()]);




                    //final nick name 찾기
                    for (String testMessage : record){
                        if(testMessage.startsWith("Enter") || testMessage.startsWith("Change")){
                            String[] sliced = testMessage.split(" ");
                            UserInfo userInfo = new UserInfo(sliced[1], sliced[2]);
                            if(!userNickMap.containsKey(userInfo.id)){
                                userNickMap.put(userInfo.id, userInfo);
                            }else continue;
                        }
                    }
        
                    for(Record recVal : recordCodeList){
                        answerList.add(convertCodeToHumanLanguage(recVal, userNickMap.get(recVal.id)));
                    }
        
                    // answerList.toArray();
                    //answerList.toArray(new String[answerList.size()]);
                    return answerList.toArray(new String[answerList.size()]);
                }
        
            
                public String convertCodeToHumanLanguage(Record rec, UserInfo usrInfo){
                    StringBuilder sb = new StringBuilder();
                    sb.append(usrInfo.nickName);
                    sb.append(recActionConverter(rec.action));
                    return sb.toString();
                }
        
                public String recActionConverter(String recAction){
                    switch(recAction){
                        case "Enter":
                        return "님이 들어왔습니다.";
                        case "Leave":
                        return "님이 나갔습니다.";
                        default : return "";
                    }
                }
            
        
           
        
        
        }
        
                class UserInfo{
                    String id;
                    String nickName;    
                    
                    public UserInfo(String id, String nickName){
                        this.id = id;
                        this.nickName = nickName;
                    }
                }
        
        
                class Record{
                    String id;
                    String action;
                    
                    public Record(String id, String action){
                        this.id = id;
                        this.action = action;
                    }
                }