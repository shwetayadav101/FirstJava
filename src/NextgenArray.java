
public class NextgenArray<T> {

	T[] elements;
	
	public NextgenArray(T[] elements)
	{
		this.elements = elements;
	}

	public T get(int index) {
		return elements[index-1];
	}

	public void set(T element,int index) {
		this.elements[index - 1] = element;
	}
	
	public String toString()
	{
		String result = "";
		for(int i = 0;i<=elements.length-1;i++)
		{
			if(i == 0) result += elements[i];
			else result += ", " + elements[i];
		}
		return result;
	}
	
}
