package HomeWorkFiles;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;




public class WorkwithFiles {
		static class Myfilter implements FilenameFilter{
		private String lists;
		Myfilter(String lists){
			this.lists=lists;
		}
		public boolean accept(File direct,String name) {
			return name.endsWith(lists);
		}
	}
		public static void checkFiles(String txtPath,String lists,ArrayList<String>list)throws IOException{
			File direct =new File(txtPath);
			File[] files=direct.listFiles(new Myfilter(lists));
			Arrays.stream(files)
			.map(file -> txtPath + " " + file.getName())
			.forEach(list::add);
		}	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			          
		            ArrayList<String> list = new ArrayList<>();

		            String lists = ".txt";

		                try {
		                	checkFiles("D://проги//Directory//txt", lists, list);
		                } catch (IOException e) {
		                    e.printStackTrace();
		                }
		                list.stream()
				        .forEachOrdered(System.out::println);
				            
		           long total= list.stream().count();
		      System.out.println("How many Files:"+" "+ total);
		            
		}
}

	

