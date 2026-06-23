class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer>hm=new HashMap<>();
   for(int i=0;i<arr.length;i++){
    int key=target-arr[i];
    if(hm.containsKey(key)){
        return new int[]{hm.get(key),i};
    }
    hm.put(arr[i],i);
   }
    return new int[] {-1,-1};
  }
}
  

 
    
     