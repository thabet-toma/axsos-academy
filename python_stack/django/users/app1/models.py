from venv import create
from django.db import models
class Users(models.Model):
    first_name=models.CharField(max_length=255)
    last_name=models.CharField(max_length=255)
    email_address=models.CharField(max_length=255)
    age=models.IntegerField()
    created_at=models.DateTimeField(auto_now_add=True)
    created_at=models.DateTimeField(auto_now=True)



# Create your models here.
