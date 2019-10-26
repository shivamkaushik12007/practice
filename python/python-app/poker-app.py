from flask import Flask,render_template

app = Flask(__name__)

@app.route('/')
def welcome():
    card1='20.png'
    card2='20.png'
    card3='20.png'
    card4='20.png'
    card5='20.png'
    cards=[card1, card2, card3, card4, card5]
    return render_template("home.html",user1_card=cards)


if __name__ == '__main__':
    print(app.config)
    app.config['DEBUG'] = True
    app.run()
