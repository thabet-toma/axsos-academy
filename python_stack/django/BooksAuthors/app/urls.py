from django.urls import path,include
from . import views

urlpatterns = [
    path('', views.showBook),
    path('addBook', views.addBook),
    path('views/<int:id>', views.views),
    path('add_book_to_author/<int:id>/', views.add_book_to_author),
    path('author', views.showAuthor),
    path('addAuthor', views.addAuthor),
    path('views/author/<int:id>', views.viewsAuthor),
    path('add_author_to_book/<int:id>/', views.add_author_to_book),]

