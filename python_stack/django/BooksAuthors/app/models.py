from enum import auto
from django.db import models
class Books(models.Model):
    title=models.CharField(max_length=255)
    desc=models.TextField()
    created_at=models.DateField(auto_now_add=True)
    updated_at=models.DateField(auto_now=True)
class Authors(models.Model):
    first_name=models.CharField(max_length=255)
    last_name=models.CharField(max_length=255)
    books=models.ManyToManyField(Books,related_name='Authors')
    notes=models.TextField()
    created_at=models.DateField(auto_now_add=True)
    updated_at=models.DateField(auto_now=True)

# Create your models here.
