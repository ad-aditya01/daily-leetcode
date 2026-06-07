import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> children = new HashSet<>();
        Map<Integer, TreeNode> map = new HashMap<>();

        for (int[] d : descriptions) {
            int parent = d[0];
            int child = d[1];
            int isLeft = d[2];

            children.add(child);

            TreeNode parentNode =
                    map.computeIfAbsent(parent, x -> new TreeNode(x));

            TreeNode childNode =
                    map.computeIfAbsent(child, x -> new TreeNode(x));

            if (isLeft == 1) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }
        }

        for (int[] d : descriptions) {
            if (!children.contains(d[0])) {
                return map.get(d[0]);
            }
        }

        return null;
    }
}