package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Animal implements Serializable {
	protected static final long serialVersionUID = 1L;

	public void speak() {
		System.out.println("！");
	}
}

public class CreateObject {

	/*
	 * 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
	 * 意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
	 * 
	 * 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多 型簡化本題的程式設計)
	 */

	public static void main(String[] args) throws Exception {
		Animal cat1 = new Cat("kitty");
		Animal cat2 = new Cat("Tommy");

		Animal dog1 = new Dog("Goffy");
		Animal dog2 = new Dog("Blutto");

		Animal[] fourFeet = new Animal[4];
		fourFeet[0] = cat1;
		fourFeet[1] = cat2;
		fourFeet[2] = dog1;
		fourFeet[3] = dog2;

		File newFile = new File("C:\\data\\Object.ser");
		File fileFolder = new File(newFile.getParent());
		try {
			if (!fileFolder.exists()) {
				fileFolder.mkdir();
				newFile.createNewFile();

			} else if (!newFile.exists()) {
				newFile.createNewFile();
			}

			FileOutputStream fos = new FileOutputStream(newFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (int i = 0; i < fourFeet.length; i++) {
				oos.writeObject(fourFeet[i]);
			}
			oos.close();
			fos.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/* 輸入 ******************************************************************/

		FileInputStream fis = new FileInputStream(newFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(newFile.getName()+"檔案內容如下: ");
		try {
			while(true) {
				((Animal) ois.readObject()).speak();
			}
		}catch(EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
		
		
	}

}
