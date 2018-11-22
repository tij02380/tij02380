num=int(input("1에서 9사이의 정수 1개를 입력하세요:"))

print("출력:")
for i in range(1,num+1):
    for k in range(1,i+1):
        print("%d"%k, end="")
    for j in range(0,num-i):
        print("*", end="")
    print('')
