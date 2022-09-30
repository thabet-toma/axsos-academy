from django.shortcuts import render,redirect
from .models import *
from django.contrib import messages
def root(request):
    return redirect('shows/')
def indexAdd(request):
    return render(request,'add.html')
def add(request):
    errors=Shows.objects.basic_validator(request.POST)
    if len(errors)>0:
        for key, value in errors.items():
            messages.error(request,value)
            
            
        print('44444444444444444444444444444444444',(type(request.POST['date'])), type(strftime("%Y-%d-%m")))
        return redirect ('shows/news')
    else:
        Shows.objects.create(title=request.POST['title'],network=request.POST['network'],release_date=request.POST['date'],description=request.POST['desc'])
        return redirect('/shows/'+str(Shows.objects.get(title=request.POST['title']).id))
def showDetail(request,id):
    context={'show':Shows.objects.get(id=id)}
    return render(request,'showDetail.html',context)
def showAll(request):
    context={'all':Shows.objects.all()}
    return render(request,'ShowAll.html',context)
def edit(request,id):
    context={'show':Shows.objects.get(id=id)}
    return render(request,'edit.html',context)
def editProc(request,id):
    errors=Shows.objects.basic_validator(request.POST,)
    if len(errors)>0:
        for key, value in errors.items():
            messages.error(request,value)
            
            
        print('*******************',len(type(request.POST['date'])))
        return redirect ('/shows/'+str(id)+'/edit')
    else:
        x=Shows.objects.get(id=id)
        x.title=request.POST['title']
        x.network=request.POST['network']
        x.release_date=request.POST['date']
        x.description=request.POST['desc']
        x.save()
        return redirect('/shows/'+str(x.id))
def delete(request,id):
    a=Shows.objects.get(id=id)
    a.delete()
    return redirect('/shows/')

# Create your views here.


# Create your views here.
