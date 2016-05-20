public class StudentNode{
	
	private StudentNode parent;
	private StudentNode left;
	private StudentNode right;
	private Student data;
	public int mark;
	
	public StudentNode(Student student){
		this.data = student;
		this.mark = data.getMark();
	}
	public StudentNode getRight(){
		return right;
	}
	public void setRight(StudentNode student){
		this.right = student;
	}
	public boolean hasRight(){
		return this.getRight()!=null;
	}
	public void setLeft(StudentNode student){
		this.left=student;
	}
	public StudentNode getLeft(){
		return this.left;
	}
	public boolean hasLeft(){
		return this.getLeft()!=null;
	}
	public boolean isLeaf(){
		return this.left==null && this.right==null;
	}
	public StudentNode getParent(){
		return this.parent;
	}
	public boolean hasParent(){
		return this.getParent()!=null;
	}
	public boolean isRight(){
		return (this.getParent().getRight()==this);
	}
	public boolean isLeft(){
		return (this.getParent().getLeft()==this);
	}
}