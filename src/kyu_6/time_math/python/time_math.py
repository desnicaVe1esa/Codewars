import datetime


def time_math(time1, op, time2):
    time1 = datetime.datetime.strptime(time1, '%H:%M:%S')
    time2 = time2.split(":")
    x = eval("time1 " + op + " datetime.timedelta(hours =int(time2[0]),minutes=int(time2[1]),seconds=int(time2[2]))")
    return x.strftime("%H:%M:%S")
