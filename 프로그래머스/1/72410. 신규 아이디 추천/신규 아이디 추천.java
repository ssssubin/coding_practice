class Solution {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();
        String reg = "[^a-z0-9-_.]";
        new_id = new_id.replaceAll(reg, "");
        // 3단계
        while(new_id.indexOf("..") != -1){
            new_id = new_id.replace("..", ".");
        }
        // 4단계
        if(new_id.startsWith(".")){
            new_id = new_id.substring(1);
        }
        if(new_id.endsWith(".")){
            new_id = new_id.substring(0, new_id.length()-1);
        }
        //5단계
        if(new_id.equals("")) new_id+="a";
        // 6단계
        if(new_id.length()>=16){
            new_id = new_id.substring(0, 15);
            if(new_id.endsWith(".")){
                new_id = new_id.substring(0, 14);
            }
        }
        // 7단계
        if(new_id.length()<=2){
            while(new_id.length()<3){
                new_id +=new_id.charAt(new_id.length()-1);
            }
        }
        return new_id;
    }
}