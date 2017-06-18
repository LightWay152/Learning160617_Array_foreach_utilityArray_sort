package lab.Array_foreach_utilityArray_sort.com;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArray {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*Demo1: introArrayComponent*/
		//introArrayComponent();

		/*Demo2: sumOfEvenInArray*/
		//sumOfEvenInArray();

		/*Demo3: findMinInArray*/
		//findMinMaxInArray();

		/*Demo4: findMinInArray*/
		//demoInArray();

		/*Demo5: findNamePositionInArray*/
		//findNamePositionInArray();

		/*Demo6: customizeSortAlgorithm*/
		//customizeSortAlgorithm();

		/*Demo7: customizeSortAlgorithm2*/
		//customizeSortAlgorithm2();
		
	}
	
	private static void customizeSortAlgorithm2() {

		/*Note: 
		 * scanner.nextLine() -> read Text+Enter
		 * scanner.nextInt() -> read Integer (don't read Enter) -> Error
		 * scanner.nextDouble() -> read Double (don't read Enter) -> Error
		 * */
		System.out.print("Number of elements: ");
		int n = scanner.nextInt();scanner.nextLine();
		/*scanner.nextInt() -> read Integer (don't read Enter) -> Error*/

		String[] names = new String[n];
		double[] marks = new double[n];

		for(int i=0;i<n;i++){
			System.out.printf("Name %d:",i+1);
			names[i] = scanner.nextLine();

			System.out.printf("Mark %d:",i+1);
			marks[i] = scanner.nextDouble();scanner.nextLine();
			/*scanner.nextDouble() -> read Double (don't read Enter) -> Error*/
		}

		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(marks));

		for(int i=0;i<marks.length;i++){
			for(int j=i+1;j<marks.length;j++){
				if(marks[j]<marks[i]){
					double x = marks[i];
					marks[i] = marks[j];
					marks[j] = x;

					String y = names[i];
					names[i] = names[j];
					names[j] = y;
				}
			}
		}

		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(marks));

	}

	private static void customizeSortAlgorithm() {

		int[] a = { 9, 8, 2, 1, 7, 5, 4 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}

		System.out.println(Arrays.toString(a));

	}

	private static void findNamePositionInArray() {

		String[] names = new String[6];

		//Input
		for(int i=0;i<names.length;i++){
			System.out.printf("Name %d = ",i+1);
			names[i]=scanner.nextLine();
		}

		//Output
		System.out.println(Arrays.toString(names));

		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		int x = Arrays.binarySearch(names, "Teo");
		System.out.printf("Teo at position "+x);

	}

	private static void demoInArray() {

		/* Initial and display array*/
		int[] a = {9,8,2,1,7,5,4};
		System.out.println(Arrays.toString(a));

		/*Sort and display array after again*/
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		/*Search element 5 in array*/
		int i = Arrays.binarySearch(a, 5);
		System.out.printf("Position of 5 is %d\r\n",i);

		/*Fill all of element in array by 2017*/
		Arrays.fill(a,2017);
		System.out.println(Arrays.toString(a));

	}

	private static void findMinMaxInArray() {

		double[] a = {9,8,2,1,7,5,4};		
		double min = a[0];

		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min = a[i];
			}
		}

		System.out.printf("Min = %.0f\n",min);

		double max = a[0];

		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max = a[i];
			}
		}

		System.out.printf("Max = %.0f",max);

	}

	private static void sumOfEvenInArray() {

		int n, a[];

		System.out.print("Number of elements: ");
		n = scanner.nextInt();

		a = new int[n];
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d] = ",i);
			a[i]=scanner.nextInt();
		}

		System.out.print("Array is: ");
		System.out.println(Arrays.toString(a));

		int sum = 0;
		for(int x: a){
			if(x%2==0){
				sum+=x;
			}
		}

		System.out.printf("Sum of even numbers = %d",sum);

	}

	private static void introArrayComponent() {

		int[] a={5,9,2,4,8,7,1};

		System.out.println(Arrays.toString(a));
		System.out.printf("a[3]=%d\n",a[3]);
		System.out.printf("a.length=%d\n",a.length);
		a[3]=a[1]*5;
		System.out.println(Arrays.toString(a));

	}

}
