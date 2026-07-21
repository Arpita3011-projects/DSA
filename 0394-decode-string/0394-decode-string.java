class Solution {
    public String decodeString(String s) {
        Stack <Integer> countStack=new Stack<>();
         Stack <String> stringStack=new Stack<>();
         int currentNumber=0;
         String currentString="";
         for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                currentNumber=currentNumber*10+(ch-'0');
            }else if(ch=='['){
                countStack.push(currentNumber);
                stringStack.push(currentString);
                currentNumber=0;
                currentString="";

            }else if(ch==']'){
                int count=countStack.pop();
                String previousString=stringStack.pop();
                StringBuilder repeated=new StringBuilder();
                for(int i=0;i<count;i++){
                    repeated.append(currentString);
                }
                    currentString=previousString+repeated.toString();
            }else{
                currentString+=ch;
            }
            }
             return currentString;

         }
         
        
    }
   
