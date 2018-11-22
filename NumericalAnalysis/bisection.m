function[y] = bisection(xl,xu) %ㅋ
 
if((log(xl^4)-0.7)*(log(xu^4)-0.7)<0)
  for i=0:2
    if((log(xl^4)-0.7)*(log(((xl+xu)/2)^4)-0.7)<0)
      xu=((xl+xu)/2);
    elseif ((log(xl^4)-0.7)*(log(((xl+xu)/2)^4)-0.7)>0)
      xl=((xl+xu)/2);
    else
      y=((xl+xu)/2);
      fprintf('x=%f',y);
      break;
    end
  end
  if((log(xl^4)-0.7)*(log(xu^4)-0.7)~=0)
    fprintf('range of root exist: [%f:%f]\n',xl,xu);
  end
else
    fprintf('error! you have to choose another number');
end