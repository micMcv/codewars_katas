import re
def check_valid_tr_number(number):
    n = str(number)
    if re.search([^0-9], n) or n[0] == 0 or len(n) !=11:   return False
    d = list(map(int , list(n)))
    return (sum(d[0:9:2])*7 - sum(d[1:9:2]))%10==d[9] and sum(d[0:10])%10==d[10]
