package ListImplementationAbstract;

public class MyLinkedList implements NodeList{

	private ListItem root;
	
	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;		
	}

	@Override
	public boolean addItem(ListItem lItem) {
		return false;
	}

	@Override
	public boolean removeItem(ListItem lItem) {
		return false;
	}

	@Override
	public void traverse(ListItem root) {		
	}

}
