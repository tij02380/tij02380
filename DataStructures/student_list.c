#include <stdio.h>
#include <stdlib.h>

typedef struct node
{
	char name[10];
	int number;
	struct node *link;
} Node;

typedef struct
{
	int count;
	Node *head;
} List;

void createList(List* list) {
	list->count = 0;
	list->head = NULL;
}

void insertList(List *pList, Node* pPre, int number)
{
	Node* pNew = (Node*)malloc(sizeof(Node));
	printf("�л��� �̸��� �Է��Ͻÿ�.\n");
	scanf("%s", &pNew->name);
	pNew->number = number;

	if(pPre==NULL)
	{
		pNew->link = pList->head;
		pList->head = pNew;
	}
	else
	{
		pNew->link = pPre->link;
		pPre->link = pNew;
	}
	pList->count++;

}

int searchList(List *pList, Node **ppPre, Node **ppLoc, int number)
{
	for(*ppPre = NULL, *ppLoc=pList->head; *ppLoc != NULL; *ppPre=*ppLoc, *ppLoc = (*ppLoc)->link)
	{
		if((*ppLoc)->number == number)
			return 1;
		else if((*ppLoc)->number > number)
			break;
	}
	return 0; 
}

void addNode(List *pList, int number)
{
	Node *pPre = NULL, *pLoc = NULL;
	int found = searchList(pList, &pPre, &pLoc, number);

	if(!found)
		insertList(pList, pPre, number);
	else
		printf("���� �й��� �����մϴ�.\n");
}

void deleteList(List *pList, Node *pPre, Node *pLoc)
{
	if(pPre == NULL)
		pList->head = pLoc->link;
	else
		pPre->link= pLoc->link;

	free(pLoc);
	pList->count--;
}

void removeList(List *pList, int number)
{
	Node *pPre = NULL, *pLoc = NULL;
	int found = searchList(pList, &pPre, &pLoc, number);

	if(found)
		deleteList(pList, pPre, pLoc);
	else
		printf("������ �����ϴ�.\n");
}

void FindList(List *pList, int number)
{
	Node *pPre = NULL, *pLoc = NULL;
	int found = searchList(pList, &pPre, &pLoc, number);

	if(found)
		printf("%d %s\n", pLoc->number, pLoc->name);
	else
		printf("������ �����ϴ�.\n");
}

void ModifyList(List *pList, int number)
{
	Node *pPre = NULL, *pLoc = NULL;
	int found = searchList(pList, &pPre, &pLoc, number);

	if(found)
	{
		printf("������ �̸��� �Է��Ͻÿ�.\n");
		scanf("%s", &pLoc->name);
	}
	else
		printf("������ �����ϴ�.\n");
}

void PrintList(List *pList)
{
	Node *pNew = pList->head;
	printf("�л���� : \n");
	while(pNew!=NULL)
	{
		printf("%d %s\n", pNew->number, pNew->name);
		pNew=pNew->link;
	}
}

void main()
{
	int number;
	int a;
	List* Studentlist=(List*)malloc(sizeof(List));
	createList(Studentlist);

	printf("�л���ܰ��� ���α׷��� �����մϴ�.\n");
	printf("���ϴ�  ��ȣ�� �Է��ϼ���.\n");
	printf("------------------------------------------\n");

	while(1) {
		printf("1. �л����� �Է�\n2. ����л����� ���\n");
		printf("3. Ư���й��� ��������\n4. Ư���й��� �������\n");
		printf("5. Ư���й��� �̸�����\n6. ���α׷�����\n");
		scanf("%d", &a);
		if(a==1) {
			printf("�л��� �й��� �Է��Ͻÿ�\n");
			scanf("%d", &number);
			addNode(Studentlist, number);
			printf("------------------------------------------\n");
		}
		else if(a==2) {
			PrintList(Studentlist);
			printf("------------------------------------------\n");
		}
		else if(a==3) {
			printf("�л��� �й��� �Է��Ͻÿ�\n");
			scanf("%d", &number);
			removeList(Studentlist, number);
			printf("------------------------------------------\n");
		}
		else if(a==4) {
			printf("�л��� �й��� �Է��Ͻÿ�\n");
			scanf("%d", &number);
			FindList(Studentlist, number);
			printf("------------------------------------------\n");
		}
		else if(a==5) {
			printf("�л��� �й��� �Է��Ͻÿ�\n");
			scanf("%d", &number);
			ModifyList(Studentlist, number);
			printf("------------------------------------------\n");
		}
		else if(a==6) {
			printf("�л���ܰ��� ���α׷� ����.\n");
			printf("------------------------------------------\n");
			break;
		}
		else {
			printf("�߸��� ���� �Է�. ���α׷� ����.\n");
			printf("------------------------------------------\n");
			break;
		}
	}
}