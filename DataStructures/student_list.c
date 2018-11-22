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
	printf("학생의 이름을 입력하시오.\n");
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
		printf("동일 학번이 존재합니다.\n");
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
		printf("정보가 없습니다.\n");
}

void FindList(List *pList, int number)
{
	Node *pPre = NULL, *pLoc = NULL;
	int found = searchList(pList, &pPre, &pLoc, number);

	if(found)
		printf("%d %s\n", pLoc->number, pLoc->name);
	else
		printf("정보가 없습니다.\n");
}

void ModifyList(List *pList, int number)
{
	Node *pPre = NULL, *pLoc = NULL;
	int found = searchList(pList, &pPre, &pLoc, number);

	if(found)
	{
		printf("수정할 이름을 입력하시오.\n");
		scanf("%s", &pLoc->name);
	}
	else
		printf("정보가 없습니다.\n");
}

void PrintList(List *pList)
{
	Node *pNew = pList->head;
	printf("학생명단 : \n");
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

	printf("학생명단관리 프로그램을 실행합니다.\n");
	printf("원하는  번호를 입력하세요.\n");
	printf("------------------------------------------\n");

	while(1) {
		printf("1. 학생정보 입력\n2. 모든학생정보 출력\n");
		printf("3. 특정학번의 정보삭제\n4. 특정학번의 정보출력\n");
		printf("5. 특정학번의 이름수정\n6. 프로그램종료\n");
		scanf("%d", &a);
		if(a==1) {
			printf("학생의 학번을 입력하시오\n");
			scanf("%d", &number);
			addNode(Studentlist, number);
			printf("------------------------------------------\n");
		}
		else if(a==2) {
			PrintList(Studentlist);
			printf("------------------------------------------\n");
		}
		else if(a==3) {
			printf("학생의 학번을 입력하시오\n");
			scanf("%d", &number);
			removeList(Studentlist, number);
			printf("------------------------------------------\n");
		}
		else if(a==4) {
			printf("학생의 학번을 입력하시오\n");
			scanf("%d", &number);
			FindList(Studentlist, number);
			printf("------------------------------------------\n");
		}
		else if(a==5) {
			printf("학생의 학번을 입력하시오\n");
			scanf("%d", &number);
			ModifyList(Studentlist, number);
			printf("------------------------------------------\n");
		}
		else if(a==6) {
			printf("학생명단관리 프로그램 종료.\n");
			printf("------------------------------------------\n");
			break;
		}
		else {
			printf("잘못된 숫자 입력. 프로그램 종료.\n");
			printf("------------------------------------------\n");
			break;
		}
	}
}