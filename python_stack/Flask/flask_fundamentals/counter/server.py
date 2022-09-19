from flask import Flask,render_template,session,redirect
app=Flask(__name__)
app.secret_key = 'keep it secret, keep it safe'

@app.route('/')
def count1():
    if 'count' in session:
        session['count']+=1
    else:
        session['count']=1

    return render_template('index.html',num=(session['count']))
@app.route('/destroy_session')
def delete():
    	
    session.pop('count')	
    return redirect('/')
@app.route('/increment')
def increase():
    session['count']+=1
    
    return redirect('/')
@app.route('/reset')
def reset():
    session.pop('count')

    return redirect('/')

    
if __name__=="__main__":
    app.run(debug=True)    

