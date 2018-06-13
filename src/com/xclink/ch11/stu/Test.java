package com.xclink.ch11.stu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class ScoreCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student st1 = null,st2 = null;
		if(o1 instanceof Student && o2 instanceof Student){
			st1 = (Student) o1;
			st2 = (Student) o2;
			
			return st2.getScore()-st1.getScore()>=0?1:-1;
		}
		
		return 0;
	}
	
}
public class Test {
	
	public static void main(String[] args) {
		
		String file = "d:\\students.txt";
		String fileObj = "d:\\students_obj.txt";
		
		/*//1.随机生成1000个学生信息
		ArrayList<Student> list = randStudent();
		
		//2.写入文件
		saveStudentInfoToFile(file, list);
		
		//3.读入文件  字节流---->字节流到字符流的转换(InputStreamReader)-->BufferedReader:readLine(换出的字符流)
		Student[] stus = readTop10(file);
		//
		
		//4.前10名写入对象流
		saveTop10ToObjStream(fileObj, stus);
		
		//5.从对象流中读出
		readStudentFromObjStream(fileObj);*/
		
		
		//Student [name=张0, age=14, phone=13342004158, score=93]
		//Student [name=张0, age=14, phone=13342004158, scor1003]
		//Student [name=张0, age=14, phone=13342004158, score=100
		
		//6.从学生信息中查找 {张66} 把分数加10 写入文件  用方案二
		FileReader fr = null;
		BufferedReader br = null;
		int position = 0,bytesPos=0 ;
		String line = null;
		int destRow = 2;
		int rows = 1;
		try {
			fr = new FileReader(new File(file));
			br = new BufferedReader(fr);
			while((line=br.readLine())!=null){
				
				if(rows<destRow){
					bytesPos = bytesPos+line.getBytes().length+2; //
				}else if(rows==destRow){
					position = line.lastIndexOf('='); //换行 
					bytesPos = bytesPos+line.substring(0,position+1).getBytes().length;
				}else{
					break;
				}
				rows++;
			}
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(bytesPos);
		
		//123456789
		//123456abc
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(file,"rw");
			raf.seek(bytesPos);//POS ？？？？？？
			raf.write("30".getBytes());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	private static void readStudentFromObjStream(String fileObj) {
		ObjectInputStream is = null;
		try {
			is = new ObjectInputStream(new FileInputStream(new File(fileObj)));
			
			//Student[] stu = (Student[]) is.readObject();
			
			for(int i=0;i<10;i++){
				Student stu  = (Student) is.readObject();
				System.out.println(stu);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	private static void saveTop10ToObjStream(String fileObj, Student[] stus) {
		ObjectOutputStream os = null;
		try {
			os = new ObjectOutputStream(new FileOutputStream(new File(fileObj)));
			
			//os.writeObject(stus);
			
			for(int i=0;i<10;i++){
				os.writeObject(stus[i]);
			}
			
			os.flush();
			
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	private static Student[] readTop10(String file) {
		Student[] students = new Student[10];
		TreeSet set = new TreeSet(new ScoreCompare());
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(new File(file));
			BufferedReader bf = new BufferedReader(new InputStreamReader(fs));
			String line = null;String[] filedInfo=null; //
			int firstPos = 0,lastPos=0;
			
			while((line=bf.readLine())!=null){
				firstPos = line.indexOf('[');
				lastPos = line.lastIndexOf(']');
				//name=张0, age=14, phone=13333001136, score=47
				filedInfo = line.substring(firstPos-1, lastPos).split(",");
				
				String name = (filedInfo[0].split("="))[1];
				Student p = new Student(name);
				p.setAge(Integer.valueOf((filedInfo[1].split("="))[1])); //age
				p.setPhone((filedInfo[2].split("="))[1]); 				 //phone
				p.setScore(Integer.valueOf((filedInfo[3].split("="))[1])); //score
				
				set.add(p);
				
			}
			
			int times =0;
			Iterator it = set.iterator();
			while(it.hasNext()&&times<10){
				students[times] = (Student) it.next();
				times++;
			}
			
			return students;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return students;
	}


	private static void saveStudentInfoToFile(String file,
			ArrayList<Student> list) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(new File(file));
			for(int i=0;i<list.size();i++){
				fw.write(list.get(i).toString());
				fw.write("\r\n");
			}
			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	/*****
	 * //1.随机生成1000个学生信息
	 * @return
	 */
	private static ArrayList<Student> randStudent() {
		ArrayList<Student> list = new ArrayList<Student>();
		for(int i=0;i<1000;i++){
			list.add(new Student("张"+i));
		}
		return list;
	}
}
