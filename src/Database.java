public interface Database{
	
	public Student CreateRecord(String line);
	public void Generate(String fileName);
	public void ViewBottom(int numberOfRecords);
	public void ViewTop(int numberOfRecords);
	
	public int getRating();
	public int getAverage();
	public int getPercentagePass();
	
}