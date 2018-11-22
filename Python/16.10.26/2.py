import random

while True :
    a=input("input:")
    if(a=="포기") : break
    else :
        b=random.randint(1,3) #1:가위, 2:바위, 3:보
        if(b==1):
            if(a=="가위") : print("user:%s, computer:가위 비김"%a)
            elif(a=="바위") : print("user:%s, computer:가위 승"%a)
            else : print("user:%s, computer:가위 패"%a)
        elif(b==2):
            if(a=="가위") : print("user:%s, computer:바위 패"%a)
            elif(a=="바위") : print("user:%s, computer:바위 비김"%a)
            else : print("user:%s, computer:바위 승"%a)
        else :
            if(a=="가위") : print("user:%s, computer:보 승"%a)
            elif(a=="바위") : print("user:%s, computer:보 패"%a)
            else : print("user:%s, computer:보 비김"%a)
