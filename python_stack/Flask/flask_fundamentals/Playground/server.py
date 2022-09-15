from flask import Flask, render_template
app=Flask(__name__)
@app.route('/')
def nice_blok(x=3,color="#9ec5f8"):
    return render_template("index3.html",num=int(x),color1=color)

@app.route('/play/<x>')
def play(x,color="#9ec5f8"):
    return render_template("index3.html",num=int(x),color1=color)
@app.route('/play/<x>/<color>')
def play_color(x,color):
    return render_template("index3.html",num=int(x),color1=color)
if __name__=="__main__":
    app.run(debug=True)

