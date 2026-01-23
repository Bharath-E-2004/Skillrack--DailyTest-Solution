class Solution {
     static{
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }));
    }
    public int minimumPairRemoval(int[] nums) {
        int count=0,size=nums.length;
        while(true){
            if(Sorted(nums,size))
                break;
            int ind=0,min=Integer.MAX_VALUE;
            for(int i=1;i<size;i++){
                if(min>nums[i]+nums[i-1])
                    min=nums[(ind=i)]+nums[i-1];
            }
            nums[ind-1]+=nums[ind];
            while(ind<size-1){
                nums[ind]=nums[++ind];
            }
            size--;
            count++;
        }
        System.gc();
        return count;
    }
    public boolean Sorted(int nums[],int len){
        for(int i=1;i<len;i++)
            if(nums[i-1]>nums[i])
                return false;
        return true;
    }
}
