x = [ [5,2,3], [10,8,9] ] 
students = [
     {'first_name':  'Michael', 'last_name' : 'Jordan'},
     {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]

x[1][0]=15
print(x)
students[0]["last_name"]="Bryant"
print (students[0])
sports_directory["soccer"][0]="Andres"
print(sports_directory)
z[0]["y"]=30
print(z)
#2
def iterateDictionary(list):
    for x in range(0,len(list)):
        print(f"first_name-{list[x]['first_name']},last_name-{list[x]['last_name']}")

students= [
         {'first_name':  'thabet', 'last_name' : 'Jordan'},
         {'first_name' : 'John', 'last_name' : 'Rosales'},
         {'first_name' : 'Mark', 'last_name' : 'Guillen'},
         {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]
iterateDictionary(students) 
# should output: (it's okay if each key-value pair ends up on 2 separate lines;
# bonus to get them to appear exactly as below!)


#3
def iterateDictionary2(key_name, some_list):
    for x in range(0,len(some_list)):
        print(some_list[x][key_name])
iterateDictionary2('first_name', students)
#4
def printInfo(dict) :
    res = list(dict.keys())
    for x in range(0,len(res)):
        count=0
        for y in range(0,len(dict[res[x]])):
            count=count+1
        print(count,res[x])
        for y in range(0,len(dict[res[x]])):
            print((dict[res[x]][y]))
dojo = {
   'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
   'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}
printInfo(dojo)





    
