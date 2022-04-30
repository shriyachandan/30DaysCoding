package Day1;

public class Sort {
    public void sortColors(int[] nums) {
        int low =0;
        int mid = 0;
        int high = nums.length-1;
        int var =0;
        while(mid<=high){
            switch(nums[mid]){
                case 0: {
                    var = nums[low];
                    nums[low]= nums[mid];
                    nums[mid]=var;
                    low++;
                    mid++;
                    break;
                }
                    
                case 1:
                    mid ++;
                    break;
                    
                case 2: {
                    var = nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=var;
                    high--;
                    break;
                }
            }
        }
        
    }
    
}
