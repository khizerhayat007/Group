/**
 * 
 */
package pkg;

/**
 * @author Javed Chaudary
 *
 */
public class TestClass {
	private int id;
	private String name;
	public TestClass(int id, String name){
		this.id = id;
		this.name = name;
		
	}
	
	public void printValues(){
		System.out.println("Id : "+id+"\tName : "+name+"\n");
	}
	public int id(){
		return id;
	}
	public String name(){
		return name;
	}
}
