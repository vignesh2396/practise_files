import webbrowser
url = "https://www.youtube.com/watch?v=fRD_3vJagxk"
download = url[:12] + "ss" + url[12:]
webbrowser.open(download)