class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1|| s.length() < 1){
            return s;
        }
        StringBuilder[] r=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            r[i]=new StringBuilder();
        }
        int currentrow=0;
        int step=1;
        for(char c:s.toCharArray()){
            r[currentrow].append(c);
            if(currentrow==0) step=1;
            if(currentrow==numRows-1) step=-1;
            currentrow+=step;
        }
        StringBuilder sb=new StringBuilder();
        for(StringBuilder s1:r){
            sb.append(s1);
        }
        return sb.toString();
    }
}