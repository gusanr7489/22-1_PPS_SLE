class Solution {
  public boolean checkRecord(String s) {
      
      int absent=0, late = 0;
      
      for(int i=0; i<s.length(); i++) {
      
          if(s.charAt(i)=='A') 
              absent++;
          
          if(s.charAt(i)=='L'){
              late++;
              if(late==3)
                  return false;

          } else late = 0;
      
      }
      return absent<2;
  }
}