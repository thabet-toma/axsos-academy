#1 Given a list, write a function that changes all positive numbers in the list to "big".
def replace_positive(list):
    for x in range(0,len(list)):
        if list[x]>0:
            list[x]="big"
    return list
print(replace_positive([-1,5,-5,4,4]))
#2Given a list of numbers, create a function to replace the last value with the number of positive values
def count_positives(list):
    count=0
    for x in range(0,len(list)):
        if list[x]>0:
            count+=1
    list[len(list)-1]=count
    return list
print (count_positives([-1,1,1,3]))
#3 Create a function that takes a list and returns the sum of all the values in the list.
def  sum_total(list):
    sum=0
    for x in range(0,len(list)):
        sum+=list[x]
    return sum
print( sum_total([1,2,3,4]))
#4create a function that takes a list and returns the average of all the values
def Average(list):
    sum=0
    for x in range(0,len(list)):
        sum+=list[x]
    return sum/(len(list))
print(Average([1,2,3,4]))
#5 Create a function that takes a list and returns the length of the list.
def length(list):
    return len(list)
print(length([5,2]))
#6 Create a function that takes a list of numbers and returns the minimum value in the list. If the list is empty, have the function return False.
def minimum(list):
    
    if list!=[]:
        min=list[0]
        for x in range(1,len(list)):
            if list[x]<min:
                min=list[x]
        return min
    else:
        return False
print(minimum([-1,5,2,3]))
#7 Create a function that takes a list and returns the maximum value in the list. If the list is empty, have the function return False
def maximum(list):
    
    if list!=[]:
        max=list[0]
        for x in range(1,len(list)):
            if list[x]>max:
                max=list[x]
        return max
    else:
        return False
print(maximum([5,2,3,100]))
#8Create a function that takes a list and returns a dictionary that has the sumTotal, average, minimum, maximum and length of the list.
def ultimate_analysis (list):
    dic={"sumTotal":sum_total(list),"average":Average(list),"minimum":minimum(list),"maximum":maximum(list)
    ,"length":length(list)}
    return dic
print(ultimate_analysis([37,2,1,-9]))
#9Create a function that takes a list and return that list with values reversed. Do this without creating a second list. (This challenge is known to appear during basic technical interviews.)
def reverse_list(list):
    for y in range(len(list)-1,0,-1):
        for x in range(0,y):
            temp=list[x]
            list[x]=list[x+1]
            list[x+1]=temp

    return list
print(reverse_list([5,2,3,4]))




        
        

