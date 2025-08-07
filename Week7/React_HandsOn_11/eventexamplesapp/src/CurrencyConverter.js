import React, { useState } from "react";

function CurrencyConverter() {
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    if (currency.toLowerCase() === "euro") {
      const euroAmount = parseFloat(amount) * 80; // Example rate
      alert(`Converting to Euro Amount is ${euroAmount}`);
    } else {
      alert("Unsupported currency");
    }
  };

  return (
    <div>
      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount: </label>
          <input
            type="text"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>
        <div>
          <label>Currency: </label>
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConverter;
