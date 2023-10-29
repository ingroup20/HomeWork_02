package hw5;

public class PrintShape {

	/************************ 畫矩型 **********************/
	public void starSquare(int width, int height) {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	/************************ 畫三角形(未完成) **********************/

//	public void starTriangle(int width, int height) {
//		int allStar=width*height/2; //所有的點
//		int	layerAddStar=(allStar-height-width+1)/height;//1, 1+n, 1+n+n, ... ,width=allStar
//		if(layerAddStar<=0) System.out.print("不足成三角形");
//		int layerStar=1;
//		for (int y = 1; y <= height; y++) {
//			for (int x = 1; x <= layerStar; x++) {// 三角形尖端朝上
//				System.out.print("*");
//			}
//			layerStar=1+y*layerAddStar;
//			System.out.print("\n");
//		}
//	}

	

}
