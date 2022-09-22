
from django.shortcuts import render,redirect
from .models import Users
def index(request):
    context={'all_users':Users.objects.all()}
    return render(request,"index.html",context)
def process(request):
    Users.objects.create(first_name=request.POST['firstName'],last_name=request.POST['lastName'], email_address=request.POST['email'],age=request.POST['age'])
    return redirect('/')



