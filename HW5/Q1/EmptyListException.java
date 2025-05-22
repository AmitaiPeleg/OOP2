package HW5.Q1;
public class EmptyListException extends RuntimeException{

	public EmptyListException(){
		this("list");
	}
	public EmptyListException(String name){
		super(name+" is empty ");
	}
}
