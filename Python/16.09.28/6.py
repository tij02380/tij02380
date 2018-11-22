print("menu")
print("1. 원 넓이 계산하기")
print("2. 사각형 넓이 계산하기")
print("3. 삼각형 넓이 계산하기")
print("4. 종료")
print("메뉴를 선택하시오")

menu=int(input("menu:"))
if menu==1 :
    r=int(input("r:"))
    if r<0 :
        print("error")
    else :
        print("area = %dpi"%(r*r))
elif menu==2 :
    w=int(input("w:"))
    h=int(input("h:"))
    if w<0 or h<0 :
        print("error")
    else :
        print("area = %d"%(w*h))
elif menu==3 :
    w=int(input("w:"))
    h=int(input("h:"))
    if w<0 or h<0 :
        print("error")
    else :
        print("area = %d"%(w*h/2))
elif menu==4
    print("종료")
else
    print("잘못된 입력 종료합니다.")
