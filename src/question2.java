import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;


public class question2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		String filepath = "/Users/wangru/Desktop/study/languageStatistics/hw1/PeterPan.txt";//JaneEyre
		BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
		HashSet<String> set = new HashSet<String>();
		String tmp = new String();
		int res_i = 0;
		int res_him = 0;
		int sum = 0;
		while((tmp = br.readLine()) != null){
			String[] r = tmp.toLowerCase().split(" ");
			for(int i = 0; i < r.length; i++){
				set.add(r[i]);
				sum++;
				//System.out.println(r[i]);
				//if(r[i].equals("i")||r[i].equals("she") || r[i].equals("he") || r[i].equals("me") || r[i].equals("him")|| r[i].equals("we")|| r[i].equals("his") || r[i].equals("her")|| r[i].equals("my"))
				if(r[i].equals("she") || r[i].equals("he") || r[i].equals("him")|| r[i].equals("his") || r[i].equals("her"))
					res_him++;
				if(r[i].equals("i") || r[i].equals("me")|| r[i].equals("my"))	
					res_i++;
			}
		}
		System.out.println("The sum is " + sum);
		System.out.println("The richness of the word: " + set.size() + ", Ratio: " + (double) set.size()/sum);
		System.out.println("The first personal prononun of the word: " + res_i +", Ratio: "+ (double) res_i/sum);
		System.out.println("The second personal prononun of the word: " + res_him +", Ratio: "+ (double) res_him/sum);
	}
}
