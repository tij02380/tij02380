function[y] = secant(x0,x1)

xa=x0; xb=x1;
xc=0;
for i=1:3
  fa=2*xa^3-11.7*xa^2+17.7*xa-5;
  fb=2*xb^3-11.7*xb^2+17.7*xb-5;
  xc=xb-fb*(xb-xa)/(fb-fa);
    y(i,1)=xc; % 구한 xb를 행렬에 저장
     if(i==1) % 첫 번째로 구한 xb일 경우
         y(i,2)=100; % 이전 값을 0이라 생각하고 에러를 100퍼센트로 지정
     else % 2,와 3일 경우 이전값 존재
         y(i,2)=(y(i,1)-y(i-1,1))/y(i,1)*100; % approximate percent relative error
     end;
  xa=xb; xb=xc; % xb를 xa에 저장하여 반복
end;