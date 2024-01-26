public class TwoSumOnline{
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int count = 0; count < nums.length; count++){
			for(int index = 0; index < nums.length; index++){
				if(count != index && nums[count] + nums[index] == target){
                    if(count > index){
                        ans [0] = index;
                        ans[1] = count;
                    } else {
                        ans [1] = index;
                        ans[0] = count;
                    }
                }
            }
        }
        return ans;   
    }
}