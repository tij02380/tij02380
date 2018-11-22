while True :
    mon=int(input("연봉을 입력하세요 (천원단위 입력):"))
    total=0
    if mon<0:
        print("프로그램을 종료합니다.")
        break
    else:
        print("연봉 %d만원에 대한 세금계산"%(mon//10))
        if mon>=10000:
            sum1=10000*0.09
            total=total+sum1
            print("10000*0.09=  900천원")
            if mon>=40000:
                sum1=30000*0.18
                total=total+sum1
                print("30000*0.18= 5400천원")
                if mon>=80000:
                    sum1=40000*0.27
                    total=total+sum1
                    print("40000*0.27=10800천원")
                    sum1=(mon-80000)*0.36
                    total=total+sum1
                    print("%d*0.36=%5d천원"%((mon-80000),sum1))
                else:
                    sum1=(mon-40000)*0.27
                    total=total+sum1
                    print("%d*0.27=%5d천원"%((mon-40000),sum1))
            else:
                sum1=(mon-10000)*0.18
                total=total+sum1
                print("%d*0.18=%5d천원"%((mon-10000),sum1))
        else:
            sum1=mon*0.09
            total=total+sum1
            print("%d*0.09=%5d천원"%(mon,sum1))
        print("--------------------")
        print("합계=%d천원"%total)
        print(" ")
