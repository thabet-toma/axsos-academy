from django.shortcuts import render
import random 	 
	



def index(request):
    request.session['x']=random.randint(1, 100)
    return render(request,'index.html')
def guess(request):
    p=0
   
    
    if int(request.POST['text'])==request.session['x']:
        p= f"{request.session['x']} was the number"
    elif int(request.POST['text'])> request.session['x']+50 :
        p="Tow height"
    elif int(request.POST['text'])> request.session['x']+25 :
        p="a little height"
    elif int(request.POST['text'])> request.session['x']+12 :
        p="height but close "
    elif int(request.POST['text'])> request.session['x'] :
        p="height but tow close"
    elif int(request.POST['text'])< request.session['x']-50 :
        p="tow low "
    elif int(request.POST['text'])< request.session['x']-25 :
        p="low "
    elif int(request.POST['text'])< request.session['x']-12 :
        p=" a little low "
    elif int(request.POST['text'])< request.session['x'] :
        p=" low but tow close "
    context={
        'p1':p,
        'x1':request.session['x'],
        'num':int(request.POST['text']),}
    return render(request,'index.html',context)


    

