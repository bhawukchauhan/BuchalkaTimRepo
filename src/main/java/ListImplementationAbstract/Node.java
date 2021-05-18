package ListImplementationAbstract;

public class Node extends ListItem{

	public Node(Object value) {
		super(value);
	}

	@Override
	protected ListItem next() {
		return null;
	}

	@Override
	protected ListItem setNext(ListItem lItemRight) {
		return lItemRight;
	}

	@Override
	protected ListItem previous() {
		return null;
	}

	@Override
	protected ListItem setPrevious(ListItem lItemLeft) {
		return lItemLeft;
	}

	@Override
	protected int compareTo(ListItem lItem) {
		return 0;	
	}

}
