import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class AstronomyDatabase{

	public AstronomyDatabase(String fileName){
		Generate(fileName);
	}

	public void Generate(String fileName){
		//will read every line int he file and will generate an array of student objects
		BufferedReader br;
		try{
			br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			while (line != null) {
				line = br.readLine();
				//create a student
				CreateRecord(line);
				//add student into the tree
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

	public void CreateRecord(String line){
		String[] record = line.split("\\s+");
		String[] names = record[2].split(",");
		System.out.println(names[0]+" "+names[1]);
		if (record[3].equals("DP")){
			Student student = new Student(record[0], record[1], names[0], names[1], true, Integer.parseInt(record[4]));
		}
		//return student;
	}


}