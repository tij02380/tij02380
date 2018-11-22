import turtle, threading, random

wn=turtle.Screen()
knut=turtle.Turtle()

knut.shape("turtle")

knut.penup()
knut.goto(0,-100)
knut.pendown()
knut.circle(100)

class tut(threading.Thread):
    def __init__(self):
        threading.Thread.__init__(self)

    def run(self):
        while True:
            knut.left(random.randint(-359,360))
            knut.forward(random.randint(-100,100))
            if 100 < knut.distance(0,0):
                knut.undo()

test=tut()
test.start()


wn.onkey(wn.bye,"q")

wn.listen()
wn.mainloop()
