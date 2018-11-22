f=open("score.txt","w+")
for i in range(0,3):
    people=[x for x in input().split(',')]
    for j in people:
        peo="%s "%j
        f.write(peo)
    ava=(float(people[3])+float(people[4]))/2
    data="avarage = %0.2f\n" %ava
    f.write(data)

f.seek(0)
data1=f.read()
print(data1)
f.close()
