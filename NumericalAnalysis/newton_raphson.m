function[y] = newton_raphson(x0)

xa=x0;
xb=0;
for i=1:3
  xb=xa-(2*xa^3-11.7*xa^2+17.7*xa-5)/(6*xa^2-23.4*xa+17.7);
  y(i,1)=xb; % 구한 xb를 행렬에 저장
     if(i==1) % 첫 번째로 구한 xb일 경우
         y(i,2)=100; % 이전 값을 0이라 생각하고 에러를 100퍼센트로 지정
     else % 2,와 3일 경우 이전값 존재
         y(i,2)=(xb-xa)/xb*100; % approximate percent relative error
     end;
  xa=xb; % xb를 xa에 저장하여 반복
end;