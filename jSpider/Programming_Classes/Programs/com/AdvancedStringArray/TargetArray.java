package advancedArrayString;

public class TargetArray {
	    static int searchInsert(int[] nums, int target) {
	          int ps=0;
	        for(int i=0; i<nums.length; i++){
	            if(nums[i]==target){
	                return i;
	            }
	            else if(nums[i]<target)
	            {
	                ps=i+1;
	         
	            }

	        }
	        return ps;
	    }
	    public static void main(String[] args) {
			int[] arr= {1,3,5,6};
			int target=2;
			System.out.println(searchInsert(arr, target));
		}
	}   
	      



