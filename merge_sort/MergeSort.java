import java.util.Arrays;

class MergeSort {

    static class FirstIteration {

        public int[] topDown(int[] input) {
            if (input.length <= 1)
                return input;

            var i = input.length / 2;
            var l = topDown(Arrays.copyOfRange(input, 0, i));
            var r = topDown(Arrays.copyOfRange(input, i, input.length));

            return merge(l, r);
        }

        private int[] merge(int[] left, int[] right) {
            int i = 0, j = 0, k = 0;
            var result = new int[left.length + right.length];

            while (i < left.length && j < right.length) {
                if (left[i] > right[j])
                    result[k++] = right[j++];
                else if (left[i] < right[j])
                    result[k++] = left[i++];
                else {
                    result[k++] = right[j++];
                    result[k++] = left[i++];
                }
            }

            for ( ; i < left.length; i++)  result[k++] = left[i];
            for ( ; j < right.length; j++) result[k++] = right[j];

            return result;
        }

    }

    static class SecondIteration {

        public void topDown(int[] input) {
            if (input.length <= 1)
                return;

            var i = input.length / 2;
            var l = Arrays.copyOfRange(input, 0, i);
            var r = Arrays.copyOfRange(input, i, input.length);

            topDown(l);
            topDown(r);
            merge(input, l, r);
        }

        private void merge(int[] merged, int[] left, int[] right) {
            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] > right[j])
                    merged[k++] = right[j++];
                else if (left[i] < right[j])
                    merged[k++] = left[i++];
                else {
                    merged[k++] = right[j++];
                    merged[k++] = left[i++];
                }
            }

            for ( ; i < left.length;  i++) merged[k++] = left[i];
            for ( ; j < right.length; j++) merged[k++] = right[j];
        }

    }

    static class ThirdIteration {

        public void topDown(int[] input) {
            helper(input, 0, input.length - 1, Arrays.copyOf(input, input.length));
        }

        private void helper(int[] main, int start, int end, int[] auxiliary) {
            if (start == end) return;

            int middle = (start + end) / 2;

            helper(main, start, middle, auxiliary);
            helper(main, middle + 1, end, auxiliary);
            merge(main, start, middle, end, auxiliary);
        }

        private void merge(int[] main, int start, int middle, int end, int[] auxiliary) {
            System.arraycopy(main, start, auxiliary, start, end - start + 1);

            int i = start, j = middle + 1, k = start;

            while (i <= middle && j <= end) {
                if (auxiliary[i] > auxiliary[j])
                    main[k++] = auxiliary[j++];
                else if (auxiliary[i] < auxiliary[j])
                    main[k++] = auxiliary[i++];
                else {
                    main[k++] = auxiliary[j++];
                    main[k++] = auxiliary[i++];
                }
            }

            for ( ; i <= middle; i++) main[k++] = auxiliary[i];
            for ( ; j <= end;    j++) main[k++] = auxiliary[j];
        }

    }

}