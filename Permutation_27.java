package offer;

import java.util.ArrayList;

public class Permutation_27 {
	
	ArrayList<String> resA = new ArrayList<>();
	public ArrayList<String> Permutation(String str) {
	
		
		solution(str,"");
		return resA;
    }
	
	public void solution(String str, String res){
		if(str.length() == 0 && res.length() != 0){
			if(!resA.contains(res))
				resA.add(res);
			return ;
		}
		for(int i = 0;i  < str.length(); i++){
			String temp = str.substring(0, i) + str.substring(i+1,str.length());
			solution(temp, res + str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Permutation_27 p = new Permutation_27();
		
		System.out.println(p.Permutation("aa"));
	}

}
