public class StudentNode{
	
	private StudentNode parent;
	private StudentNode left;
	private StudentNode right;
	private Student data;
	public int mark = data.getMark();
	
	public StudentNode getRight(){
		return right;
	}
	
	public StudentNode getLeft(){
		return left;
	}
	
	public void setRight(Student student){
		this.right = student;
	}
	
	public void getLeft(Student student){
		this.left=student;
	}
	
	public boolean isLeaf(){
		return this.left==null && this.right==null;
	}
}