for i in range(5,0,-1):
    for j in range(1,9):
        if (i>=3) and (j>=7):
            break
        print("%4d"%(i*100+j), end=" ")
    print(" ")
