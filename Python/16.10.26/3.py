num1,num2=map(float, input().split())
sum=lambda a,b: a+b
sub=lambda a,b: a-b
mul=lambda a,b: a*b
div=lambda a,b: a/b

print("sum=%.2f"%sum(num1,num2))
print("sub=%.2f"%sub(num1,num2))
print("mul=%.2f"%mul(num1,num2))
print("div=%.2f"%div(num1,num2))
