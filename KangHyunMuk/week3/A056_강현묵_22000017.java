class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     
      int[] answer = new int[nums1.length];

      for(int i=0; i<nums1.length; i++) {
          
          for(int j=0; j<nums2.length; j++) {
              
              if(nums1[i]==nums2[j]) {
                  if(j+1 == nums2.length) {
                      answer[i] = -1;
                      break;
                  }
                  if(nums1[i]<nums2[j+1]) {
                      answer[i] = nums2[j+1];
                      break;
                  }
                  for(int k=j; k<nums2.length; k++) {
                      if(nums1[i]<nums2[k]) {
                          answer[i] = nums2[k];
                          break;
                      }
                      if(k==nums2.length-1)
                          answer[i] = -1;
                  }
              }
          }
      }
      
      return answer;
  }
}
