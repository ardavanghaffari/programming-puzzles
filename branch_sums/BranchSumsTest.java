import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BranchSumsTest {

    BranchSums impl = new BranchSums();

    @Test
    void testBranchSums() {
        var expectedOutput = List.of(15, 16, 18, 10, 11);
        var input = new BranchSums.BinaryTree(1)
                .withLeft(new BranchSums.BinaryTree(2)
                        .withLeft(new BranchSums.BinaryTree(4)
                                .withLeft(new BranchSums.BinaryTree(8))
                                .withRight(new BranchSums.BinaryTree(9)))
                        .withRight(new BranchSums.BinaryTree(5)
                                .withLeft(new BranchSums.BinaryTree(10))))
                .withRight(new BranchSums.BinaryTree(3)
                        .withLeft(new BranchSums.BinaryTree(6))
                        .withRight(new BranchSums.BinaryTree(7)));

        assertEquals(expectedOutput, impl.branchSums(input));
    }

}
