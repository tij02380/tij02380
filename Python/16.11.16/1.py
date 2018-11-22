from tkinter import *

def sum():
    s=int(e1.get())+int(e2.get())
    l4.configure(text=s, width=10 ,bg='red')

def sub():
    s=int(e1.get())-int(e2.get())
    l4.configure(text=s, width=10, bg='red')

def mul():
    s=int(e1.get())*int(e2.get())
    l4.configure(text=s, width=10, bg='red')

def div():
    s=int(e1.get())/int(e2.get())
    l4.configure(text=s, width=10, bg='red')

wn = Tk()
f1 = Frame(wn)
f2 = Frame(wn)
wn.title("2014104290")

l1 = Label(f1,text="Oprand 1")
l2 = Label(f1,text="Oprand 2")
l3 = Label(f1,text="Result")
l4 = Label(f1)
e1 = Entry(f1, width = 20)
e2 = Entry(f1, width = 20)
b1 = Button(f2, text="+",command = sum)
b2 = Button(f2, text="-",command = sub)
b3 = Button(f2, text="*",command = mul)
b4 = Button(f2, text="/",command = div)

l1.grid(row=0, column=0)
l2.grid(row=1, column=0)
e1.grid(row=0,column=1)
e2.grid(row=1,column=1)
l3.grid(row=0, column=2, rowspan=2)
l4.grid(row=0, column=3, rowspan=2)

b1.grid(row=0, column=0)
b2.grid(row=0, column=1)
b3.grid(row=0, column=2)
b4.grid(row=0, column=3)


f1.grid(row=0)
f2.grid(row=1)

wn.mainloop()
