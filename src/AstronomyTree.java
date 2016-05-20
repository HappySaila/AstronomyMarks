import java.lang.NullPointerException;

public class AstronomyTree{
	private StudentNode root;
	
	public AstronomyTree(){
		this.root = null;
	}
	public void AddNode(StudentNode student, StudentNode root){
		if (root==null){
			root=student;
		}
		else if (student.mark>=root.mark){
			if (root.hasRight()){
				AddNode(student, root.getRight());
			}
			else {
				//insert node right
				root.setRight(student);
			}
		}
		else if ((student.mark<root.mark)){
			if (root.hasLeft()){
				AddNode(student, root.getLeft());
			}
			else{
				//insert node left
				root.setLeft(student);
			}
		}
	}
	public StudentNode getRoot(){
		return this.root;
	}
}