import java.util.ArrayList;
import java.util.List;

class BranchSums {

    public List<Integer> branchSums(BinaryTree root) {
        var sums = new ArrayList<Integer>();
        calculateBranchSums(root, 0, sums);
        return sums;
    }

    private void calculateBranchSums(BinaryTree node, int runningSum, List<Integer> sums) {
        if (node == null)
            return;

        int newRunningSum = runningSum + node.value;
        if (node.left == null && node.right == null) {
            sums.add(newRunningSum);
            return;
        }

        calculateBranchSums(node.left, newRunningSum, sums);
        calculateBranchSums(node.right, newRunningSum, sums);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
        }

        BinaryTree withLeft(BinaryTree left) {
            this.left = left;
            return this;
        }

        BinaryTree withRight(BinaryTree right) {
            this.right = right;
            return this;
        }
    }

}
