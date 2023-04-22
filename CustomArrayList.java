
public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		// TODO Auto-generated method stub
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				return true;
			}
		}
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return items.length;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return items.indexOf(index);
	}
	
}
