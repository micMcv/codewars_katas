def paper_fold(t=0):
    i = -1
    while True:
        i += 1
        t = i
        while t % 2 != 0:   t //=2
        yield 0 if t % 4 else 1
