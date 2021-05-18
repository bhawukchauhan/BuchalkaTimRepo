package ListImplementationAbstract;

public interface NodeList {
abstract ListItem getRoot();
abstract boolean addItem(ListItem lItem);
abstract boolean removeItem(ListItem lItem);
abstract void traverse(ListItem root);
}
