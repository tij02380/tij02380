from tkinter import *

def cal():
    l4.configure(text= "%s=%s"%(e1.get(),eval(e1.get())), width=20 ,bg='yellow')

wn = Tk()
f1 = Frame(wn)
f2 = Frame(wn)
wn.title("2014104290")

l1 = Label(f1,text="Oprandtion")
l2 = Label(f1,text="result")
l4 = Label(f1)
e1 = Entry(f1, width = 20)
b1 = Button(f2, text="Calculation",command = cal)

l1.grid(row=0, column=0)
l2.grid(row=1, column=0)
e1.grid(row=0,column=1)
l4.grid(row=1,column=1)

b1.grid(row=0, column=0)

f1.grid(row=0)
f2.grid(row=1)

wn.mainloop()
