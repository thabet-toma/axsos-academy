from flask import Flask,render_template
app=Flask(__name__)
@app.route('/')
def hello_world():
    return 'Hello World!'
@app.route('/dojo')
def dojo():
    return 'Dojo'
@app.route('/say/<name>')
def hi_name(name):
    return "hi "+ name
@app.route('/repeat/<num>/<str>')
def repeat(num,str):
    
    return (str+" ")*int(num)
if __name__=="__main__":
    app.run(debug=True)