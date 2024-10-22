package generic;
//@file GenericContainer.java
//@author Sidhanath Verekar
//@brief This is a generic class that uses setItem to set values and getItem() to get values
//@Date:22/10/24
public class GenericContainer<T>{
	private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
