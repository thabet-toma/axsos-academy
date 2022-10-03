from email import message
from django.shortcuts import redirect, render

from app.models import *
def wall(request):
    context={'msgs':Messages.objects.all(),
    'user':Users.objects.get(id=request.session['Uid']),
    'comments':comments.objects.all()
    }
    return render(request,'wall.html',context)
def post(request):
    user=Users.objects.get(first_name=request.session['user'])
    login=user[0]
    Messages.objects.create(message=request.POST['post'],user=login)
    return redirect('/wall')
def comment(request):
    user=Users.objects.filter(first_name=request.session['user'])
    user1=user[0]
    message=Messages.objects.get(message=request.POST['com'])
    

    comment=comments.objects.create(comment=request.POST['comment'],user=user1,message=message)
    return redirect('/wall')







# Create your views here.
