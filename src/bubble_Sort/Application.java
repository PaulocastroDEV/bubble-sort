package bubble_Sort;

public class Application {
	public static void main(String args[]) {
		int vetor[]= {1,150,123,400,350,2,900,122};
		bubbleSort(vetor);
	}
	public static void bubbleSort(int v[]) {
		int i,j,auxiliar;
		for(i=1;i<v.length;i++) {
			for(j=0;j<v.length-i;j++) {
				if(v[j]>v[j+1]) {
					auxiliar=v[j];
					v[j]=v[j+1];
					v[j+1]=auxiliar;
				}
			}
		}
		for(int vetor:v) {
			System.out.printf("%d ",vetor);
		}
	}
}
