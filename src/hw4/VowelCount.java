package hw4;

public class VowelCount {
	
	public int checkWord(String words,char oneWord) {
		int n=0;
		for(int i =0;i<words.length();i++) {
			if(words.charAt(i)==oneWord) {
				n++;
			}
		}
		return n;
	}
	
	public void printTwoArrary(char[] oneword, int[] count) {
		for(int i=0;i<count.length;i++) {
			System.out.println(oneword[i]+"出現次數= "+ count[i]);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		String[] sentence= {"mercury", "venus", "earth","mars","jupiter","saturn","uranus","neptune"};
		char[] vowel= {'a','e','i','o','u'};
		int[] count=new int[5];
		
		VowelCount vc1=new VowelCount();
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<sentence.length;j++) {
				//char與string 比對，回寫次數
				count[i]+=vc1.checkWord(sentence[j],vowel[i]);//每個string找到的n累加
			}
		}
		
		vc1.printTwoArrary(vowel,count);
		
	}
	
	
	
}
