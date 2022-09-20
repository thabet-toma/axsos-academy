from django.shortcuts import render,redirect,HttpResponse
from django.http import JsonResponse

def root(request):
    return redirect('/blogs')
def index(request):
    return HttpResponse('placeholder to later display a list of all blogs')
def new(request):
    return HttpResponse('placeholder to display a new form to create a new blog')
def create(request):
    return redirect('/')
def edit(request,number):
    return HttpResponse(f"placeholder to edit blog:{str(number)}")
def destroy(request,number):
   return redirect('/blogs')
def json(request):
    return JsonResponse({"title": "my first blog", "content":" hi world "})



