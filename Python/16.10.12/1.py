f=open("gugudan.txt","w+")
for i in range(1,10):
    for j in range(2,10):
        data="%dx%d=%2d " %(j,i,j*i)
        f.write(data)
    data="\n"
    f.write(data)

f.seek(0)
data1=f.read()
print(data1)
f.close()
