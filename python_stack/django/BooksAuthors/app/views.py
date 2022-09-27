from django.shortcuts import render,redirect
from .models import *
def showBook(request):
    context={
        'all_books':Books.objects.all()
    }
    return render(request,'addBook.html',context)
def addBook(request):
    Books.objects.create(title=request.POST['title'],desc=request.POST['desc'])
    return redirect('/')
def views(request,id):
    context={
    'book':Books.objects.get(id=int(id)),
    'author':Authors.objects.all()
    }
    return render(request,"showbook.html",context)
def add_book_to_author(request,id):
        Books.objects.get(id=id).Authors.add(Authors.objects.get(id=request.POST['author']))
        return redirect('/views' +'/'+str(id))
def showAuthor(request):
    context={
        'all_author':Authors.objects.all()
    }
    return render(request,'addAuthor.html',context)
def addAuthor(request):
    Authors.objects.create(first_name=request.POST['first_name'],last_name=request.POST['last_name'],notes=request.POST['notes'])
    return redirect('/author')
def viewsAuthor(request,id):
    context={
    'book':Books.objects.all(),
    'author':Authors.objects.get(id=int(id))
    }
    return render(request,"showAuthor.html",context)
def add_author_to_book(request,id):
    Authors.objects.get(id=id).books.add(Books.objects.get(id=request.POST['book']))
    return redirect('/views/author'+'/'+str(id))







# Create your views here.
