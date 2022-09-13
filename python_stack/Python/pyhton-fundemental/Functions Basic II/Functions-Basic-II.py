def number_down(num):
    list=[]
    for x in range(num,-1,-1):
        list.append(x)
    return list
print(number_down(5))
def print_and_return( list):
    print(list[0])
    return(list[1])
print(print_and_return([1,2]))
def first_plus_length(list):
    return list[0]+list[len(list)-1]
print(first_plus_length([1,2,3,4,5]))
def values_greater_than_second(list):
    new=[]
    for x in range(0,len(list)):
        if list[x]>list[1]:
            new.append(list[x])
    print(len(new))
    return new
print(values_greater_than_second([5,2,3,2,1,4]))
def length_and_value(x,y):
    list=[]
    for x in range(0,x+1):
        list.append(y)
    return list
print(length_and_value(4,7))





