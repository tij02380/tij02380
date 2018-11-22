function[y] = false_position(xl,xu)
 
if((log(xl^4)-0.7)*(log(xu^4)-0.7)<0)
  for i=0:2
    xr=(xl*(log(xu^4)-0.7)-xu*(log(xl^4)-0.7))/((log(xu^4)-0.7)-(log(xl^4)-0.7));
    if((log(xl^4)-0.7)*(log(xr^4)-0.7)<0)
        xu=xr;
    elseif ((log(xl^4)-0.7)*(log(xr^4)-0.7)>0)
        xl=xr;
    else
        y=xr;
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