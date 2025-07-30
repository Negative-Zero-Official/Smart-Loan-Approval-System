from flask import Flask, request, jsonify
import joblib
import pandas as pd

app = Flask(__name__)

model = joblib.load("ml_model\\loan_model.pkl")
model_columns = joblib.load("ml_model\\model_columns.pkl")

@app.route("/predict", methods=['POST'])
def predict():
    try:
        data = request.get_json()
        input_df = pd.DataFrame([data], columns=model_columns)

        prediction = model.predict(input_df)[0]
        return jsonify({
            "prediction" : int(prediction),
            "status" : "Approved" if prediction == 1 else "Rejected"
        })
    except Exception as e:
        return jsonify({"error" : str(e)})

if __name__ == "__main__":
    app.run(debug=True, port=5000)