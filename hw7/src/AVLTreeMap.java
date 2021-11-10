public class AVLTreeMap extends AbstractMap {
    private int n;
    private AVLTreeNode root;
    private AVLTreeNode NIL = new AVLTreeNode();
    private AVLNodeComparator comp = new AVLNodeComparator();

    public AVLTreeMap() {
        /* your implementation */
        root = NIL;
        n = 0;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public Object get(Object key) {
        AVLTreeNode p = root;
        while (p != null) {
            if (comp.compare(key, p.getKey()) < 0) {
                p = p.getLeft();
            } else if (comp.compare(key, p.getKey()) > 0) {
                p = p.getRight();
            } else {
                return p;
            }
        }
        return null;
    }

    public Object put(Object key, Object value) {
        AVLTreeNode p = root;
        AVLTreeNode parent = NIL;
        while (p != null) {
            if (comp.compare(key, p.getKey()) < 0) {
                parent = p;
                p = p.getLeft();
            } else if (comp.compare(key, p.getKey()) > 0) {
                parent = p;
                p = p.getRight();
            } else {
                Object oldValue = p.getValue();
                p.setValue(value.toString());
                return oldValue;
            }
        }
        AVLTreeNode newNode = new AVLTreeNode();
        if (parent == NIL) {
            root = newNode;
        } else if (comp.compare(key, parent.getKey()) < 0) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }
        newNode.setH();
        n++;
        return null;
    }

    private void insertAVL(AVLTreeNode p, AVLTreeNode node) {
        if (node.getKey().equals(p.getKey())) {
            p.setValue(node.getValue());
        } else if (comp.compare(node.getKey(), p.getKey()) == 0) {
            if (p.getLeft() == NIL) {
                p.setLeft(node);
                node.setParent(p);
                p.setH();
                n++;
            } else {
                insertAVL(p.getLeft(), node);
                if (p.calBF() < -1) {
                    if (p.getLeft().calBF() < 0) {
                        rotateLL(p);
                    } else {
                        rotateLR(p);
                    }
                }
            }
            p.setH();
        } else {
            if (p.getRight() == NIL) {
                p.setRight(node);
                node.setParent(p);
                p.setH();
                n++;
            } else {
                insertAVL(p.getRight(), node);
                if (p.calBF() > 1) {
                    if (p.getRight().calBF() > 0) {
                        rotateRR(p);
                    } else {
                        rotateRL(p);
                    }
                }
                p.setH();
            }
        }
    }

    public Object remove(Object key) {
        return null;
    }

    private AVLTreeNode rotateLL(AVLTreeNode p) {
        AVLTreeNode temp;
        temp = (AVLTreeNode) p.getLeft();
        p.setLeft(temp.getRight());
        temp.setRight(p);
        return temp;
    }

    private AVLTreeNode rotateLR(AVLTreeNode p) {
        AVLTreeNode temp;
        temp = (AVLTreeNode) p.getLeft();
        p.setLeft(rotateRR(temp));
        return rotateLL(p);
    }

    private AVLTreeNode rotateRR(AVLTreeNode p) {
        AVLTreeNode temp;
        temp = (AVLTreeNode) p.getRight();
        p.setRight(temp.getLeft());
        temp.setLeft(p);
        temp = p;
        return temp;
    }

    private AVLTreeNode rotateRL(AVLTreeNode p) {
        AVLTreeNode temp;
        temp = (AVLTreeNode) p.getRight();
        p.setRight(rotateLL(temp));
        return rotateRR(p);
    }

    public String toString() {
        // return the key string sequence of this AVL tree nodes in the order of
        // pre-order traversal
        return genTreeString(root);
    }

    public String genTreeString(AVLTreeNode node) {
        if (node == null)
            return "";
        return node.getKey() + genTreeString(node.getLeft()) + genTreeString(node.getRight());
    }
}