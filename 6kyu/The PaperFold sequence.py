def paper_fold(i=-1,t=0):
    while True:
        i += 1
        t = i
        while t%2: t>>=1
        yield not t%4
