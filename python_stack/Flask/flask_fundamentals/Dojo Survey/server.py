from flask import Flask,render_template,redirect,request,session
app=Flask(__name__)
app.secret_key = 'keep it secret, keep it safe'
@app.route('/')
def form():
    return render_template('index.html') 
@app.route('/process' , methods=['POST'])
def form1():
    session['username'] = request.form['name']
    session['location'] = request.form['dojo']
    session['lan'] = request.form['lan']
    session['comment'] = request.form['Text1']

    return redirect('/result')
@app.route('/result')
def form2():
    return render_template('show.html', name=session['username'], loc=session['location'],lan=session['lan'], com=session['comment'])

    


if __name__=="__main__":
    app.run(debug=True)   

