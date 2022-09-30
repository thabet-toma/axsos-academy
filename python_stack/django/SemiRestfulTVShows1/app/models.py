# Inside your app's models.py file
from django.db import models
from time import gmtime, strftime


# Our custom manager!
# No methods in our new manager should ever receive the whole request object as an argument! 
# (just parts, like request.POST)
class ShowsManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}

        if len(postData['title']) < 3:
            errors["title"] = "Blog name should be at least 2 characters"
        if len(postData['network']) < 4:
            errors["network"] = "network name  should be at least 3 characters"
        
        if len(postData['desc']) >0 and len(postData['desc'])<11:
            errors["desc"] = "Blog description should be at least 10 characters"
        x=postData['date']
        y=(x[0:4])
        y1=x[0]+x[1]+x[2]+x[3]
        m=x[5]+x[6]
        d=x[8]+x[9]
        if  int(y1)> int(strftime ("%Y")):
            errors["date"] = "date description should be at least 10 characters"
        if int(m)> int(strftime ("%m")):
            errors["date"] = "date description should be at least 10 characters"
        if int(d)>int(strftime ("%d")):
                errors["date"] = "invalid date "
            
        return errors


    


class Shows(models.Model):
    title=models.CharField(max_length=245)
    network=models.CharField(max_length=255)
    release_date=models.DateField(blank=True)
    description=models.TextField()
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)
    objects= ShowsManager()

# Create your models here.


# Create your models here.
