public class problem_2161_PartitionArrayAccordingtoGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result=new int[nums.length];
        int idx=0;
        for(int num:nums){
            if(num<pivot){
                result[idx]=num;
                idx++;
            }
        }
        for(int num:nums){
            if(num==pivot){
                result[idx]=num;
                idx++;
            }
        }
        for(int num:nums){
            if(num>pivot){
                result[idx]=num;
                idx++;
            }
        }
        return result;
    }
}
