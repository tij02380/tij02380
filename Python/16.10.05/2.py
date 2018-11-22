ans='j'
i=0
print("게임 시작")
while True :
    i=i+1
    print("알파벳 맞추기 : ")
    inp=input()
    if ans>inp :
        print("입력한 문자의 아스키 코드값이 작습니다.")
    elif ans<inp :
        print("입력한 문자의 아스키 코드값이 큽니다.")
    else :
        print("알파벳 맞추기 축하합니다. 정답입니다.")
        print("시도횟수 %d번"%i)
        break
    
