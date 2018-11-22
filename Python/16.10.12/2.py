f=open("monja.txt","w+")
for i in range(0,5):
    data="monja monja\n"
    f.write(data)

f.seek(0)
data1=f.read()
print(data1)
f.close()
