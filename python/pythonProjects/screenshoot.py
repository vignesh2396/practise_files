# install packages
# pip install pyautogui
# in linux install sudo apt-get install scrot

import pyautogui
import tkinter as tk
from tkinter.filedialog import *

root = tk.Tk()

canvas = tk.Canvas(root, width=300, height=300)
canvas.pack()


def takeScreenshot():
    myScreenshot = pyautogui.screenshot()
    savepath = asksaveasfilename()
    myScreenshot.save(savepath + "_sc.png")


myButton = tk.Button(text="Screenshot", command=takeScreenshot, font=10)
canvas.create_window(150, 150, window=myButton)

root.mainloop()
