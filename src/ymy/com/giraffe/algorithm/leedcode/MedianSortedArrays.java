package ymy.com.giraffe.algorithm.leedcode;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * Created by yemengying on 15/10/26.
 */
public class MedianSortedArrays {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int count = 0;
        int i= 0, j = 0;
        while(i < nums1.length && j <nums2.length){
            if(nums1[i] < nums2[j]) {
                result[count++] = nums1[i];
                i++;

            }
            else if (nums1[i] > nums2[j]) {
                result[count++] = nums2[j];
                j++;
            }
            else{
                result[count++] = nums1[i];
                result[count++] = nums2[j];
                i++;
                j++;
            }

        }
        while(i != nums1.length){
            result[count++] = nums1[i++];
        }
        while(j != nums2.length){
            result[count++] = nums2[j++];
        }
        if(result.length % 2 != 0){
            return result[result.length/2];
        }
        return (result[result.length/2] + result[result.length/2 - 1])/(double)2;
    }



    /**
     * 寻找第k小的数 假设两个数组为升序
     * @return
     */
    public  int kthTwoSortedArray(int[] A, int[] B, int k) throws Exception {

        if (k > A.length + B.length || k < 1) throw new Exception("out of range!");

        // pointer of array A
        int pa = 0;
        // pointer of array B
        int pb = 0;
        //store the kth value
        int kthValue = 0;

        while (pa + pb != k) {
            int Ai = (pa == A.length) ? Integer.MAX_VALUE : A[pa];
            int Bj = (pb == B.length) ? Integer.MAX_VALUE : B[pb];
            if (Ai < Bj) {
                pa++;
                kthValue = Ai;
            } else {
                pb++;
                kthValue = Bj;
            }
        }
        return kthValue;
    }

}
