from flask import Flask ,render_template
app=Flask(__name__)
@app.route('/')
def board(row=8,colum=8):
    return render_template("index.html",row1=row,colum1=int(colum))
@app.route('/4')
def board4(row=8,colum=4):
    return render_template("index.html",row1=row,colum1=int(colum))
@app.route('/<row>/<colum>')
def boardv(row,colum):
    # print(int(colum/2), type(int(colum/2)))
    
    return render_template("index.html",row1=int(row),colum1=int(colum))
if __name__=="__main__":
    app.run(debug=True)


