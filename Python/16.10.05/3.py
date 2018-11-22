year=int(input("년을 입력하시오:"))
month=int(input("월을 입력하시오:"))
date=int(input("1일의 요일을 입력하시오 (일:0, 월:1, ... , 토:6):"))
print(' ')
print("\t\t>>> %d년도 %d월 <<<"%(year,month))
print("일\t월\t화\t수\t목\t금\t토")
print(' ')

count=0
switch=0
for i in range(0,date):
    print("  \t",end='')
for i in range(date,7):
    count=count+1
    print("%2d\t"%count,end='')
print(' ')

while True:
    for i in range(0,7):
        count=count+1
        print("%2d\t"%count,end='')
        if month in [1,3,5,7,8,10,12]:
            if count==31:
                switch=1
                break
        elif month in [4,6,9,11]:
            if count==30:
                switch=1
                break
        else:
            if count==28:
                switch=1
                break
    print(' ')
    if switch==1: break
