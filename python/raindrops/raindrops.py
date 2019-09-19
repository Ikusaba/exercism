def convert(number):
    def pling(): return 'Pling' if number % 3 == 0 else ''
    def plang(): return 'Plang' if number % 5 == 0 else ''
    def plong(): return 'Plong' if number % 7 == 0 else ''
    result = "".join([pling(), plang(), plong()])
    return result if result else str(number)
