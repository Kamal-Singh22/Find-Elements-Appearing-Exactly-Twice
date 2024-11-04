import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ElementsAppearingTwice {

    public static List<Integer> findElementsAppearingTwice(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Collect elements that appear exactly twice
        List<Integer> elementsAppearingTwice = new ArrayList<>();
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == 2) {
                elementsAppearingTwice.add(num);
            }
        }

        return elementsAppearingTwice;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2, 4, 3, 5};
        System.out.println("Elements Appearing Exactly Twice: " + findElementsAppearingTwice(nums1)); // Output: [2, 3]

        int[] nums2 = {1, 1, 2, 3, 4, 5, 5};
        System.out.println("Elements Appearing Exactly Twice: " + findElementsAppearingTwice(nums2)); // Output: [1, 5]
    }
}
