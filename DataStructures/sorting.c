#include <stdio.h>
#include <time.h> 
void insertionSort(int list[], int last)
{
	int hold;
	int walker;
	int current;

	for(current = 1; current <= last; current++)
	{
		hold = list[current];
		for(walker = current - 1; walker >=0 && hold < list[walker]; walker--)
			list[walker + 1] = list[walker];
		list [walker + 1] = hold;
	}
	return;
}

void selectionSort (int list[], int last)
{
	int smallest;
	int holdData;
	int current;
	int walker;

	for (current = 0; current < last; current++)
	{
		smallest = current;
		for (walker = current + 1; walker <= last; walker++)
			if (list [walker] < list [smallest])
				smallest = walker;

		holdData = list[current];
		list[current] = list[smallest];
		list[smallest] = holdData;
	}
	return;
}

void reheapUp (int* heap, int newNode)
{
	int parent;
	int hold;

	if (newNode)
	{
		parent = (newNode - 1) / 2;
		if (heap[newNode] > heap[parent])
		{
			hold = heap[parent];
			heap[parent] = heap[newNode];
			heap[newNode] = hold;
			reheapUp (heap, parent);
		}
	}
	return;
}

void reheapDown (int* heap, int root, int last)
{
	int hold;
	int leftKey;
	int rightKey;
	int largeChildKey;
	int largeChildIndex;

	if ((root * 2 + 1) <= last)
	{
		leftKey = heap[root * 2 +1];
		if ((root * 2 + 2) <= last)
			rightKey = heap[root * 2 + 2];
		else
			rightKey = -1;
		if (leftKey > rightKey)
		{
			largeChildKey = leftKey;
			largeChildIndex = root * 2 + 1;
		}
		else
		{
			largeChildKey = rightKey;
			largeChildIndex = root * 2 + 2;
		}
		if (heap[root] < heap[largeChildIndex])
		{
			hold = heap[root];
			heap[root] = heap[largeChildIndex];
			heap[largeChildIndex] = hold;
			reheapDown (heap, largeChildIndex, last);
		}
		return;
	}
}

void heapSort (int list[], int last)
{
	int sorted;
	int holdData;
	int walker;

	for (walker = 1; walker <= last; walker++)
		reheapUp(list, walker);

	sorted = last;
	while (sorted > 0)
	{
		holdData = list[0];
		list[0] = list[sorted];
		list[sorted] = holdData;
		sorted--;
		reheapDown (list, 0, sorted);
	}
	return;
}

void quickInsertion (int data[], int first, int last)
{
	int hold;
	int walker;
	int current;

	for (current = first + 1; current <= last; current++)
	{
		hold = data[current];
		walker = current - 1;
		while (walker >= first && hold < data[walker])
		{
			data[walker + 1] = data[walker];
			walker = walker - 1;
		}
		data[walker + 1] = hold;
	}
	return;
}

void medianLeft (int sortData[], int left, int right)
{
	int mid;
	int hold;

	mid = (left + right) / 2;
	if (sortData[left] > sortData[mid])
	{
		hold = sortData[left];
		sortData[left] = sortData[mid];
		sortData[mid] = hold;
	}
	if (sortData[left] > sortData[right])
	{
		hold = sortData[left];
		sortData[left] = sortData[right];
		sortData[right] = hold;
	}
	if (sortData[mid] > sortData[right])
	{
		hold = sortData[mid];
		sortData[mid] = sortData[right];
		sortData[right] = hold;
	}
	hold = sortData[left];
	sortData[left] = sortData[mid];
	sortData[mid] = hold;

	return;
}

void quickSort (int sortData[], int left, int right)
{
#define MIN_SIZE 16

	int sortLeft;
	int sortRight;
	int pivot;
	int hold;
	if ((right - left) > MIN_SIZE)
	{
		medianLeft (sortData, left, right);
		pivot = sortData[left];
		sortLeft = left + 1;
		sortRight = right;
		while (sortLeft <= sortRight)
		{
			while (sortData[sortLeft] < pivot)
				sortLeft = sortLeft + 1;
			while (sortData[sortRight] >= pivot)
				sortRight = sortRight - 1;
			if (sortLeft <= sortRight)
			{
				hold = sortData[sortLeft];
				sortData[sortLeft] = sortData[sortRight];
				sortData[sortRight] = hold;
				sortLeft = sortLeft + 1;
				sortRight = sortRight - 1;
			}
		}
		sortData[left] = sortData[sortLeft - 1];
		sortData[sortLeft - 1] = pivot;
		if (left < sortRight)
			quickSort (sortData, left, sortRight - 1);
		if (sortLeft < right)
			quickSort (sortData, sortLeft, right);
	}
	else
		quickInsertion (sortData, left, right);
	return;
}

void main() {
	int a;
	int i;
	int n;
	int input[1000];
	clock_t bt;
	clock_t ft;

	while(1) {
		FILE *f=fopen("input.txt","r"); 
		for(i=0; i<1000; i++) {
			fscanf(f,"%d",&a);
			input[i]=a;
		}
		printf("------------------------------------------\n");
		printf("원하는 sorting 방법을 선택하시오.\n");
		printf("1. Straight Insertion Sort\n2. Straight Selection Sort\n3. Heap Sort\n4. Quick Sort\n");
		printf("------------------------------------------\n");
		scanf("%d", &n);

		if(n==1) {
			bt = clock();
			insertionSort(input, 999);
			ft = clock();
			for(i=0; i<1000; i++)
				printf("%d ", input[i]);
			printf("\n");
			printf("------------------------------------------\n");
			printf("before time : %d msec\n", ft);
			printf("after time : %d msec\n", bt);
			printf("알고리즘 소요 시간 : %d msec\n", ft-bt);
		}
		else if(n==2) {
			bt = clock();
			selectionSort (input, 999);
			ft = clock();
			for(i=0; i<1000; i++)
				printf("%d ", input[i]);
			printf("\n");
			printf("------------------------------------------\n");
			printf("before time : %d msec\n", ft);
			printf("after time : %d msec\n", bt);
			printf("알고리즘 소요 시간 : %d msec\n", ft-bt);
		}
		else if(n==3) {
			bt = clock();
			heapSort (input, 999);
			ft = clock();
			for(i=0; i<1000; i++)
				printf("%d ", input[i]);
			printf("\n");
			printf("------------------------------------------\n");
			printf("before time : %d msec\n", ft);
			printf("after time : %d msec\n", bt);
			printf("알고리즘 소요 시간 : %d msec\n", ft-bt);
		}
		else if(n==4) {
			bt = clock();
			quickSort (input, 0, 999);
			ft = clock();
			for(i=0; i<1000; i++)
				printf("%d ", input[i]);
			printf("\n");
			printf("------------------------------------------\n");
			printf("before time : %d msec\n", ft);
			printf("after time : %d msec\n", bt);
			printf("알고리즘 소요 시간 : %d msec\n", ft-bt);
		}
		else {
			printf("잘못된 숫자 입력. 프로그램 종료.\n");
			printf("------------------------------------------\n");
			break;
		}
		fclose(f);
	}
}
