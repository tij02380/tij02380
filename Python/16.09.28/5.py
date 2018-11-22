x1=int(input("x1:"))
y1=int(input("y1:"))
x2=int(input("x2:"))
y2=int(input("y2:"))

if (x2-x1)==0 :
    print("error")
else :
    m=(y2-y1)/(x2-x1)
    q=y1-m*x1
    print("y=%dx+%d"%(m,q))
