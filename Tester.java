import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Used to Test Algorithms
public class Tester
{
	private static int LENGTH;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an array length: ");
		LENGTH = Integer.valueOf(br.readLine());
		int[] iArr;
		long start, end;
		
		/*iArr = putVal();
		start = System.nanoTime();
		BogoSort.sort(iArr);
		end = System.nanoTime();
		// System.out.println(Arrays.toString(iArr));
		System.out.println("Pogosort took " + (end-start)/1000 + " microseconds");
		*/

		InsertionSort.sort(new int[]{0});

		iArr = putVal();
		start = System.nanoTime();
		InsertionSort.sort(iArr);
		end = System.nanoTime();
		long in = end-start;
		// System.out.println(Arrays.toString(iArr));
		System.out.println("InsertionSort took " + (end-start) + " nanoseconds" + sorted(iArr) + "\n");

		MergeSort.sort(new int[]{0});

		iArr = putVal();
		start = System.nanoTime();
		MergeSort.sort(iArr);
		end = System.nanoTime();
		long m = end-start;
		// System.out.println(Arrays.toString(iArr));
		System.out.println("MergeSort took " + (end-start) + " nanoseconds" + sorted(iArr) + "\n");

		/*
		SelectionSort.sort(iArr);

		iArr = putVal();
		start = System.nanoTime();
		SelectionSort.sort(iArr);
		end = System.nanoTime();
		// System.out.println(Arrays.toString(iArr));
		System.out.println("SelectionSort took " + (end-start) + " nanoseconds" + sorted(iArr) + "\n");

		BubbleSort.sort(iArr);

		iArr = putVal();
		start = System.nanoTime();
		BubbleSort.sort(iArr);
		end = System.nanoTime();
		// System.out.println(Arrays.toString(iArr));
		System.out.println("BubbleSort took " + (end-start) + " nanoseconds" + sorted(iArr) + "\n");

		iArr = putVal();
		start = System.nanoTime();
		BubbleSort.sort(iArr,true);
		end = System.nanoTime();
		// System.out.println(Arrays.toString(iArr));
		System.out.println("Reverse BubbleSort took " + (end-start) + " nanoseconds" + rSorted(iArr) + "\n");
		*/

		DualPivotQSort.sort(new int[]{0});

		iArr = putVal();
		start = System.nanoTime();
		DualPivotQSort.sort(iArr);
		end = System.nanoTime();
		long q = end-start;
		// System.out.println(Arrays.toString(iArr));
		System.out.println("Dual Pivot QuickSort took " + (end-start) + " nanoseconds" + sorted(iArr) + "\n");

		QuickSort.sort(new int[]{0});

		iArr = putVal();
		start = System.nanoTime();
		QuickSort.sort(iArr);
		end = System.nanoTime();
		long quick = end - start;
		// System.out.println(Arrays.toString(iArr));
		System.out.println("Single Pivot Quick Sort " + quick + " nanoseconds" + sorted(iArr) + "\n");

		ImprovedTSort.sort(new int[]{0});

		iArr = putVal();
		start = System.nanoTime();
		ImprovedTSort.sort(iArr);
		end = System.nanoTime();
		long i = end-start;
		// System.out.println(Arrays.toString(iArr));
		System.out.println("TimSort took " + (end-start) + " nanoseconds" + sorted(iArr) + "\n");

		System.out.print("Slowest: ");
		if(i > m && i > in && i > q && i > quick) 					System.out.println("TimSort");
		else if(in > m && in > q && in > i && in > quick) 			System.out.println("InsertionSort");
		else if(q > m && q > in && q > i && q > quick) 				System.out.println("Dual Pivot QuickSort");
		else if(quick > m && quick > q && quick > in && quick > i) 	System.out.println("Single Pivot Quick Sort");
		else														System.out.println("MergeSort");

		System.out.print("Fastest: ");
		if(i < m && i < in && i < q && i < quick) 					System.out.println("TimSort");
		else if(in < m && in < q && in < i && in < quick)			System.out.println("InsertionSort");
		else if(q < m && q < in && q < i && q < quick) 				System.out.println("QuickSort");
		else if(quick < m && quick < q && quick < in && quick < i)	System.out.println("Single Pivot QuickSort");
		else 														System.out.println("MergeSort");

		QuickSelect.quickSelect(new int[]{0,2}, 0, 1, 1);
		iArr = putVal();
		System.out.println("\nEnter the nth smallest element: ");
		int loc = Integer.valueOf(br.readLine());
		br.close();
		start = System.nanoTime();
		int num = QuickSelect.quickSelect(iArr,0,LENGTH -1,loc);
		end = System.nanoTime();
		System.out.println("\nThe nth smallest element is " + num + ". It took " + (end-start) + " nanoseconds to complete.");
	}

	private static int[] putVal()
	{
		Random rand = new Random();
		int[] result = new int[LENGTH];
		for(int i = 0; i < LENGTH; i++)
			result[i] = rand.nextInt(20)-20/2;
		return result;
	}

	private static String sorted(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			if(arr[i] > arr[i+1]) 
				return "\nTest passed: false";
		}
		return "\nTest passed: true";
	}

	/* private static String rSorted(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			if(arr[i] < arr[i+1]) return "\nTest passed: false";
		}
		return "\nTest passed: true";
	} */
}
