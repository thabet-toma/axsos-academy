from multiprocessing import context
from django.shortcuts import render,redirect
from django.shortcuts import render
from time import gmtime, strftime
import random


def index(request):
    
    
    
    if request.session['x']==None:
        request.session['x']=""

    return render(request,"index.html") 
def process(request,loc):
    x= strftime("%B %d %Y %H:%M %p", gmtime())
    op=['+','-']
    rop=random.choice(op)
    
    
    
    if loc=='Quest':
        
        if 'loc' in request.session:
            if rop==op[0]:

                request.session['loc'].append([loc,random.randint(0, 50),'earned',x])
            elif rop==op[1]:
                request.session['loc'].append([loc,random.randint(0, 50),'lost',x])
        else:
            request.session['loc']=[['','','']]
        
    else: 
        if 'loc' in request.session:
            request.session['loc'].append([loc,random.randint(10,20),'earned',x])
        else:
            request.session['loc']=[['','','']]
    request.session.save()
    if loc=='Quest':
        
        if rop==op[0]:
            request.session['x']+=request.session['loc'][-1][1]
        elif rop==op[1]:
            request.session['x']-=request.session['loc'][-1][1]
    else:
        request.session['x']+=request.session['loc'][-1][1]




    return redirect('/')


