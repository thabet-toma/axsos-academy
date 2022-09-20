from django.shortcuts import render

def index(request):
    return render(request,'index.html')
def process(request):
    con = { 'name':request.POST['name'],
    'loc':request.POST['dojo'],
    'lan':request.POST['lan'],
    'com':request.POST['Text1']}
    return render(request,'show.html',con)
    
