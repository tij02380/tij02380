function[y] = muller(x0,x1,x2)

f0=x0^3+x0^2-4*x0-4;
f1=x1^3+x1^2-4*x1-4;
f2=x2^3+x2^2-4*x2-4;
h0=x1-x0;
h1=x2-x1;
d0=(f1-f0)/(x1-x0);
d1=(f2-f1)/(x2-x1);
a=(d1-d0)/(h1+h0);
b=a*h1+d1;
c=f2;
sqr=sqrt(b^2-4*a*c);
if(abs(b+sqr)>abs(b-sqr))
  r=b+sqr;
else
  r=b-sqr;
end
y=x2+(-2)*c/r;