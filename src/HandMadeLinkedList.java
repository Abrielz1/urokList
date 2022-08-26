public class HandMadeLinkedList<E> {
    private Node <E> fstNode;
    private Node <E> lstNode;
    private int size = 0;

    public HandMadeLinkedList () {
        lstNode = new Node<>(null, fstNode, null);
        fstNode = new Node<>(null, null, lstNode);
    }

    public Node<E> getFstNode() {
        return fstNode;
    }

    public void setFstNode(Node<E> fstNode) {
        this.fstNode = fstNode;
    }

    public Node<E> getLstNode() {
        return lstNode;
    }

    public void setLstNode(Node<E> lstNode) {
        this.lstNode = lstNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
