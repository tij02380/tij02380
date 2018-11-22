import random
list=[]
i=0
while True :
    a=random.randint(1,45)
    if(a in list) :
        continue
    else :
        list.append(a)
        list.sort()
        i=i+1
        if(i==5) : break

print(list)
