#1-print all integers from 0 to 50 
for x in range(151):
    print(x)
#2-Print all the multiples of 5 from 5 to 1,000 
for x in range(5,1001):
    if x%5==0:
        print(x)
#3-Print integers 1 to 100. If divisible by 5, print "Coding" instead. If divisible by 10, print "Coding Dojo".
for x in range(1,101):
    if x%10==0:
        print("Coding Dojo")
    elif x%5==0:
        print(" Dojo")
    else:
        print(x)
#4 Add odd integers from 0 to 500,000, and print the final sum.
count=0
for x in range(500000):

    if x%2==1:
        count=count+x
print(count)
#5  Print positive numbers starting at 2018, counting down by fours.
for x in range(2018,0,-4):
    print(x)
#6 Set three variables: lowNum, highNum, mult. Starting at lowNum and going through highNum, print only the integers that are a multiple of mult
lowNum=2
highNum=9
mult=3
for x in range(lowNum,highNum+1):
    if x% mult==0:
        print(x)






 



