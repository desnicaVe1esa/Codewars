EATERS = {"antelope": {"grass"},
          "big-fish": {"little-fish"},
          "bug":      {"leaves"},
          "bear":     {"big-fish", "bug", "chicken", "cow", "leaves", "sheep"},
          "chicken":  {"bug"},
          "cow":      {"grass"},
          "fox":      {"chicken", "sheep"},
          "giraffe":  {"leaves"},
          "lion":     {"antelope", "cow"},
          "panda":    {"leaves"},
          "sheep":    {"grass"}}


def who_eats_who(zoo):

    ansLst, zooLst, n = [zoo], zoo.split(","), 0

    while n < len(zooLst):
        while n > 0 and zooLst[n-1] in EATERS.get(zooLst[n], set()):                            # Eats on its left
            ansLst.append("{} eats {}".format(zooLst[n], zooLst.pop(n-1)))
            n -= 2

        while n >= 0 and n != len(zooLst)-1 and zooLst[n+1] in EATERS.get(zooLst[n], set()):    # Eats on its right
            ansLst.append("{} eats {}".format(zooLst[n], zooLst.pop(n+1)))

        n += 1     # Nothing to eat, step forward

    return ansLst + [','.join(zooLst)]