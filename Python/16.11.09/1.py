import turtle

wn=turtle.Screen()
knut=turtle.Turtle()

def tri():
    for i in range(3):
        knut.forward(100)
        knut.left(120)

def squ():
    for i in range(4):
        knut.forward(100)
        knut.left(90)

def cir():
    knut.circle(50)

wn.onkey(tri,"t")
wn.onkey(squ,"r")
wn.onkey(cir,"c")

wn.listen()
wn.mainloop()
