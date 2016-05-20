import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class AstronomyDatabase{

	public AstronomyDatabase(String fileName){
		//creates tree with data being student marks
		//creates hashTable to get a students data
		Generate(fileName);
	}

	public void Generate(String fileName){
		//will read every line int he file and will generate an array of student objects
		AstronomyTree astTree = new AstronomyTree();
		BufferedReader br;
		try{
			br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			while (line != null) {
				//create a student
				Student student = CreateRecord(line);
				StudentNode studentNode = new StudentNode(student);
				line = br.readLine();
				//add student into the tree based on there mark
				astTree.AddNode(studentNode, astTree.getRoot());
			}
		}
		catch(FileNotFoundException e){
			System.out.println("data file not found");
			System.exit(0);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	public Student CreateRecord(String line){
		String[] record = line.split("\\s+");
		String[] names = record[2].split(",");
		Student student;
		if (record[3].equals("DP")){
			student = new Student(record[0], record[1], names[0], names[1], true, Integer.parseInt(record[4]));
		}
		else{
			student = new Student(record[0], record[1], names[0], names[1], false, Integer.parseInt(record[4]));
		}
		return student;
	}


}