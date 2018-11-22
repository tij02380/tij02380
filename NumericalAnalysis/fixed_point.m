function[y] = fixed_point(x0) % fixed_point Iteration
xa=x0; % 초기값을 xa에 저장
xb=0; % g(xa)를 계산한 값을 넣을 변수를 선언
for i=1:3 % 세 번 반복
  xb=(2*xa^3-11.7*xa^2-5)/(-17.7); % xb의 값으로 g(xa)를 저장
  y(i,1)=xb; % 구한 xb를 행렬에 저장
     if(i==1) % 첫 번째로 구한 xb일 경우
         y(i,2)=100; % 이전 값을 0이라 생각하고 에러를 100퍼센트로 지정
     else % 2,와 3일 경우 이전값 존재
         y(i,2)=(y(i,1)-y(i-1,1))/y(i,1)*100; % approximate percent relative error
     end;
  xa=xb; % xb를 xa에 저장하여 반복
end;