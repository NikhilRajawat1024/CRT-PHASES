public class RearrangeArrayElements {
    public static void main(String[] args) {
        int arr[] = {3, 1, -2, -5, 2, -4};
        int posCount = 0; 
        int negCount = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                posCount++;
            } else {
                negCount++;
            }
        }

        int posarr[] = new int[posCount];
        int negarr[] = new int[negCount];

        int posIndex = 0;
        int negIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                posarr[posIndex] = arr[i];
                posIndex++;
            } else {
                negarr[negIndex] = arr[i];
                negIndex++;
            }
        }
        
        int mergedArray[] = new int[arr.length];
        int index = 0;
        posIndex = 0;
        negIndex = 0;

        while (posIndex < posarr.length && negIndex < negarr.length) {
            mergedArray[index++] = posarr[posIndex++];
            mergedArray[index++] = negarr[negIndex++];
        }

        while (posIndex < posarr.length) {
            mergedArray[index++] = posarr[posIndex++];
        }

        while (negIndex < negarr.length) {
            mergedArray[index++] = negarr[negIndex++];
        }

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
