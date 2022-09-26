from django.urls import path,include
from . import views

urlpatterns = [
    path('', views.index),
    path('addDo', views.adddoj),
    path('addni', views.addnin),
    path('delete', views.delete),

]