import java.util.Comparator;

public class AVLNodeComparator implements Comparator {
    public int compare(Object a, Object b) {
        String aa = ((AVLTreeNode)a).getKey();
        String bb = ((AVLTreeNode)b).getKey();
        int size = Math.min(aa.length(), bb.length());
        for (int i=0; i<size; i++) {
            if (aa.charAt(i) < bb.charAt(i))
                return -1;
            else if (aa.charAt(i) > bb.charAt(i))
                return 1;
        }
        // first size characters are equal to each other
        if (size == aa.length() && size == bb.length())
            return 0;
        else if (size == aa.length()) return -1;
        return 1;
    }
}