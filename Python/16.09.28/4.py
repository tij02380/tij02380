y=input("input: ")
year=int(y)

if (year%4==0) and not(year%100==0) or (year%400==0):
    print("윤년")
else :
    print("윤년이 아니다")
