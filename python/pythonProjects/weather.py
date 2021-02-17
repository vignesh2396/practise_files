import tkinter as tk
import requests
import time

# creating api
def getWeather(root):
    city = textfield.get()
    api = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=06c921750b9a82d8f5d1294e1586276f"

# getting the data in json format
    json_data = requests.get(api).json()
    condition = json_data['weather'][0]['main'] # output : eg : cloudy, rainy etc.

# collecting data based on the requirement
    temp = int(json_data['main']['temp'] - 273.15)
    min_temp = int(json_data['main']['temp_min'] - 273.15)
    max_temp = int(json_data['main']['temp_max'] - 273.15)
    pressure = json_data['main']['pressure']
    humidity = json_data['main']['humidity']
    wind = json_data['wind']['speed']

    # 19880 represent gst(+5.30) in seconds and value varies based on the location.
    sunrise = time.strftime("%I:%M:%S", time.gmtime(json_data['sys']['sunrise'] + 19800 ))
    sunset = time.strftime("%I:%M:%S", time.gmtime(json_data['sys']['sunset'] + 19800 ))

# concatenating all the values in a variable.
    final_info = condition + "\n" + str(temp) + "C"
    final_data = "\n" + "Max temp : " + str(max_temp) + "\n" + "Min temp : " + str(min_temp) + "\n" \
                 + "pressure : " + str(pressure) + "\n" + "Humidity : " + str(humidity) + "\n" + \
                 "wind : " + str(wind) + "\n" + "sunrise : " + str(sunrise) + "\n" + "sunset : " + str(sunset)

    # printing all the collected value
    label1.config(text = final_info)
    label2.config(text = final_data)

# creating window
root = tk.Tk()
root.geometry("600x500")
root.title("Weather App")

# creating font
t = ("poppins", 25, "bold")
f = ("poppins", 15, "bold")

# textfield
textfield = tk.Entry(root, justify='center',font=t)
textfield.pack(pady = 20)
textfield.focus()
textfield.bind('<Return>',getWeather) # returns the user input as parameter to the getWeather function

#label
label1 = tk.Label(root, font=t)
label1.pack()
label2 = tk.Label(root, font=f)
label2.pack()

root.mainloop()