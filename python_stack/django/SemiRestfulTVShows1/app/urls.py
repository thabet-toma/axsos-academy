from django.urls import path,include
from . import views

urlpatterns = [
    path('', views.root),
    path('shows/news', views.indexAdd),
    path('addProcess',views.add),
    path('shows/<int:id>',views.showDetail),
    path('shows/',views.showAll),
    path('shows/<int:id>/edit',views.edit),
    path('EditProcess/<int:id>',views.editProc),
    path('shows/<int:id>/destroy',views.delete),
]
