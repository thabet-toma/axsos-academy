from multiprocessing import context
from django.shortcuts import render,redirect
from django.shortcuts import render
from time import gmtime, strftime
import random


def index(request):
    
    
    
    if request.session['x']==None:
        request.session['x']=""
    # if amount1gold10 and amount1gold50:
    #     amount1=zip(request.session['loc10'],amount1gold10)
    #     amount2=zip(request.session['loc50'],amount1gold50)

    #     context={
    #     'amount1':amount1,
    #     'amount2':amount2}
    # else:
    #     context={}   
    return render(request,"index.html") 
def process(request):
    x= strftime("%B %d %Y %H:%M %p", gmtime())
    op=['+','-']
    rop=random.choice(op)
    
    # global amount1gold10
    # amount1gold10.append(random.randint(10, 20))
    # global amount1gold50
    # amount1gold50.append(random.randint(0, 50))
    
    if request.POST['which_form']=='quest':
        
        if 'loc' in request.session:
            if rop==op[0]:

                request.session['loc'].append([request.POST['which_form'],random.randint(0, 50),'earned',x])
            elif rop==op[1]:
                request.session['loc'].append([request.POST['which_form'],random.randint(0, 50),'lost',x])
        else:
            request.session['loc']=[['','','']]
        
    else: 
        if 'loc' in request.session:
            request.session['loc'].append([request.POST['which_form'],random.randint(10,20),'earned',x])
        else:
            request.session['loc']=[['','','']]
    request.session.save()
    if request.POST['which_form']=='quest':
        
        if rop==op[0]:
            request.session['x']+=request.session['loc'][-1][1]
        elif rop==op[1]:
            request.session['x']-=request.session['loc'][-1][1]
    else:
        request.session['x']+=request.session['loc'][-1][1]


    #     if 'loc50' in request.session:
    #         request.session['loc50'].append( [request.POST['which_form']])
    #         request.session.save()
    #     else:
    #         request.session['loc50']=[]
    # else:
    #     if 'loc10' in request.session:
    #         request.session['loc10'].append( [request.POST['which_form']])
    #         request.session.save()
    #     else:
    #         request.session['loc10']=[]

        
    

    return redirect('/')


