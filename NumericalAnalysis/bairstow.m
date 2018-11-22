function[y] = bairstow(r,s)

a0=-2; a1=6.2; a2=-4; a3=0.7; es=0.01;
while(1)
  b3=a3;
  b2=a2+r*b3;
  b1=a1+r*b2+s*b3;
  b0=a0+r*b1+s*b2;
  if (b1==0&&b2==0)
    y(1,1)=(r+sqrt(r^2+4*s))/2;
    y(1,2)=(r-sqrt(r^2+4*s))/2;
    y(1,3)=-b2/b3;
    break;
  else
    c3=b3;
    c2=b2+r*b3;
    c1=b1+r*c2+s*c3;
    det=c2*c2-c3*c1;
    if(det~=0)
      dr=(-b1*c2+b0*c3)/det;
      ds=(-b0*c2+b1*c1)/det;
      r=r+dr;
      s=s+ds;
      if(r~=0&&s~=0)
        ear=abs(dr/r)*100;
        eas=abs(ds/s)*100;
      end
      if(ear<=es&&eas<=es)
        y(1,1)=(r+sqrt(r^2+4*s))/2;
        y(1,2)=(r-sqrt(r^2+4*s))/2;
        y(1,3)=-b2/b3;
        break;
      else
        continue;
      end
    else
      r=r+1;
      s=s+1;
    endif
  endif
endwhile

